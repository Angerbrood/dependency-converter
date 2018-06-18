package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;

public class GradleFileReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullFileReadFails() throws Exception {
		new GradleFileReader(null);
	}
	@Test(expected = RuntimeException.class)
	public void invalidFileReadFails() throws Exception {
		new GradleFileReader("sanyi");
	}
	@Test
	public void emptyFileReadProducesEmptyProject() throws Exception {
		GradleFileReader reader = new GradleFileReader("testInput/emptyBuild.gradle");
		assertNotNull(reader);
		GradleProject project = reader.getProject();
		assertNotNull(project);
		assertNotNull(project.getDependecyList());
		assertTrue(project.getDependecyList().isEmpty());
		assertNotNull(project.getRepositoryList());
		assertTrue(project.getRepositoryList().isEmpty());
	}
	@Test
	public void validFileReadProducesValidProject() throws Exception {
		GradleFileReader reader = new GradleFileReader("testInput/validBuild.gradle");
		assertNotNull(reader);
		GradleProject project = reader.getProject();
		assertNotNull(project);
		assertNotNull(project.getDependecyList());
		assertFalse(project.getDependecyList().isEmpty());
		assertNotNull(project.getRepositoryList());
		assertFalse(project.getRepositoryList().isEmpty());
	}
}
