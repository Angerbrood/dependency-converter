package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.TestInputReader;

public class GradleProjectReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullProjectReadFail() {
		GradleProjectReader.readProject(null);
	}
	@Test
	public void emptyListReadsEmptyProject() {
		GradleProject project = GradleProjectReader.readProject(new LinkedList<>());
		assertNotNull(project);
	}
	@Test
	public void nonEmptyListReadsNonEmptyProject() {
		GradleProject project = GradleProjectReader.readProject(TestInputReader.readInputLines("testInput/build1.gradle"));
		assertNotNull(project);
		assertNotNull(project.getGroup());
		assertNotNull(project.getArtifact());
		assertNotNull(project.getVersion());
	}
}
