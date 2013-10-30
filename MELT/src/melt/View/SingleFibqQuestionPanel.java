/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import melt.Model.Fibq;
import melt.Model.FibqSingleBlank;

/**
 *
 * @author panos
 */
public class SingleFibqQuestionPanel extends javax.swing.JPanel {

    private Fibq fibqQuestion;
    JTextField[] blanks;

    /**
     * Creates new form SingleFibqQuestionPanel
     */
    public SingleFibqQuestionPanel(Fibq question) {
        this.fibqQuestion = question;
        initComponents();
    }

    public void clearBlanks() {
        for (JTextField field : blanks) {
            field.setText("");
        }
    }

    public JPanel showQuestion() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        //Get a BlanksMatcher object for the question text with _ as delimiter
        BlanksMatcher blanksMatcher = new BlanksMatcher(this.fibqQuestion.getQuestionText(), '_');
        String[] questionWithoutBlanks = blanksMatcher.getMatches();
        int numOfBlanks = blanksMatcher.getNumOfDelimiters();

        JLabel[] labels = new JLabel[questionWithoutBlanks.length];
        blanks = new JTextField[numOfBlanks];

        //check if there is a blank at the beginning of the question
        int blanksCounter = 0;
        if (blanksMatcher.isFirstChar()) {
            blanks[blanksCounter] = new JTextField();
            blanks[blanksCounter].setColumns(15);
            this.add(blanks[blanksCounter]);
            blanksCounter++;
        }

        //add the questions text followed by blanks, except if there is no more blanks
        for (int i = 0; i < questionWithoutBlanks.length; i++) {
            labels[i] = new JLabel(questionWithoutBlanks[i]);    
            labels[i].setFont(new java.awt.Font("MV Boli", 0, 14));
            this.add(labels[i]);
            if (blanksCounter < numOfBlanks) {
                blanks[blanksCounter] = new JTextField();
                blanks[blanksCounter].setColumns(15);
                this.add(blanks[blanksCounter]);
                blanksCounter++;
            }
        }

        //Just to make sure there is no blanks left!!
        for (blanksCounter = blanksCounter; blanksCounter < numOfBlanks; blanksCounter++) {
            blanks[blanksCounter] = new JTextField();
            blanks[blanksCounter].setColumns(15);
            this.add(blanks[blanksCounter]);
        }

        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //this.setBorder(BorderFactory.createLineBorder(Color.gray));
        return this;
    }

    public void setStudentAnswer() {

        ArrayList<FibqSingleBlank> fibqBlanks = this.fibqQuestion.getCorrectAnswers();
        for (int blankIndex = 0; blankIndex < blanks.length; blankIndex++) {
            String studentAnswer = blanks[blankIndex].getText().trim();
            if (studentAnswer.equals("")) {
                studentAnswer = "No answer given by the student";
            }
            fibqBlanks.get(blankIndex).setStudentAnswer(studentAnswer);
        }
        this.fibqQuestion.setCorrectAnswers(fibqBlanks);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public static void main(String[] args) {

        String questionText = "question 1 ";
        ArrayList<FibqSingleBlank> answers = new ArrayList();
        ArrayList<String> possibleAnswers = new ArrayList();
        possibleAnswers.add("answer1");
        possibleAnswers.add("answer2");

        ArrayList<Integer> correctAnswers = new ArrayList();
        correctAnswers.add(1);
        JButton button = new JButton("Submit");
        Fibq question = new Fibq(answers, 1, "_This_is_a_sample_fibq_question");
        final SingleFibqQuestionPanel panel = new SingleFibqQuestionPanel(question);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.setStudentAnswer();
            }
        });



        JFrame aframe = new JFrame();
        aframe.add(panel);
        aframe.add(button, BorderLayout.PAGE_END);
        panel.showQuestion();
        aframe.setSize(800, 600);
        aframe.setVisible(true);


        ///System.out.println()

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
