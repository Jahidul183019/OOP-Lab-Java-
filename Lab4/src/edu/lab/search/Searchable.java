package edu.lab.search;
public interface Searchable {
    boolean search(String text, String key);
    String replace(String text, String oldWord, String newWord);
}
