package edu.lab.tests;
import edu.lab.search.*;

public class Problem12Test {
    public static void main(String[] args){
        Searchable s1 = new CaseSensitiveSearch();
        Searchable s2 = new CaseInsensitiveSearch();
        String text = "Java is fun";

        Assert.assertTrue(!s1.search(text, "java"), "P12: case-sensitive search should fail");
        Assert.assertTrue(s2.search(text, "java"), "P12: case-insensitive search should pass");

        Assert.assertEquals("Kotlin is fun", s2.replace(text, "java", "Kotlin"), "P12: ci replace");
        Assert.summary();
    }
}
