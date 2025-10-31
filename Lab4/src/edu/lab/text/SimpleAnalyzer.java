package edu.lab.text;
import edu.lab.api.Analyzer;

public class SimpleAnalyzer implements Analyzer {
    public SimpleAnalyzer(){}

    @Override
    public int countWords(String text){
        // TODO: count words splitting on whitespace; handle null/empty as 0
        // throw new UnsupportedOperationException("TODO");

         if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+"); // split by whitespace
        return words.length;
    }

    @Override
    public int countCharacters(String text){
        // TODO: return text length; null => 0
        // throw new UnsupportedOperationException("TODO");

         if (text == null) {
            return 0;
        }
        return text.length();

    }

    @Override
    public boolean containsSubstring(String text, String sub){
        // TODO: true if sub occurs within text (case-sensitive)
        // throw new UnsupportedOperationException("TODO");

         if (text == null || sub == null) {
            return false;
        }
        return text.contains(sub); // case-sensitive search
    }
}
