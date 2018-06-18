package edu.elte.dependecy_converter.dependecy_converter.writer.gradle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.utils.ValidatorUtils;

public class GradleFileWriter {
	private final String filePath;
	private final BufferedWriter bufferedWriter;
	public GradleFileWriter(String path) throws Exception {
		Objects.requireNonNull(path);
		filePath = path;
		bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
	}
	
	
	public void writeToFile(List<String> outputLines) throws Exception {
		ValidatorUtils.isNewFileNeeded(filePath);
		
		for(String currentItem : outputLines) {
			bufferedWriter.write(currentItem);
		}
		bufferedWriter.close();
	}
	
}
