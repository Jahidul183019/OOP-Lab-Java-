package edu.lab.util;

public final class PalindromeUtil {
    private PalindromeUtil(){}

    public static boolean isPalindrome(String text){
        // TODO: ignore spaces and case, treat null/empty as false except empty string may be true
        // throw new UnsupportedOperationException("TODO");
         if (text == null) return false;
        String cleaned = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces, lowercase
        if (cleaned.isEmpty()) return true; // empty string is palindrome
        return cleaned.equals(reverse(cleaned));
    }

    public static String reverse(String text){
        // TODO: use StringBuffer(new String(text)).reverse().toString() style logic
        // throw new UnsupportedOperationException("TODO");
         if (text == null) return null;
        return new StringBuffer(new String(text)).reverse().toString();
    }
}
