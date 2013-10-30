/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import melt.Model.Mcq;

/**
 *
 * @author panos
 */
public class SingleQuestionPanel extends javax.swing.JPanel {
    
    
    private Mcq mcqQuestion;
    private JCheckBox answerCheckBoxes[] = new javax.swing.JCheckBox[6];
    
   // private ArrayList<JLabel> answerLabels;
    
    /**
     * Creates new form SingleQuestionPanel
     */
    public SingleQuestionPanel(Mcq mcqQuestion) {
        
        this.mcqQuestion = mcqQuestion;
        initComponents();
    }
    

    public void clearBoxes(){
        for(JCheckBox box : answerCheckBoxes){
            box.setSelected(false);
        }
    }
    public JPanel showQuestion(int qGap){
        
        
        JLabel lblName = new JLabel("<html>"+this.mcqQuestion.getQuestionText() + "<br>Marks : " + this.mcqQuestion.getMark()+"</html>");
        
        lblName.setFont(new java.awt.Font("MV Boli", 0, 14));
        ArrayList<String> questionAnswers = mcqQuestion.getAnswers();
        
        int cnt;
        
        for (cnt=0;cnt<questionAnswers.size();cnt++) {
            answerCheckBoxes[cnt] = new JCheckBox();
            answerCheckBoxes[cnt].setText(questionAnswers.get(cnt));
        }
        
        for (cnt=cnt;cnt<6;cnt++) {
            answerCheckBoxes[cnt] = new JCheckBox();
           answerCheckBoxes[cnt].setVisible(false);
        }     
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(qGap, qGap, qGap)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerCheckBoxes[5], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerCheckBoxes[4], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerCheckBoxes[3], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerCheckBoxes[2], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerCheckBoxes[1], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerCheckBoxes[0], javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[0])
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[1])
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[2])
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[3])
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[4])
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCheckBoxes[5])
                .addContainerGap(20,20))
        );
        //this.setBorder(BorderFactory.createLineBorder(Color.gray));
        return this;
    }
    
    public void setStudentAnswer(){
        ArrayList<Integer> stdAnsw = new ArrayList();
        for(int i=0;i<answerCheckBoxes.length;i++){
            if(answerCheckBoxes[i].isSelected()){
                stdAnsw.add(i);
            }
        }
        this.mcqQuestion.setStudentAnswers(stdAnsw);
        System.out.println(stdAnsw.toString());
    }
    
    public static void main(String[] args){
        
        String questionText = "question 1 ";
        ArrayList<String> answers = new ArrayList();
        answers.add("answer1");
        answers.add("answer2");
        ArrayList<Integer> correctAnswers = new ArrayList();
        correctAnswers.add(1);
        JButton button = new JButton("Submit");
        Mcq question = new Mcq(answers, correctAnswers, 1, questionText, 4.0);
        final SingleQuestionPanel panel = new SingleQuestionPanel(question);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panel.setStudentAnswer();
                
            }
        });
        
        
        
        JFrame aframe = new JFrame();
        aframe.add(panel);
        aframe.add(button, BorderLayout.PAGE_END);
        panel.showQuestion(30);
        aframe.setSize(800, 600);
        aframe.setVisible(true);

        
        ///System.out.println()
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
