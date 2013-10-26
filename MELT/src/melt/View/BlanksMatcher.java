/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

/**
 *
 * @author mbaxjah5
 */
public class BlanksMatcher {

    
    

    public static void main(String[] args) {
        String pattern = "[^\\\\]_";
        String pattern2 = "[\\\\]_";
        String questionText = "\\_this is _ a text _";
        String[] blanks = questionText.split(pattern);
        int noOfBlanks = blanks.length - 1;
        
        System.out.println(noOfBlanks);
        
        for(String str: blanks) {
            System.out.println(str.replaceAll(pattern2,"_"));
        }
        
        //String text = questionText.replaceAll(pattern2,"_");
        //System.out.println(text);
    }
    
}
