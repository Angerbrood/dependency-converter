package edu.elte.dependecy_converter.dependecy_converter.writer;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class FileService {
	private FileService() {}

	public static Optional<InputStream> getFileAsBytes(String lines) {
		Objects.requireNonNull(lines);
		Optional<InputStream> result;
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			byte[] lineBytes = lines.getBytes("UTF-8");
			for(byte currentByte : lineBytes) {
				baos.write(currentByte);
			}
			result = Optional.of(new ByteArrayInputStream(baos.toByteArray()));
		} catch (Exception ex) {
			result = Optional.empty();
		}
		return result;
	}
	public static Optional<InputStream> getFileAsBytes(List<String> lines) {
		Objects.requireNonNull(lines);
		Optional<InputStream> result;
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			for(String currentLine : lines) {
				byte[] lineBytes = currentLine.getBytes();
				for(byte currentByte : lineBytes) {
					baos.write(currentByte);
				}
			}
			result = Optional.of(new ByteArrayInputStream(baos.toByteArray()));
		} catch (Exception ex) {
			result = Optional.empty();
		}
		return result;
	}
	public static void writeToFile(String filePath, List<String> outputLines) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))) {
			for(String currentItem : outputLines) {
				bufferedWriter.write(currentItem);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
