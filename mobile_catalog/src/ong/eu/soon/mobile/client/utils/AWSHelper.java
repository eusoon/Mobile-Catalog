package ong.eu.soon.mobile.client.utils;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;
import com.googlecode.cryptogwt.emul.java.security.GeneralSecurityException;
import com.googlecode.cryptogwt.emul.java.security.InvalidKeyException;
import com.googlecode.cryptogwt.emul.java.security.NoSuchAlgorithmException;
import com.googlecode.cryptogwt.emul.javax.crypto.Mac;
import com.googlecode.cryptogwt.emul.javax.crypto.spec.SecretKeySpec;

public class AWSHelper {
	 private static final int DEFAULT_ENCRYPTION_STRENGTH = 128;
	private static final String ENCODING_FOR_ENCRYPTION = "UTF-8";
	public static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	public static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
	public static final String HMAC_MD5_ALGORITHM = "HmacMD5";
	public static final String NAME = "AWS";
	public static final String AWSAccessKeyId = "AKIAIOSFODNN7EXAMPLE";//api key
	public static final String AWSSecretAccessKey="wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";//Private Key

	public static String calculateRFC2104HMAC(String data, String key, String algorithm) throws GeneralSecurityException {
		try {
            // get an hmac_sha1 key from the raw key bytes
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(ENCODING_FOR_ENCRYPTION), algorithm);

            // get an hmac_sha1 Mac instance and initialize with the signing key
            Mac mac = Mac.getInstance(algorithm);
            mac.init(signingKey);

            // compute the hmac on input data bytes
            byte[] rawHmac = mac.doFinal(data.getBytes(ENCODING_FOR_ENCRYPTION));

            // base64-encode the hmac
            return Base64.encode(rawHmac.toString());

        } catch (InvalidKeyException ex) {
            throw new GeneralSecurityException("Failed to generate HMAC: " + ex.getMessage(), ex);
        } catch (NoSuchAlgorithmException ex) {
            throw new GeneralSecurityException(HMAC_SHA1_ALGORITHM +
                    " algorithm is not supported", ex);
        } catch (IllegalStateException e) {
        	 throw new GeneralSecurityException(
                     " Illegal state exception", e);
		} catch (UnsupportedEncodingException e) {
			 throw new GeneralSecurityException(
	                    "Unsupported encoding exception", e);
		}
	}
	public static String getCanonicalizedAmzHeaders(Map<String, String> headers) {
		// 1 & 2, Compose lowercase, sorted map of x-amz headers
		TreeMap<String, String> xamzMap = new TreeMap<String, String>();
		for (String key : headers.keySet()) {
			if (key.toLowerCase().startsWith("x-amz-")) {
				xamzMap.put(key.toLowerCase(), headers.get(key));
			}
		}
		
		// 3: Combine like headers (e.g. x-amz-common: val1,val2)
		// No. Map<String, List<String>> isn't happening.
		
		// 4: Unfold long headers that span multiple lines
		// No. Don't send in long header lines.
		
		// 5 & 6: Construct final string
		StringBuilder sb = new StringBuilder();
		for (String key : xamzMap.keySet()) {
			sb.append(key).append(':').append(xamzMap.get(key)).append('\n');	// TODO: include newline on last header?
		}
		return sb.toString();
	}
	 /**
	     * Returns the canonicalized resource.
	     *
	     * @param uri
	     *            The resource uri
	     * @param hostName
	     *            the host name
	     * @return The canonicalized resource.
	     */
	    public static String getCanonicalizedResource(String uri, String hostName) {
	        StringBuilder sb = new StringBuilder();

	        // Append the bucket if there is one
	        if (hostName != null) {
	            // If the host name contains a port number remove it
	            if (hostName.contains(":"))
	                hostName = hostName.substring(0, hostName.indexOf(":"));

	            // Now extract the bucket if there is one
	            if (hostName.endsWith(".s3.amazonaws.com")) {
	                String bucketName = hostName.substring(0, hostName.length() - 17);
	                sb.append("/" + bucketName);
	            }
	        }

	        int queryIdx = uri.indexOf("?");

	        // Append the resource path
	        if (queryIdx >= 0)
	            sb.append(uri.substring(0, queryIdx));
	        else
	            sb.append(uri.substring(0, uri.length()));

	        // Append the AWS sub-resource
	        if (queryIdx >= 0) {
	            String query = uri.substring(queryIdx - 1, uri.length());

	            if (query.contains("?acl"))
	                sb.append("?acl");
	            else if (query.contains("?location"))
	                sb.append("?location");
	            else if (query.contains("?logging"))
	                sb.append("?logging");
	            else if (query.contains("?torrent"))
	                sb.append("?torrent");
	        }

	        return sb.toString();
	    }
	    public String encodePassword(String rawDataToBeEncrypted, String salt, String algorithm) throws GeneralSecurityException {
	        byte[] hmacData = null;
	        if(rawDataToBeEncrypted != null){
		        try {
		            SecretKeySpec secretKey = new SecretKeySpec(rawDataToBeEncrypted.getBytes(ENCODING_FOR_ENCRYPTION), algorithm);
		            Mac mac = Mac.getInstance(algorithm);
		            mac.init(secretKey);
		            hmacData = mac.doFinal(salt.getBytes(ENCODING_FOR_ENCRYPTION));
	
	                return new String(Base64.encode(hmacData.toString()));
		           
	
		        }
		        catch(InvalidKeyException ike){
		            throw new GeneralSecurityException("Invalid Key while encrypting.", ike);
		        }
		        catch (UnsupportedEncodingException e) {
		            throw new GeneralSecurityException("Unsupported Encoding while encrypting.",e);
		        } catch (NoSuchAlgorithmException e) {
		        	throw new GeneralSecurityException("Invalid algorithm while encrypting.",e);
				}
	        }
	        return "";

	    }
	    private static boolean equals(String expected, String actual) {
	        byte[] expectedBytes = null;
	        byte[] actualBytes = null;
	        try {
	            expectedBytes = expected.getBytes(ENCODING_FOR_ENCRYPTION);
	            actualBytes = actual.getBytes(ENCODING_FOR_ENCRYPTION);
	        } catch (UnsupportedEncodingException e) {
	            throw new RuntimeException("Unsupported Encoding while encrypting.",e);
	        }

	        int expectedLength = expectedBytes == null ? -1 : expectedBytes.length;
	        int actualLength = actualBytes == null ? -1 : actualBytes.length;
	        if (expectedLength != actualLength) {
	            return false;
	        }

	        int result = 0;
	        for (int i = 0; i < expectedLength; i++) {
	            result |= expectedBytes[i] ^ actualBytes[i];
	        }
	        return result == 0;
	    }
}
