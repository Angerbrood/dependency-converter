package edu.elte.dependecy_converter.dependecy_converter.main;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.gradle.GradleFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.gradle.GradleProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.writer.FileService;
import edu.elte.dependecy_converter.dependecy_converter.writer.maven.MavenProjectWriter;

public class App 
{

    public static void main( String[] args ) throws Exception
    {   
    	String fileName = "/home/angerbrood/Projects/dependency-converter/modules/dependency-converter-api/input/build.gradle";
    	GradleProject gradleProject = new GradleFileReader().getProject(FileService.getFileAsBytes(new String(Files.readAllBytes(Paths.get(fileName)))));
    	MavenProject mavenProject = GradleProjectTransformer.transform(gradleProject);
    	List<String> mavenProjectOutput = MavenProjectWriter.writeProject(mavenProject);
        FileService.writeToFile("/home/angerbrood/Temp/pom.xml", mavenProjectOutput);
    	System.out.println("Done");
    	
    }
}
