package com.cda.methods;

public class ToUpperCaseFirst {
	public static String upperCaseFirst(String val) {
		String val1 = val.toLowerCase();
		char[] arr = val1.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}
}
