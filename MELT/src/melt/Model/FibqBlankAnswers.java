/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Abdu
 */
public class FibqBlankAnswers {

    private ArrayList<String> possibleAnswers;
    private double mark;
    private double studentMark;

    public FibqBlankAnswers() {
        this.possibleAnswers = new ArrayList();
    }

    public FibqBlankAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    @XmlElement(name="Answer")
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    
    //Checks if the given answer is in the list of possible answers.
    public boolean checkAnswer(String Answer) {

        for (String answer : possibleAnswers) {
            if (Answer.equalsIgnoreCase(answer)) {
                return true;
            }
        }
        return false;

    }
}
