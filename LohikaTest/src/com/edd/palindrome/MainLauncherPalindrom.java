package com.edd.palindrome;

public class MainLauncherPalindrom {

	public static void main(String[] args) {
		String palindrome = args[0];
		int size = palindrome.length();
		int half = 0;
		switch (size) {
		case 0:
			throw new RuntimeException("Cannot be empty");
		case 3:
			half = 1;
			break;
		default:
			half = size % 2 == 0 ? size / 2 : size / 2 - 1;
			break;
		}
		boolean isPalindrom = true;
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

}
