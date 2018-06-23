package edu.elte.dependencyconverter.backend.utils;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public final class FileService {
	private FileService() {}

	public static Optional<InputStream> getFileAsBytes(String lines) {
		Objects.requireNonNull(lines);
		Optional<InputStream> result;
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			byte[] lineBytes = lines.getBytes();
			for(byte currentByte : lineBytes) {
				baos.write(currentByte);
			}
			result = Optional.of(new ByteArrayInputStream(baos.toByteArray()));
		} catch (Exception ex) {
			result = Optional.empty();
		}
		return result;
	}
}
