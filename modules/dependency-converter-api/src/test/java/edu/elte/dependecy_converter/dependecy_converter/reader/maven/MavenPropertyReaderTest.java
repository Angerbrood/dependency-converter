package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import org.junit.Test;

public class MavenPropertyReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		MavenPropertyReader.readProperties(null);
	}
	@Test(expected = RuntimeException.class)
	public void nullKeyGetFails() {
		MavenPropertyReader.getProperty(null);
	}

}
