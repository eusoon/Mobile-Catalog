package ong.eu.soon.security.web.authentication;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import my.com.infopro.ibank.app.utility.Hex;

import org.apache.commons.codec.binary.Base64;

public class HMACHelper extends BasicHelper {
	public static final String API_KEY = "RS00001";
	public static final String APIKEY_HEADER = "apikey";
	public static final String PUBLIC_KEY = "MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZp;RV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGARBu0g4MdHVhU6NoSXMKDBFSX9KfkTwIOXM6GY3DhAWsQhejkAkxp8c0IpkKn+i+PQNM/2pntXLWxDGHQGhfJIwvP041SrRTCXtx8SJ59ima8Z6/my7N72pPvbeDcPjlshtp/oa6eHh9M4J18W5hI4HD6I6f4qnppP1rRYaZolhw=";

	public static String getPublicKey(String apiKey) {
		if (apiKey.equals(HMACHelper.API_KEY)) {
			return HMACHelper.PUBLIC_KEY;
		}
		return null;
	}

	public static boolean validateSignature(String url, String hmac,
			String apiKey)
					throws InvalidKeyException,
					Exception {

		String publicKey = HMACHelper.getPublicKey(apiKey);
		if (publicKey == null)
			return false;
		Signature signature = Signature.getInstance("SHA-1");
		signature.initVerify(decodePublicKey(publicKey));
		signature.update(url.getBytes());
		return signature.verify(Base64.decodeBase64(hmac));
	}

	private static PublicKey decodePublicKey(String publicKey) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance("SHA-1");
		byte[] publicKeyBytes = Base64.decodeBase64(publicKey);
		EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
		return keyFactory.generatePublic(publicKeySpec);
	}

	public static SecretKey generateHMACSHA1Key() {
		return generateSecretKey("HmacSHA1");
	}

	public static SecretKey generateHMACMD5Key() {
		return generateSecretKey("HmacMD5");
	}

	public static SecretKey generateHMACSHA256Key() {
		return generateSecretKey("HmacSHA256");
	}

	public static byte[] wrapHMACKeywith3DES(byte[] hmacKey, byte[] kek) {
		SecretKey cek = new SecretKeySpec(hmacKey, "HMAC");
		// the key encryption key to be used:
		SecretKey deskey = new SecretKeySpec(kek, "DESede");

		IvParameterSpec iv = new IvParameterSpec(new byte[8]);

		Cipher tripleDESKeyWrap = null;

		try {
			// get a TripleDES key wrap cipher:
			tripleDESKeyWrap = Cipher.getInstance("3DESWrapHMAC");
			// init with the key encryption key
			tripleDESKeyWrap.init(Cipher.WRAP_MODE, deskey, iv);
			// wrap the content encryption key:
			byte[] wrappedCek = tripleDESKeyWrap.wrap(cek);
			return wrappedCek;
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static String wrapHMACKeywith3DES(String hmacKey, String kek) {
		SecretKey cek = new SecretKeySpec(Hex.hexToByte(hmacKey), "HMAC");
		// the key encryption key to be used:
		SecretKey deskey = new SecretKeySpec(Hex.hexToByte(kek), "DESede");

		IvParameterSpec iv = new IvParameterSpec(new byte[8]);

		Cipher tripleDESKeyWrap = null;

		try {
			// get a TripleDES key wrap cipher:
			tripleDESKeyWrap = Cipher.getInstance("3DESWrapHMAC");
			// init with the key encryption key
			tripleDESKeyWrap.init(Cipher.WRAP_MODE, deskey, iv);
			// wrap the content encryption key:
			byte[] wrappedCek = tripleDESKeyWrap.wrap(cek);
			return new String(Hex.printHex(wrappedCek));
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static byte[] unwrapHMACKeywith3DES(byte[] cek, byte[] kek) {

		// the key encryption key to be used:
		SecretKey deskey = new SecretKeySpec(kek, "DESede");

		IvParameterSpec iv = new IvParameterSpec(new byte[8]);

		Cipher tripleDESKeyWrap = null;
		try {
			// get a TripleDES key wrap cipher:
			tripleDESKeyWrap = Cipher.getInstance("3DESWrapHMAC");
			// init with the key encryption key
			tripleDESKeyWrap.init(Cipher.UNWRAP_MODE, deskey, iv);
			// wrap the content encryption key:
			byte[] unwrappedHmacKey = tripleDESKeyWrap.unwrap(cek, "HmacSHA1",
					Cipher.SECRET_KEY).getEncoded();

			return unwrappedHmacKey;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
