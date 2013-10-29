/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View.marker;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import melt.Controller;
import melt.Model.Essay;
import melt.Model.Fibq;
import melt.Model.Mcq;


/**
 *
 * @author mbaxjah5
 */
public class MarkerPanel extends javax.swing.JPanel {

    private Controller controller;
    private JPanel contentPane;
    private MarkerTreePanel treePane;
    private FibqPanel fibq;
    private EssayPanel essay;
    private McqPanel mcqPanel;
    private MarkerInitialPanel markerPanel;
    private JScrollPane mcqScrollPane;
    /**
     * Creates new form MarkerPanel
     */
    public MarkerPanel() {
        initComponents();
    }

    public MarkerPanel(JPanel panel, Controller controller) {
        initComponents();
        contentPane = panel;
        this.controller = controller;
        fibq = new FibqPanel(controller,this);
        essay = new EssayPanel(controller);
        mcqPanel = new McqPanel();
        markerPanel = new MarkerInitialPanel();
        treePane = new MarkerTreePanel(controller, this);
        treeScrollPane.setViewportView(treePane);
        treePane.createNodes();
        mcqScrollPane = new JScrollPane();
        redrawStudentBankPane();
    }
     public void redrawPanel(JPanel panel) {
        this.actionsPanel.removeAll();
        this.actionsPanel.setLayout(new java.awt.BorderLayout());
        this.actionsPanel.add(panel);
        this.actionsPanel.validate();
        this.actionsPanel.repaint();
    }
    
    public void updateStudentTree(){
        treePane.createNodes();
    }
    
    public void redrawMCQPanel(Mcq mcqObject) {
        this.actionsPanel.removeAll();
        this.actionsPanel.setLayout(new java.awt.BorderLayout());
        
        mcqPanel.setQuestion((Mcq)treePane.getSelectedObject());
        mcqScrollPane.setViewportView(mcqPanel);
        actionsPanel.add(mcqScrollPane);
        this.actionsPanel.validate();
        this.actionsPanel.repaint();
    }
    
    public void redrawFIBQPanel(Fibq fibqObject) {
        redrawPanel(fibq);
        fibq.setQuestion((Fibq)treePane.getSelectedObject());
        
    }
    
    public void redrawEssayPanel(Essay essayObject) {
       redrawPanel(essay);
       essay.setQuestion((Essay)treePane.getSelectedObject());
       
    }


    public void redrawStudentBankPane(){
        redrawPanel(markerPanel);
        
    }






    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        treeScrollPane = new javax.swing.JScrollPane();
        actionsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MELT Marker");
        lblTitle.setMaximumSize(new java.awt.Dimension(178, 40));
        lblTitle.setMinimumSize(new java.awt.Dimension(178, 40));

        actionsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        actionsPanel.setMinimumSize(new java.awt.Dimension(620, 520));

        javax.swing.GroupLayout actionsPanelLayout = new javax.swing.GroupLayout(actionsPanel);
        actionsPanel.setLayout(actionsPanelLayout);
        actionsPanelLayout.setHorizontalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        actionsPanelLayout.setVerticalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/return.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(treeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.show(contentPane, "welcomePanel");
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane treeScrollPane;
    // End of variables declaration//GEN-END:variables
}
