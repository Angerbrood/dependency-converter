package edu.elte.dependecy_converter.dependecy_converter.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public final class TestInputReader {
	private TestInputReader() {}
	public static final List<String> readInputLines(String path) {
		try {
			return Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
			return new LinkedList<>();
		}
	}
}
