package edu.elte.dependecy_converter.dependecy_converter.utils;

import java.util.List;

public final class StringUtils {
	private StringUtils() {}
	
	public static final String getInputValue(String line) {
		return line.split(":")[1];
	}
	public static final String[] getSplittedValue(String line) {
		return line.split(":");
	}
	public static final String removeWhiteSpace(String line) {
		return line.trim();
	}
	public static final String getPropertyKey(String rawKey) {
		return rawKey.replace("$", "").replace("{", "").replace("}", "");
	}
	public static final String convertListToString(List<String> lines) {
		StringBuilder sb = new StringBuilder();
		lines.stream().forEach(sb::append);
		return sb.toString();
	}
}
