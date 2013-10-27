/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import melt.Controller;
import melt.Model.Fibq;
import melt.Model.FibqBlankAnswers;
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
    private Fibq fibqObject;
    private ArrayList<FibqBlankAnswers> questionAnswers;
    private String questionText;

    /**
     * Creates new form MCQs
     */
    public FibqPane(Controller controller, TreePanel treePane) {
        initComponents();
        this.controller = controller;
        this.treePane = treePane;
        setupComponents();
    }

    public void deleteQuestion() {
        this.controller.deleteQuestion(subsectionObject, fibqObject.getId());
        treePane.removeCurrentNode();
    }

    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    public void setQuestion(Fibq fibq) {
        this.fibqObject = fibq;
        preview();
    }

    private void preview() {

        if (fibqObject == null) {
            clear();
        } else {
            clear();
            txtQuestion.setText(fibqObject.getQuestionText());

            ArrayList<FibqBlankAnswers> questionAnswers = fibqObject.getCorrectAnswers();
            for (FibqBlankAnswers blankAnswers : questionAnswers) {
                ArrayList<String> possibleAnswers = blankAnswers.getPossibleAnswers();
                for (String anAnswer : possibleAnswers) {
                    txtAnswers.append(anAnswer);
                    if (possibleAnswers.indexOf(anAnswer) != possibleAnswers.size() - 1) {
                        txtAnswers.append(",");
                    }

                }
                txtAnswers.append("|");
                txtAnswers.append(Double.toString(blankAnswers.getMark()));
                if (questionAnswers.indexOf(blankAnswers) != questionAnswers.size() - 1) {
                    txtAnswers.append("\n");
                }
            }

            txtMarks.setText(Double.toString(fibqObject.getMark()));
            chkAutoMark.setSelected(fibqObject.isAutoMarked());
        }
    }

    private void clear() {
        txtQuestion.setText("");
        txtAnswers.setText("");
        txtMarks.setText("");
        txtMarks.setEditable(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnswers = new javax.swing.JTextArea();
        chkAutoMark = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(648, 518));

        lblFillInstructions.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblFillInstructions.setText("<html>Please enter the question and show blanks using the underscore (_).<br>If you want to add an underscore as part of the test add the \\_ character.</html>");
        lblFillInstructions.setToolTipText("");

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        txtQuestion.setDragEnabled(true);
        jScrollPane1.setViewportView(txtQuestion);

        btnSave.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtMarks.setEditable(false);
        txtMarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarks.setText("             ");
        txtMarks.setMinimumSize(new java.awt.Dimension(60, 25));
        txtMarks.setPreferredSize(new java.awt.Dimension(60, 25));

        lblAnswers.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblAnswers.setText("<html>Set the answers for each blank: separate correct answers for each blank with comma (,)<br>Separate different blank answers with a new line. <br>Add the mark for each blank at the end of the line using the (|) character followed by the mark.</html>");

        lblMarks.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks.setText("Full Marks:");

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fill in the Blank Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtAnswers.setColumns(20);
        txtAnswers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnswers.setLineWrap(true);
        txtAnswers.setRows(5);
        txtAnswers.setDragEnabled(true);
        jScrollPane2.setViewportView(txtAnswers);

        chkAutoMark.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        chkAutoMark.setSelected(true);
        chkAutoMark.setText("Automark");
        chkAutoMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoMarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAnswers, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFillInstructions, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281)
                        .addComponent(chkAutoMark)
                        .addGap(33, 33, 33)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFillInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarks)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAutoMark)
                    .addComponent(btnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupComponents() {
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        boolean automarked = this.chkAutoMark.isSelected();
        if (isValidInput()) {
            double questionMark = 0;
            for (FibqBlankAnswers blankAnswer : questionAnswers) {
                questionMark += blankAnswer.getMark();
            }

            txtMarks.setText(Double.toString(questionMark));

            if (fibqObject == null) {

                Question question = this.controller.addQuestion(this.subsectionObject, questionAnswers, questionText);
                Fibq fibq = (Fibq) question;
                fibq.setAutoMarked(this.chkAutoMark.isSelected());
                this.treePane.addQuestionNode(question);

            } else {
                fibqObject.setAutoMarked(this.chkAutoMark.isSelected());
                this.controller.updateQuestionDetails(fibqObject, questionAnswers, questionText, questionMark);
            }

            this.controller.updateXmlFile();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void chkAutoMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoMarkActionPerformed

    private boolean isValidInput() {

        questionAnswers = new ArrayList();
        ArrayList<String> possibleAnswersOfBlank;
        int numOfBlanks, numOfBlankAnswers;

        questionText = txtQuestion.getText().trim();
        //Check for empty question Text.
        if (questionText.equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide a question text.");
            return false;
        }

        String[] blanks = questionText.split("[^\\\\]_", -1);
        numOfBlanks = blanks.length - 1;

        // Check if there is no Blanks in the question text
        if (numOfBlanks == 0) {
            JOptionPane.showMessageDialog(this, "Please provide at least one blank for the question.");
            return false;
        }

        String answersText = txtAnswers.getText().trim();
        //Check for empty Answer Text.
        if (answersText.equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide possible answers with marks for each blank or unselect Automarked.");
            return false;
        }

        String[] lines = answersText.split("\n");
        numOfBlankAnswers = lines.length;

        if (lines.length != numOfBlanks) {
            JOptionPane.showMessageDialog(this, "You have set " + numOfBlanks + " blanks in the question and " + numOfBlankAnswers + " correct answers with marks!");
            return false;
        }

        for (String blankAnswers : lines) {
            double blankMark = 0;
            int barIndex = blankAnswers.lastIndexOf("|");
            if (barIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please provide a mark for each blank using the (|) character.");
                return false;
            }
            String answersSubstring = blankAnswers.substring(0, barIndex);
            String blankMarkStr = blankAnswers.substring(barIndex + 1);
            if (isNumeric(blankMarkStr)) {
                blankMark = Double.parseDouble(blankMarkStr);
            } else {
                JOptionPane.showMessageDialog(this, "Please provide a valid number for the marks after the  (|) character");
                return false;
            }

            if ((answersSubstring.trim().equals("")) && (chkAutoMark.isSelected())) {
                JOptionPane.showMessageDialog(this, "Please provide the possible correct answers for each blank or unselect Automarked.");
                return false;
            }

            String[] answers = answersSubstring.split(",");
            possibleAnswersOfBlank = new ArrayList();
            for (String anAnswer : answers) {
                possibleAnswersOfBlank.add(anAnswer.trim());
            }
            questionAnswers.add(new FibqBlankAnswers(possibleAnswersOfBlank, blankMark));
        }


        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkAutoMark;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnswers;
    private javax.swing.JLabel lblFillInstructions;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtAnswers;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
