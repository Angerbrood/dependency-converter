package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MavenFileReader {
	private final List<String> inputLines = new LinkedList<>();

	public MavenProject getProject(Optional<InputStream> inputStream) {
		try {
			readPomFile(inputStream);
			MavenProject result = MavenProjectReader.readProject(inputLines);
			result.setPropertyList(MavenPropertyReader.readProperties(inputLines));
			result.setDependencies(MavenDependencyReader.readDependecies(inputLines));
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
			return new MavenProject();
		}
		
	}
	
	private void readPomFile(Optional<InputStream> inputStream) throws Exception {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(inputStream.isPresent() ? inputStream.get() : inputStream.orElseThrow(IllegalAccessError::new));
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
