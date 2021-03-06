package ong.eu.soon.mobile.client.utils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.http.client.RequestBuilder.Method;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Random;

public class DigestHelper {
	private static final String[] EMPTY_STRING_ARRAY = new String[0];


	/**
	 * The Authorization header Once the response hash is calculated, the app
	 * can build the Authorization HTTP header that must be used tosend the
	 * authenticated HTTP request. The Authorization header must be prefixed by
	 * the "Digest" string, and is built up of the following pieces: username:
	 * the username supplied by the user realm: same value sent by the server
	 * nonce: same value sent by the server uri: the URI that the client is
	 * accessing \ opaque: same value sent by the server qop: same value sent by
	 * the server nc: a hex number that must be increased by the client for each
	 * request cnonce: a random string generated by the client response: the
	 * hash computed by the client starting from the WWW-Authenticate header
	 * sent by the server
	 * 
	 * @param nonce
	 * @param qop
	 * @param opaque
	 * @param username 
	 * @param realmName 
	 * @param httpMethod 
	 * @param path 
	 * @param password 
	 * @param nc 
	 * @param path 
	 * @return authorizationHeader
	 */
	protected static String createAuthorizationHeader(String nonce, String qop,
			String opaque, String username, String realmName, String httpMethod,  String password, int nc, String path) {

		String ha1 = new String(DigestUtils.md5Hex(username + ":" + realmName
				+ ":" + password));
		String ha2 = DigestUtils.md5Hex(httpMethod + ":" + path);

		String cnonce = Integer.toString(Math.abs(Random.nextInt()));
		String ncvalue = Integer.toHexString(nc++);

		StringBuffer digest = new StringBuffer();
		digest.append(ha1).append(":").append(nonce).append(":")
				.append(ncvalue).append(":").append(cnonce).append(":");
		digest.append(qop).append(":").append(ha2);

		String response = DigestUtils.md5Hex(digest.toString());

		StringBuffer authorizationHeader = new StringBuffer();
		authorizationHeader.append("Digest username=\"").append(username)
				.append("\"+ , realm=\"");
		authorizationHeader.append(realmName).append("\", nonce=\"")
				.append(nonce).append("\",");
		authorizationHeader.append(" uri=\"").append(path)
				.append("\", cnonce=\"").append(cnonce);
		authorizationHeader.append("\", nc=").append(ncvalue)
				.append(", response=\"").append(response);
		authorizationHeader.append("\", qop=").append(qop)
				.append(", opaque=\"").append(opaque).append("\"");

		return authorizationHeader.toString();

	}
	protected String getAuthorizationHeader(Response response, String username,String password,String httpmethod,String path, int nc) {
		// Parse WWW-Authenticate header from response
		// realm: identifies the realm the user should authenticate to
		// qop: identifies the quality of protection - can assume different
		// values, but the most widely used is auth
		// nonce: a randomly generated unique string
		// opaque: another random string
		String authorizationHeader = null;
		if (response.getStatusCode() == Response.SC_UNAUTHORIZED) {

			String header = response.getHeader("WWW-Authenticate");

			if (header != null && header.startsWith("Digest ")) {
				String section212response = header.substring(7);
				String[] headerEntries = splitIgnoringQuotes(
						section212response, ',');
				Map<String, String> headerMap = splitEachArrayElementAndCreateMap(
						headerEntries, "=", "\"");

				username = headerMap.get("username");
				String realmName = headerMap.get("realm");
				String nonce = headerMap.get("nonce");

				String qop = headerMap.get("qop"); // RFC 2617 extension
				String opaque = headerMap.get("opaque"); // RFC 2617 extension
				authorizationHeader = createAuthorizationHeader(nonce, qop,
						opaque, username, realmName, httpmethod, password, nc, path);
			}
		}
		return authorizationHeader;
	}
	private Map<String, String> splitEachArrayElementAndCreateMap(
			String[] array, String delimiter, String removeCharacters) {
		if ((array == null) || (array.length == 0)) {
			return null;
		}

		Map<String, String> map = new HashMap<String, String>();

		for (String s : array) {
			String postRemove;

			if (removeCharacters == null) {
				postRemove = s;
			} else {
				postRemove = replace(s, removeCharacters, "");
			}

			String[] splitThisArrayElement = split(postRemove, delimiter);

			if (splitThisArrayElement == null) {
				continue;
			}

			map.put(splitThisArrayElement[0].trim(),
					splitThisArrayElement[1].trim());
		}

		return map;
	}

	private String[] splitIgnoringQuotes(String str, char separatorChar) {
		if (str == null) {
			return null;
		}

		int len = str.length();

		if (len == 0) {
			return EMPTY_STRING_ARRAY;
		}

		List<String> list = new ArrayList<String>();
		int i = 0;
		int start = 0;
		boolean match = false;

		while (i < len) {
			if (str.charAt(i) == '"') {
				i++;
				while (i < len) {
					if (str.charAt(i) == '"') {
						i++;
						break;
					}
					i++;
				}
				match = true;
				continue;
			}
			if (str.charAt(i) == separatorChar) {
				if (match) {
					list.add(str.substring(start, i));
					match = false;
				}
				start = ++i;
				continue;
			}
			match = true;
			i++;
		}
		if (match) {
			list.add(str.substring(start, i));
		}

		return list.toArray(new String[list.size()]);
	}

	private String[] split(String toSplit, String delimiter) {

		if (delimiter.length() != 1) {
			throw new IllegalArgumentException(
					"Delimiter can only be one character in length");
		}

		int offset = toSplit.indexOf(delimiter);

		if (offset < 0) {
			return null;
		}

		String beforeDelimiter = toSplit.substring(0, offset);
		String afterDelimiter = toSplit.substring(offset + 1);

		return new String[] { beforeDelimiter, afterDelimiter };
	}

	private String replace(String text, String repl, String with, int max) {
		if (text == null || isEmpty(repl) || with == null || max == 0) {
			return text;
		}
		StringBuffer buf = new StringBuffer(text.length());
		int start = 0, end = 0;
		while ((end = text.indexOf(repl, start)) != -1) {
			buf.append(text.substring(start, end)).append(with);
			start = end + repl.length();

			if (--max == 0) {
				break;
			}
		}
		buf.append(text.substring(start));
		return buf.toString();
	}

	private String replace(String text, String repl, String with) {
		return replace(text, repl, with, -1);
	}

	private boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
