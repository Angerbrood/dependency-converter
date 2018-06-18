package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;

public class MavenFileReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		new MavenFileReader(null);
	}
	@Test(expected = RuntimeException.class)
	public void nonExistingFileReadFails() {
		new MavenFileReader("sanyi");
	}
	@Test(expected = RuntimeException.class)
	public void emptyFileReadFails() {
		new MavenFileReader("testInput/emptyBuild.maven");
	}
	@Test
	public void validFileReadSuccess() {
		MavenFileReader reader = new MavenFileReader("testInput/validMavenBuild.xml");
		assertNotNull(reader);
		MavenProject project = reader.getProject();
		assertNotNull(project);
		assertNotNull(project.getGroupId());
		assertNotNull(project.getArtifactId());
		assertNotNull(project.getDependencies());
	}
	
}
