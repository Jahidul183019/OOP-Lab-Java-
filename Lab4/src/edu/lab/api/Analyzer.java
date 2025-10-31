package edu.lab.api;
public interface Analyzer {
    int countWords(String text);
    int countCharacters(String text);
    boolean containsSubstring(String text, String sub);
}
