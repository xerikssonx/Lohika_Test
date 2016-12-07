package com.edd.word_counter;

import java.util.HashMap;
import java.util.Map;

public class MainLauncher {

	public static void main(String[] args) {
		String filePath = args[0];
		int occurrence = Integer.valueOf(args[1]);
		String content = FileReader.readFile(filePath);

		Map<String, Integer> map = new HashMap<>();
		String[] words = content.split(" ");
		for (String word : words) {
			map.put(word, map.get(word) == null ? 1 : map.get(word) + 1);
		}
		map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(occurrence)
				.forEach(System.out::println);
	}

}
