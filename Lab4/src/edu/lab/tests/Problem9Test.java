package edu.lab.tests;
import edu.lab.util.PalindromeUtil;

public class Problem9Test {
    public static void main(String[] args){
        Assert.assertTrue(PalindromeUtil.isPalindrome("racecar"), "P9: racecar");
        Assert.assertTrue(PalindromeUtil.isPalindrome("Never odd or even"), "P9: phrase palindrome");
        Assert.assertTrue(!PalindromeUtil.isPalindrome("hello"), "P9: hello not palindrome");
        Assert.assertEquals("avaJ", PalindromeUtil.reverse("Java"), "P9: reverse Java");
        Assert.summary();
    }
}
