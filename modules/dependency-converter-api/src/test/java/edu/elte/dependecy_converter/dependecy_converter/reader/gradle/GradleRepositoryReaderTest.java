package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleRepository;
import edu.elte.dependecy_converter.dependecy_converter.reader.TestInputReader;

public class GradleRepositoryReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		GradleRepositoryReader.readRepositories(null);
	}
	@Test
	public void emptyListReadsEmptyRepositories() {
		List<GradleRepository> repositories = GradleRepositoryReader.readRepositories(new LinkedList<>());
		assertNotNull(repositories);
		assertTrue(repositories.isEmpty());
	}
	@Test
	public void nonEmptyListReadsNonEmptyRepostories() {
		List<GradleRepository> repositories = GradleRepositoryReader.readRepositories(TestInputReader.readInputLines("testInput/build3.gradle"));
		assertNotNull(repositories);
		assertFalse(repositories.isEmpty());
		assertTrue(repositories.size() == 2);
	}
}
