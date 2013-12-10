package ong.eu.soon.mobile.client.utils;


import java.util.Arrays;
import java.util.List;
import com.google.gwt.http.client.RequestBuilder;
import com.googlecode.cryptogwt.emul.java.security.GeneralSecurityException;
import com.googlecode.cryptogwt.emul.java.security.MessageDigest;
import com.googlecode.cryptogwt.emul.java.security.NoSuchAlgorithmException;
import com.googlecode.cryptogwt.emul.javax.crypto.Mac;
import com.googlecode.cryptogwt.emul.javax.crypto.SecretKey;
import com.googlecode.cryptogwt.emul.javax.crypto.spec.SecretKeySpec;
import com.googlecode.gwt.crypto.bouncycastle.CipherParameters;
import com.googlecode.gwt.crypto.bouncycastle.InvalidCipherTextException;
import com.googlecode.gwt.crypto.bouncycastle.engines.DESedeWrapEngine;
import com.googlecode.gwt.crypto.bouncycastle.params.DESedeParameters;
import com.googlecode.gwt.crypto.bouncycastle.util.encoders.Hex;
import com.googlecode.gwt.crypto.client.TripleDesCipher;
import com.googlecode.gwt.crypto.client.TripleDesKeyGenerator;


public class HMACHelper {
	public static final String API_KEY = "RS00001";
	public static final String PUBLIC_KEY = "MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZp;RV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGARBu0g4MdHVhU6NoSXMKDBFSX9KfkTwIOXM6GY3DhAWsQhejkAkxp8c0IpkKn+i+PQNM/2pntXLWxDGHQGhfJIwvP041SrRTCXtx8SJ59ima8Z6/my7N72pPvbeDcPjlshtp/oa6eHh9M4J18W5hI4HD6I6f4qnppP1rRYaZolhw=";
	public static final String PRIVATE_KEY = "MIIBSwIBADCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoEFgIUOCrAiHXm+FJBM7QHMhBxanPAn3k=";

	public static final String APIKEY_HEADER = "apikey";
	public static final String TIMESTAMP_HEADER = "timestamp";
	public static final String SIGNATURE_HEADER = "signature";
	public static final List<String> SIGNATURE_KEYWORDS = Arrays.asList(
			APIKEY_HEADER, TIMESTAMP_HEADER);

	
	public static String createSignature(RequestBuilder request, 
			String privateKey, String contentToEncode, String username, String currentDate, String path) throws Exception {

		
		String verb = RequestBuilder.POST.toString();
		String contentMD5 = calculateMD5(contentToEncode);
		String toSign = verb + "\n" + contentMD5 + "\n"
				+ "application/json" + "\n" + currentDate + "\n"
				+ path;
 
		String hmac = calculateHMAC(privateKey.getBytes(), toSign.getBytes());
		return hmac;
	}
	public static String calculateMD5(String contentToEncode) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		digest.update(contentToEncode.getBytes());
		String result = new String(Base64.encode(digest.digest().toString()));
		return result;
	}
	public static String calculateHMAC(byte[] secretKey, byte[] data) throws GeneralSecurityException {
			SecretKey skey = new SecretKeySpec(secretKey, "HmacSHA1");
			Mac m = Mac.getInstance("HmacSHA1");
			m.init(skey);
			m.update(data);
			byte[] rawHmac = m.doFinal();
			String result = new String(Base64.encode(rawHmac.toString()));
			return result;	
	}
	public static byte[]  wrapHMACKeywith3DES(byte[]  hmacKey, byte[] kek ){
//		TripleDesKeyGenerator tripleDesKeyGenerator =new TripleDesKeyGenerator ();
    	// Step 1. Generate a DES key using KeyGenerator 
//    	byte[] GWT_DES_KEY = tripleDesKeyGenerator.generateNewKey();
		
		DESedeWrapEngine eng = new DESedeWrapEngine();
    	//Step 3. Initialize the Cipher for Encryption
		CipherParameters param=new DESedeParameters(kek);
		eng.init(true, param);
		byte[] wrappedHmacKey=eng.wrap(hmacKey,0,hmacKey.length);
		
		return wrappedHmacKey;
		
	}
	public static byte[]  unwrapHMACKeywith3DES(byte[]  hmacKey, byte[] kek ){
//		TripleDesKeyGenerator tripleDesKeyGenerator =new TripleDesKeyGenerator ();
    	// Step 1. Generate a DES key using KeyGenerator 
//    	byte[] GWT_DES_KEY = tripleDesKeyGenerator.generateNewKey();
		
		DESedeWrapEngine eng = new DESedeWrapEngine();
    	//Step 3. Initialize the Cipher for Encryption
		CipherParameters param=new DESedeParameters(kek);
		eng.init(false, param);
		byte[] wrappedHmacKey = null;
		try {
			wrappedHmacKey = eng.unwrap(hmacKey,0,hmacKey.length);
			return wrappedHmacKey;
		} catch (InvalidCipherTextException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wrappedHmacKey;
	}
	public static String  unwrapHMACKeywith3DES(String  hmacKey, String desKey ){
//		TripleDesKeyGenerator tripleDesKeyGenerator =new TripleDesKeyGenerator ();
    	// Step 1. Generate a DES key using KeyGenerator 
//    	byte[] GWT_DES_KEY = tripleDesKeyGenerator.generateNewKey();
		
		DESedeWrapEngine eng = new DESedeWrapEngine();
    	//Step 3. Initialize the Cipher for Encryption
		byte[] kek=Hex.decode(desKey);
		CipherParameters param=new DESedeParameters(kek);
		eng.init(false, param);
		byte[] wrappedHmacKey = null;
		byte[] key=Hex.decode(hmacKey);
		try {
			wrappedHmacKey = eng.unwrap(key,0,key.length);
			return  new String(Hex.encode(wrappedHmacKey));
		} catch (InvalidCipherTextException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
