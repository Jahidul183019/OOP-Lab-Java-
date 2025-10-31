package edu.lab.tests;
import edu.lab.api.Analyzer;
import edu.lab.text.SimpleAnalyzer;

public class
Problem8Test {
    public static void main(String[] args){
        Analyzer a = new SimpleAnalyzer();
        // Expect stable results on this literal
        String s = "Hello, world! Java is fun.";
        Assert.assertEquals(5, a.countWords(s), "P8: word count");
        Assert.assertEquals(26, a.countCharacters(s), "P8: char count");
        Assert.assertTrue(a.containsSubstring(s, "world"), "P8: contains 'world'");
        Assert.summary();
    }
}
