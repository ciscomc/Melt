/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import melt.Controller;
import melt.Model.FibqBlankAnswers;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Subsection;

/**
 *
 * @author Fuhao
 */
public class FibqPane extends javax.swing.JPanel {

    private Controller controller;
    private Subsection subsectionObject;
    private TreePanel treePane;
    private Mcq mcqObject;

    /**
     * Creates new form MCQs
     */
    public FibqPane(Controller controller, TreePanel treePane) {
        initComponents();
        this.controller = controller;
        this.treePane = treePane;
        setupComponents();
    }
     
    public void deleteQuestion()
    {
        this.controller.deleteQuestion(subsectionObject, mcqObject.getId());
        treePane.removeCurrentNode();
    }
    
    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public void setQuestion(Mcq mcq) {
        this.mcqObject = mcq;
        preview();
    }

    private void preview() {
        if (mcqObject == null) {
            clear();
        } else {
            clear();
            txtQuestion.setText(mcqObject.getQuestionText());
            ArrayList<String> questionAnswers = mcqObject.getAnswers();
            ArrayList<Integer> correctAnswers = mcqObject.getCorrectAnswers();
            ArrayList<JCheckBox> correctAnswerCheckBoxes = new ArrayList();
            //correctAnswerCheckBoxes.add(chkAnswer1);
            //correctAnswerCheckBoxes.add(chkAnswer2);
            //correctAnswerCheckBoxes.add(chkAnswer3);
            //correctAnswerCheckBoxes.add(chkAnswer4);
            //correctAnswerCheckBoxes.add(chkAnswer5);
            //correctAnswerCheckBoxes.add(chkAnswer6);
            for (int answer : correctAnswers) {
                correctAnswerCheckBoxes.get(answer).setSelected(true);
            }
            ArrayList<JTextField> answerFields = new ArrayList();
            //answerFields.add(txtAnswer1);
            //answerFields.add(txtAnswer2);
            //answerFields.add(txtAnswer3);
            //answerFields.add(txtAnswer4);
            //answerFields.add(txtAnswer5);
            //answerFields.add(txtAnswer6);
            for (String answer : questionAnswers) {                
                int answerIndex =questionAnswers.indexOf(answer);
                answerFields.get(answerIndex).setText(answer);
                        
            }
            
            txtMarks.setText(Double.toString(mcqObject.getMark()));
            btnSave.setEnabled(false);
            
        }
    }

    private void clear() {
        txtQuestion.setText("");
        //txtAnswer1.setText("");
        //txtAnswer2.setText("");
        //txtAnswer3.setText("");
        //txtAnswer4.setText("");
        //txtAnswer5.setText("");
        //txtAnswer6.setText("");
        txtMarks.setText("");
        //chkAnswer1.setSelected(false);
        //chkAnswer2.setSelected(false);
        //chkAnswer3.setSelected(false);
        //chkAnswer4.setSelected(false);
        //chkAnswer5.setSelected(false);
        //chkAnswer6.setSelected(false);
        btnSave.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFillInstructions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        txtMarks = new javax.swing.JTextField();
        lblAnswers = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnswers = new javax.swing.JTextArea();
        lblAnswers1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(648, 518));

        lblFillInstructions.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblFillInstructions.setText("Please enter the question and show blanks using the underscore (_)");
        lblFillInstructions.setToolTipText("");

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        btnSave.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtMarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarks.setText("             ");
        txtMarks.setMinimumSize(new java.awt.Dimension(60, 25));
        txtMarks.setPreferredSize(new java.awt.Dimension(60, 25));

        lblAnswers.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblAnswers.setText("Set the answers for each blank, separate correct answers for each blank with comma (,)");

        lblMarks.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks.setText("Marks:");

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fill in the Blank Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblQuestion.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblQuestion.setText("Question:");

        txtAnswers.setColumns(20);
        txtAnswers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnswers.setLineWrap(true);
        txtAnswers.setRows(5);
        jScrollPane2.setViewportView(txtAnswers);

        lblAnswers1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblAnswers1.setText("Separate different blank answers with a new line");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(lblAnswers, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(lblAnswers1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFillInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFillInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnswers)
                .addGap(2, 2, 2)
                .addComponent(lblAnswers1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarks)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupComponents() {
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ArrayList<FibqBlankAnswers> questionAnswers = new ArrayList();
        ArrayList<String> possibleAnswersOfQuestion = new ArrayList<String>();
        
        String questionText = txtQuestion.getText();

        String answersText = txtAnswers.getText();
        
        // Make more checks
        if (questionText.equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide a question text.");
        } else if (txtMarks.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide a mark for the question.");
        } else if (!isNumeric(txtMarks.getText())) {
            JOptionPane.showMessageDialog(this, "Please provide a valid number in the marks field.");
        } else {
            Double questionMark = Double.parseDouble(txtMarks.getText());
            //Question question = this.controller.addQuestion(this.subsectionObject, questionAnswers, correctAnswers, questionText, questionMark);
            //this.treePane.addQuestionNode(question);
            this.controller.updateXmlFile();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnswers;
    private javax.swing.JLabel lblAnswers1;
    private javax.swing.JLabel lblFillInstructions;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtAnswers;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
