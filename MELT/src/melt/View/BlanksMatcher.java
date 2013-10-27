/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mbaxjah5
 */
public class BlanksMatcher {

    private String text;
    private char delimiter;
    private final char escapeCahr = '\\';
    private String regExpression;
    private String[] matches;
    private String[] matchesWithEscape;
    private Pattern pattern;
    private Matcher matcher;
    private int numOfDelimiters;

    
    
    public BlanksMatcher(String text, char delimiter) {
        this.text = text.trim();
        this.delimiter = delimiter;
        this.regExpression = "([^\\\\" + this.delimiter + "]|\\\\.)+";
        pattern = Pattern.compile(regExpression);
        matcher = pattern.matcher(this.text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }
    
    private void findMatches() {
        ArrayList<String> matchedWithEscape = new ArrayList();
        ArrayList<String> matchedWithoutEscape = new ArrayList();
        while (matcher.find()) {
            matchedWithEscape.add(matcher.group());
            matchedWithoutEscape.add(matcher.group().replaceAll("\\\\_", "_"));
        }
        matchesWithEscape = matchedWithEscape.toArray(new String[matchedWithEscape.size()]);
        matches = matchedWithoutEscape.toArray(new String[matchedWithoutEscape.size()]);
    }

    //Get Matched Strings without replacing the escape character \ followed by delimiter
    public String[] getMatchesWithEscape() {
        findMatches();
        return matchesWithEscape;
    }
    
    //Get Matched Strings and replace the escape character \ followed by delimiter with only the delimiter character
    public String[] getMatches() {
        findMatches();
        return matches;
    }

    //Get the number of occurrences of the delimiter character
    public int getNumOfDelimiters() {
        String[] delimiterString = pattern.split(text);
        numOfDelimiters = delimiterString.length;
        if (!isFirstChar() && numOfDelimiters !=0) {
            numOfDelimiters--;
        } 
        
        return numOfDelimiters;
    }
    
    public boolean isFirstChar() {
        char firstChar = this.text.charAt(0);
        if (this.delimiter == firstChar) 
            return true;
        else
            return false;
    }
    

    public static void main(String[] args) {
        BlanksMatcher b = new BlanksMatcher("This is a text", '_');
        String[] matches = b.getMatches();
        System.out.println(matches.length);
        
        for (String str : matches) {
            System.out.println(str);
        }
        System.out.println(b.getNumOfDelimiters());
        System.out.println(b.isFirstChar());
        /*Pattern p = Pattern.compile("([^\\\\_]|\\\\.)+");
         
         //String text = questionText.replaceAll(pattern2,"_");
         //System.out.println(text);*/
    }
}
