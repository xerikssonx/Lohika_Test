package com.edd.palindrome;

public class MainLauncherPalindrom {

	public static void main(String[] args) {
		String palindrome = args[0];
		int size = palindrome.length();
		boolean isPalindrom = true;
		int j = 0;
		if (size % 2 == 0) {
			j = size / 2;
		} else {
			j = size / 2 - 1;
		}
		for (int i = 0; i < j; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(size - 1 - i)) {
				isPalindrom = false;
				break;
			}
		}
		System.out.println(isPalindrom);
	}
}
