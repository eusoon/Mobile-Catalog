package ong.eu.soon.security.web.authentication;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.crypto.codec.Base64;


public class AWSHelper extends BasicHelper {
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	public static final String AWS = "AWS";
	public static final String AWSAccessKeyId = "AKIAIOSFODNN7EXAMPLE";// username
	public static final String PUBLIC_KEY = "MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZp;RV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGARBu0g4MdHVhU6NoSXMKDBFSX9KfkTwIOXM6GY3DhAWsQhejkAkxp8c0IpkKn+i+PQNM/2pntXLWxDGHQGhfJIwvP041SrRTCXtx8SJ59ima8Z6/my7N72pPvbeDcPjlshtp/oa6eHh9M4J18W5hI4HD6I6f4qnppP1rRYaZolhw=";

	public static String calculateRFC2104HMAC(String data, String key) throws GeneralSecurityException {
		try {

			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);

			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);

			// compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(data.getBytes());

			// base64-encode the hmac
			return Base64.encode(rawHmac).toString();

		} catch (InvalidKeyException ex) {
			throw new GeneralSecurityException("Failed to generate HMAC: " + ex.getMessage(), ex);
		} catch (NoSuchAlgorithmException ex) {
			throw new GeneralSecurityException(HMAC_SHA1_ALGORITHM +
					" algorithm is not supported", ex);
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
	public static String getCanonicalizedResource(String uri, String hostName1) {
		StringBuilder sb = new StringBuilder();
		String hostName = hostName1;
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

	public static String getPublicKey(String apiKey) {
		if (apiKey.equals(AWSHelper.AWSAccessKeyId)) {
			return HMACHelper.PUBLIC_KEY;
		}
		return null;
	}

	public static boolean validateSignature(String toSign, String hmac,
			String awsAccessKeyId) throws InvalidKeyException, Exception {

		String publicKey = HMACHelper.getPublicKey(awsAccessKeyId);
		if (publicKey == null)
			return false;
		Signature signature = Signature.getInstance("SHA-1");
		signature.initVerify(decodePublicKey(publicKey));
		signature.update(toSign.getBytes());
		return signature.verify(Base64.decode(hmac.getBytes()));

	}

	private static PublicKey decodePublicKey(String publicKey) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance("SHA-1");
		byte[] publicKeyBytes = Base64.decode(publicKey.getBytes());
		EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
		return keyFactory.generatePublic(publicKeySpec);
	}
}
