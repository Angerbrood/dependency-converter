package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProperty;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;

public final class MavenPropertyReader {
	private MavenPropertyReader() {}
	private static final Map<String, String> propertyCache = new HashMap<>();
	private static final String PROPERTIES = "properties";
	
	public static final List<MavenProperty> readProperties(List<String> inputList) {
		Objects.requireNonNull(inputList);
		List<MavenProperty> result = new LinkedList<>();
		for(int i = 0; i < inputList.size(); ++i) {
			String currentItem = inputList.get(i);
			if(currentItem.contains(PROPERTIES) && !currentItem.contains("End")) {
				for(int j = i + 1; j < inputList.size(); ++j) {
					String rawStringProperty = inputList.get(j);
					if(!rawStringProperty.contains("End")) {
						String[] splitted = StringUtils.getSplittedValue(rawStringProperty);
						MavenProperty property = new MavenProperty();
						property.setKey(splitted[0]);
						property.setValue(splitted[1]);
						propertyCache.put(splitted[0], splitted[1]);
						result.add(property);
					}
					if(rawStringProperty.contains(PROPERTIES) && rawStringProperty.contains("End")) {
						return result;
					}
				}
				break;
			}
		}
		return result;
	}
	public static final String getProperty(String key) {
		Objects.requireNonNull(key);
		return propertyCache.get(key);
	}
}
