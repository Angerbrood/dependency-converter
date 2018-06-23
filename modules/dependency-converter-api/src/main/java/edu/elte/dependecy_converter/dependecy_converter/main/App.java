package edu.elte.dependecy_converter.dependecy_converter.main;


import java.util.List;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.maven.MavenFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.maven.MavenProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.writer.gradle.GradleFileWriter;
import edu.elte.dependecy_converter.dependecy_converter.writer.gradle.GradleProjectWriter;

public class App 
{

    public static void main( String[] args ) throws Exception
    {   
    	/*String fileName = "input/pom.xml";
    	MavenProject mavenProject = new MavenFileReader().getProject();
    	GradleProject gradleProject = MavenProjectTransformer.transform(mavenProject);
    	List<String> gradleProjectOutput = GradleProjectWriter.writeProject(gradleProject);
    	new GradleFileWriter("output/build.gradle").writeToFile(gradleProjectOutput);
    	System.out.println("Done");*/
    	
    }
}
