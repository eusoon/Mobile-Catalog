package ong.eu.soon.security.web.authentication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class PublicKeyCryptography {

	public static SecretKey generateSecretKey(String algorithm)
			throws NoSuchAlgorithmException {
		// String algorithm="AES"
		KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
		keyGen.init(128);
		SecretKey secretKey = keyGen.generateKey();
		return secretKey;
	}

	public static String encryptData(byte[] byteDataToTransmit,
			SecretKey senderSecretKey, String algorithm) {
		SymmetricEncrypt encryptUtil = new SymmetricEncrypt();
		byte[] byteCipherText = encryptUtil.encryptData(byteDataToTransmit,
				senderSecretKey, algorithm);
		String strCipherText = new Base64().encode(byteCipherText).toString();
		return strCipherText;
	}



	public static X509Certificate getReceiverX509Certificate(
			String keystorefile,
			String password, String alias) {
		X509Certificate recvcert = null;
		KeyStore ks;
		try {
			ks = getKeyStore(keystorefile, password);
			recvcert = (X509Certificate) ks.getCertificate(alias);

		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return recvcert;
	}

	private static KeyStore getKeyStore(String keystorefile, String kspassword) {
		X509Certificate recvcert = null;
		KeyStore ks = null;
		try {
			ks = KeyStore.getInstance(KeyStore.getDefaultType());
			FileInputStream fis;

			fis = new java.io.FileInputStream(keystorefile);
			ks.load(fis, kspassword.toCharArray());
			fis.close();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ks;
	}

	public static PublicKey getReceiverPublicKey(X509Certificate recvcert) {
		PublicKey receiverPublicKey = recvcert.getPublicKey();
		return receiverPublicKey;
	}

	public static String encryptSecretKey(SecretKey senderSecretKey,
			PublicKey receiverPublicKey) {
		SymmetricEncrypt encryptUtil = new SymmetricEncrypt();
		byte[] byteEncryptWithPublicKey = encryptUtil.encryptData(
				senderSecretKey.getEncoded(), receiverPublicKey,
				"RSA/ECB/PKCS1Padding");
		String strSenbyteEncryptWithPublicKey = new Base64().encode(
				byteEncryptWithPublicKey).toString();
		return strSenbyteEncryptWithPublicKey;
	}

	public static String createHashValue(byte[] byteDataToTransmit,
			String algorithm) {
		MessageDigest md;
		try {
			// algorithm="MD5"
			md = MessageDigest.getInstance(algorithm);
			md.update(byteDataToTransmit);
			byte byteMDofDataToTransmit[] = md.digest();

			String strMDofDataToTransmit = new String();
			for (byte element : byteMDofDataToTransmit) {
				strMDofDataToTransmit = strMDofDataToTransmit
						+ Integer.toHexString(element & 0xFF);
			}
			return strMDofDataToTransmit;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String getMessageToSign(SecretKey senderSecretKey,
			PublicKey receiverPublicKey, byte[] byteDataToTransmit,
			String algorithm) {
		return encryptSecretKey(senderSecretKey, receiverPublicKey) + "|"
				+ createHashValue(byteDataToTransmit, algorithm);
	}

	public static PrivateKey getSenderPrivateKey(String alias,
			String senderpassword, KeyStore ks) {
		char[] keypassword = senderpassword.toCharArray();
		PrivateKey myPrivateKey = null;
		try {
			Key myKey = ks.getKey(alias, keypassword);
			myPrivateKey = (PrivateKey) myKey;
		} catch (UnrecoverableKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myPrivateKey;
	}

	// Sign the message with the private key of the Sender
	public static byte[] signMessage(String strMsgToSign, String algorithm,
			PrivateKey myPrivateKey) {

		try {
			// algorithm="MD5withRSA"
			Signature mySign = Signature.getInstance(algorithm);
			mySign.initSign(myPrivateKey);
			mySign.update(strMsgToSign.getBytes());
			byte[] byteSignedData = mySign.sign();
			return byteSignedData;
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static PublicKey extractSenderPublicKey(KeyStore ks, String alias) {
		X509Certificate sendercert;
		try {
			sendercert = (X509Certificate) ks.getCertificate(alias);
			PublicKey pubKeySender = sendercert.getPublicKey();
			return pubKeySender;
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static boolean verifySignature(PublicKey pubKeySender,
			String strMsgToSign,
			byte[] byteSignedData, String algorithm) {
		boolean verifySign = false;
		try {
			// String algorithm="MD5withRSA"
			Signature myVerifySign = Signature.getInstance(algorithm);
			myVerifySign.initVerify(pubKeySender);
			myVerifySign.update(strMsgToSign.getBytes());
			verifySign = myVerifySign.verify(byteSignedData);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verifySign;
	}

	public static String getEncryptedSecretKey(String strMsgToSign) {
		int intindexofsep = strMsgToSign.indexOf("|");
		String strEncryptWithPublicKey = strMsgToSign.substring(0,
				intindexofsep);
		return strEncryptWithPublicKey;
	}

	public static String getHashOfData(String strMsgToSign) {
		int intindexofsep = strMsgToSign.indexOf("|");
		String strHashOfData = strMsgToSign.substring(intindexofsep + 1);
		return strHashOfData;
	}
	public static byte[] getDecryptedSymmetricKey(KeyStore ks, String alias,
			String strMsgToSign,
			String receiverpassword) {
		SymmetricEncrypt encryptUtil = new SymmetricEncrypt();
		char[] recvpassword = receiverpassword.toCharArray();
		Key recvKey;
		try {
			recvKey = ks.getKey(alias, recvpassword);
			PrivateKey recvPrivateKey = (PrivateKey) recvKey;

			int intindexofsep = strMsgToSign.indexOf("|");
			String strEncryptWithPublicKey = strMsgToSign.substring(0,
					intindexofsep);
			// Decrypting to get the symmetric key
			byte[] bytestrEncryptWithPublicKey = new Base64()
			.decode(strEncryptWithPublicKey);
			byte[] byteDecryptedSymmetricKey = encryptUtil.decryptData(
					bytestrEncryptWithPublicKey, recvPrivateKey,
					"RSA/ECB/PKCS1Padding");
			return byteDecryptedSymmetricKey;
		} catch (UnrecoverableKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String decryptData(byte[] byteDecryptedSymmetricKey,
			byte[] byteCipherText, String algorithm) {
		SymmetricEncrypt encryptUtil = new SymmetricEncrypt();
		// algorithm="AES"
		SecretKeySpec secretKeySpecDecrypted = new javax.crypto.spec.SecretKeySpec(
				byteDecryptedSymmetricKey, algorithm);
		byte[] byteDecryptText = encryptUtil.decryptData(byteCipherText,
				secretKeySpecDecrypted, algorithm);
		String strDecryptedText = new String(byteDecryptText);
		return strDecryptedText;
	}

	public static boolean computeDataMessageDigest(byte[] byteDecryptText,
			String strMsgToSign) {
		int intindexofsep = strMsgToSign.indexOf("|");
		String strHashOfData = strMsgToSign.substring(intindexofsep + 1);
		MessageDigest recvmd;
		try {
			recvmd = MessageDigest.getInstance("MD5");
			recvmd.update(byteDecryptText);
			byte byteHashOfRecvSignedData[] = recvmd.digest();

			String strHashOfRecvSignedData = new String();

			for (byte element : byteHashOfRecvSignedData) {
				strHashOfRecvSignedData = strHashOfRecvSignedData
						+ Integer.toHexString(element & 0xFF);
			}
			// 10. Validate if the Message Digest of the Decrypted Text matches
			// the Message Digest of the Original Message
			if (strHashOfRecvSignedData.equals(strHashOfData)) {
				return true;
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
