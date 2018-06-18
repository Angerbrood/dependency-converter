package edu.elte.dependencyconverter.backend.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

public final class FileUtils {
	private FileUtils() {}
	
	public static final String createFile(String lines) throws IOException {
		Objects.requireNonNull(lines);

		String filename = "temp.xml";
		new File(filename).createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(lines);
		writer.close();
		return filename;

	}
	public static final void deleteFile(String name) {
		new File(name).delete();
	}
}
