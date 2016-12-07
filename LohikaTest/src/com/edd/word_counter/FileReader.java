package com.edd.word_counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static String readFile(String path) {
		try {
			return new Scanner(new File(path)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
