package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradlePlugin;

import java.util.LinkedList;
import java.util.List;

public final class GradlePluginReader {
    private GradlePluginReader() {}
    public static List<GradlePlugin> readPlugins(List<String> lines) {
        List<GradlePlugin> result = new LinkedList<>();
        for (String currentLine : lines) {
            if(currentLine.contains("apply plugin")) {
                String[] splitted = currentLine.split(":");
                GradlePlugin plugin = new GradlePlugin();
                plugin.setName(removeUnusedCharacters(splitted[1]));
                result.add(plugin);
            }
        }
        return result;
    }
    private static String removeUnusedCharacters(String line) {
        return line.replace("'", "").replace("\"", "");
    }
}
