package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleDependency;
import edu.elte.dependecy_converter.dependecy_converter.reader.TestInputReader;

public class GradleDependencyReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		GradleDependencyReader.readDependencies(null);
	}
	@Test
	public void emptyListReadsEmptyDependencies() {
		List<GradleDependency> dependencies = GradleDependencyReader.readDependencies(new LinkedList<>());
		assertNotNull(dependencies);
		assertTrue(dependencies.isEmpty());
	}
	@Test
	public void nonEmptyListReadsNonEmptyDependecies() {
		List<GradleDependency> dependencies = GradleDependencyReader.readDependencies(TestInputReader.readInputLines("testInput/build2.gradle"));
		assertNotNull(dependencies);
		assertFalse(dependencies.isEmpty());
		assertTrue(dependencies.size() == 4);
	}
}
