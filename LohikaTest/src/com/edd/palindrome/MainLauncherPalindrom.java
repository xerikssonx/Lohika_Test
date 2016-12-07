package com.edd.palindrome;

public class MainLauncherPalindrom {

	public static void main(String[] args) {
		String palindrome = args[0];
		int size = palindrome.length();
		boolean isPalindrom = true;
		int half = contHalfOfArray(size);
		isPalindrom = isPolindrone(palindrome, size, isPalindrom, half);
		System.out.println(isPalindrom);
	}

	private static boolean isPolindrone(String palindrome, int size, boolean isPalindrom, int half) {
		for (int i = 0; i < half; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(size - 1 - i)) {
				isPalindrom = false;
				break;
			}
		}
		return isPalindrom;
	}

	private static int contHalfOfArray(int size) {
		int half = 0;
		if (size % 2 == 0) {
			half = size / 2;
		} else {
			half = size / 2 - 1;
		}
		return half;
	}
}
