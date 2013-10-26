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
import melt.Model.FibqBlankAnswers;

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

    public void clearBlanks(){
        for(JTextField field : blanks){
            field.setText("");
        }
    }
    public JPanel showQuestion(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        String questionText = this.fibqQuestion.getQuestionText();
        String[] qWithoutBlanks = questionText.split("_", 0);
        char firstChar = questionText.charAt(0);
        char lastChar = questionText.charAt(questionText.length() - 1);
        int noOfBlanks = qWithoutBlanks.length - 1;

        if ("_".equals(String.valueOf(lastChar))) {
            noOfBlanks++;
        }

        JLabel[] labels = new JLabel[qWithoutBlanks.length];
        blanks = new JTextField[noOfBlanks];

        int j = 0;
        if ("_".equals(String.valueOf(firstChar))) {
            blanks[j] = new JTextField();
            blanks[j].setColumns(15);
            this.add(blanks[j]);
            j++;
        }

        for (int i = 0; i < qWithoutBlanks.length; i++) {
            if ("".equals(qWithoutBlanks[i])) {
                continue;
            }
            labels[i] = new JLabel(qWithoutBlanks[i]);
            labels[i].setFont(new java.awt.Font("MV Boli", 0, 16));
            this.add(labels[i]);
            if (i < noOfBlanks) {
                blanks[j] = new JTextField();
                blanks[j].setColumns(15);
                this.add(blanks[j]);
                j++;
            }
        }
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        return this;
    }
    
    public void setStudentAnswer(){
        ArrayList<String> answers = new ArrayList();
        for(JTextField field : blanks){
            
            if(!field.getText().equals("")){
                answers.add(field.getText());
            }
            else{
                answers.add("No answer given by the student");
            }
        }
        this.fibqQuestion.setStudentAnswer(answers);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        public static void main(String[] args){
        
        String questionText = "question 1 ";
        ArrayList<FibqBlankAnswers> answers = new ArrayList();
        ArrayList<String> possibleAnswers = new ArrayList();
        possibleAnswers.add("answer1");
        possibleAnswers.add("answer2");
        
        ArrayList<Integer> correctAnswers = new ArrayList();
        correctAnswers.add(1);
        JButton button = new JButton("Submit");
        Fibq question = new Fibq(answers, 1, "_This_is_a_sample_fibq_question", 4.0);
        final SingleFibqQuestionPanel panel = new SingleFibqQuestionPanel(question);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
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
            .addGap(0, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
