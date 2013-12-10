package ong.eu.soon.mobile.client.utils;



import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.googlecode.cryptogwt.emul.java.security.GeneralSecurityException;
import com.googlecode.cryptogwt.emul.java.security.InvalidKeyException;
import com.googlecode.cryptogwt.emul.java.security.NoSuchAlgorithmException;
import com.googlecode.cryptogwt.emul.javax.crypto.Mac;
import com.googlecode.cryptogwt.emul.javax.crypto.spec.SecretKeySpec;
import com.googlecode.gwt.crypto.bouncycastle.AsymmetricBlockCipher;
import com.googlecode.gwt.crypto.bouncycastle.InvalidCipherTextException;
import com.googlecode.gwt.crypto.bouncycastle.engines.RSAEngine;
import com.googlecode.gwt.crypto.bouncycastle.params.RSAKeyParameters;


public class SignatureHelper {

	public static final String APIKEY_HEADER = "apikey";
	public static final String TIMESTAMP_HEADER = "timestamp";
	public static final String SIGNATURE_HEADER = "signature";
	
	public static final List<String> SIGNATURE_KEYWORDS = Arrays.asList(APIKEY_HEADER, TIMESTAMP_HEADER);

	private static final String ALGORITHM = "DSA";
	
	public static final String APIKEY = "api-1234";
	public static final String SALT_HEADER = "salt";
	public static final String SALT = "hmaciscool";
	
	public static String createSignature() {
		 String generateHmacSHA256Signature = null;
         try {
			generateHmacSHA256Signature = generateHmacSHA256Signature(SALT, APIKEY);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
         return generateHmacSHA256Signature;
	}

	private static String generateHmacSHA256Signature(String data,
			String key) throws GeneralSecurityException  {
		byte[] hmacData = null;
		 
        try {
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKey);
            hmacData = mac.doFinal(data.getBytes("UTF-8"));
            return new String(Base64.encode(hmacData.toString()).getBytes(), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
        	  GWT.log("Unsupported Encoding!");
        	throw new GeneralSecurityException(e);
		} catch (NoSuchAlgorithmException e) {
			 GWT.log("No such algorithm!");
			throw new GeneralSecurityException(e);
		} catch (InvalidKeyException e) {
			 GWT.log("Invalid key!");
			throw new GeneralSecurityException(e);
		}
	}
	
	public static String encryptRSASignature(String data,
			 String modulus, String pubExp) throws GeneralSecurityException  {
		BigInteger modProd=new BigInteger(modulus.getBytes());
		BigInteger pubExpProd=new BigInteger(pubExp.getBytes());
		RSAKeyParameters pubParametersProd = new RSAKeyParameters(false, modProd, pubExpProd);
		AsymmetricBlockCipher   eng = new RSAEngine();
		eng.init(true, pubParametersProd);
		byte[] sign=null;
		try {
			sign = eng.processBlock(data.getBytes(), 0, data.getBytes().length);
		} catch (InvalidCipherTextException e) {
			throw new GeneralSecurityException(e);
		}
		 return sign.toString();
	}
	public static String decryptRSASignature(String sign,
			 String modulus, String privateExp) throws GeneralSecurityException  {
		BigInteger modProd=new BigInteger(modulus.getBytes());
		BigInteger priExpProd=new BigInteger(privateExp.getBytes());
		RSAKeyParameters priParametersProd = new RSAKeyParameters(true, modProd, priExpProd);
		AsymmetricBlockCipher   eng = new RSAEngine();
		eng.init(false, priParametersProd);
		byte[] data1=null;
		try {
			data1 = eng.processBlock(sign.getBytes(), 0, sign.getBytes().length);
		} catch (InvalidCipherTextException e) {
			throw new GeneralSecurityException(e);
		}
		return new String(data1);
		
	}
}
