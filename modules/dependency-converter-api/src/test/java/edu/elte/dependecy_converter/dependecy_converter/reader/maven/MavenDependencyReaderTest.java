package edu.elte.dependecy_converter.dependecy_converter.reader.maven;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;
import edu.elte.dependecy_converter.dependecy_converter.reader.TestInputReader;

public class MavenDependencyReaderTest {
	@Test(expected = RuntimeException.class)
	public void nullReadFails() {
		MavenDependencyReader.readDependecies(null);
	}
	@Test
	public void emptyListReadProducesEmptyDependency() {
		List<MavenDependency> dependencies = MavenDependencyReader.readDependecies(new LinkedList<>());
		assertNotNull(dependencies);
		assertTrue(dependencies.isEmpty());
	}
	@Test
	public void nonEmptyListSuccess() {
		List<MavenDependency> dependencies = MavenDependencyReader.readDependecies(TestInputReader.readInputLines("testInput/build1.maven"));
		assertNotNull(dependencies);
		assertFalse(dependencies.isEmpty());
	}
}
