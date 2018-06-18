package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.LinkedList;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.TestInputReader;

public class MavenProjectReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		MavenProjectReader.readProject(null);
	}
	@Test
	public void emptyFileReadProducesEmptyProject() {
		MavenProject project = MavenProjectReader.readProject(new LinkedList<>());
		assertNotNull(project);
	}
	@Test
	public void nonEmptyFileReadProducesValidProject() {
		MavenProject project = MavenProjectReader.readProject(TestInputReader.readInputLines("testInput/validProject.maven"));
		assertNotNull(project);
		assertNotNull(project.getGroupId());
		assertNotNull(project.getArtifactId());
		assertNotNull(project.getVersion());
		assertNull(project.getDependencies());
	}
}
