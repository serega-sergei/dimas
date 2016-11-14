package com.example.simple_service_webapp.utils;

import java.io.IOException;

import sun.misc.BASE64Decoder;

public class AuthUtils {

	public static boolean isUserAuthenticated(String authString) {

		String decodedAuth = "";
		// Header is in the format "Basic 5tyc0uiDat4"
		// We need to extract data before decoding it back to original string
		String[] authParts = authString.split("\\s+");
		String authInfo = authParts[1];
		// Decode the data back to original string
		byte[] bytes = null;
		try {
			bytes = new BASE64Decoder().decodeBuffer(authInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		decodedAuth = new String(bytes);
		System.out.println(decodedAuth);

		/**
		 * here you include your logic to validate user authentication. it can
		 * be using ldap, or token exchange mechanism or your custom
		 * authentication mechanism.
		 */
		// your validation code goes here....

		return true;
	}

}
