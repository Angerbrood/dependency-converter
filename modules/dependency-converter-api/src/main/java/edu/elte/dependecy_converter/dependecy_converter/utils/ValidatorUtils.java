package edu.elte.dependecy_converter.dependecy_converter.utils;

import java.io.File;

public final class ValidatorUtils {
	private ValidatorUtils() {}
	
	public static final void isFileExists(String filepath) {
		File file = new File(filepath);
		if(!file.exists()) {
			throw new RuntimeException("File does not exists");
		}
	}
	
	public static final void isNewFileNeeded(String path) throws Exception {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile();
		}
	}
	public static final void isFileEmpty(String path) {
		File file = new File(path);
		if(file.length() == 0) {
			throw new RuntimeException("File is empty");
		}
		
	}
	
}
