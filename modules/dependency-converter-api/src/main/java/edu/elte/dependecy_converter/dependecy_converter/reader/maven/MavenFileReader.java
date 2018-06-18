package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProperty;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;
import edu.elte.dependecy_converter.dependecy_converter.utils.ValidatorUtils;

public class MavenFileReader {
	private final String filePath;
	private final List<String> inputLines;
	
	public MavenFileReader(String path) {
		Objects.requireNonNull(path);
		ValidatorUtils.isFileExists(path);
		ValidatorUtils.isFileEmpty(path);
		filePath = path;
		inputLines = new LinkedList<>();
	}
	
	public MavenProject getProject() {
		try {
			readPomFile();
			MavenProject result = MavenProjectReader.readProject(inputLines);
			result.setPropertyList(MavenPropertyReader.readProperties(inputLines));
			result.setDependencies(MavenDependencyReader.readDependecies(inputLines));
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
			return new MavenProject();
		}
		
	}
	
	private void readPomFile() throws Exception {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(filePath));
    	 while(xmlEventReader.hasNext()) {
    		 XMLEvent xmlEvent = xmlEventReader.nextEvent();
    		 if(xmlEvent.isStartElement()) {
    			  StartElement startElement = xmlEvent.asStartElement();
    			  String elementName = startElement.getName().getLocalPart();
    			  xmlEvent = xmlEventReader.nextEvent();
    			  String elementValue = xmlEvent.asCharacters().getData();
    			  //System.out.println(elementName + ": " + elementValue);
    			  inputLines.add(elementName + ":" + elementValue);
    		 }
    		 if(xmlEvent.isEndElement()) {
    			 EndElement endElement = xmlEvent.asEndElement();
    			 String endElementName = endElement.getName().getLocalPart();
    			 inputLines.add("End:" + endElementName);
    		 }
    	 }
	}
}
