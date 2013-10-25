/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.CardLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import melt.Controller;
import melt.View.StaffPanel;
import melt.View.TestDetails;
import melt.View.marker.MarkerPanel;

/**
 *
 * @author panos
 */
public class Viewer extends javax.swing.JFrame {

    
    private Controller controller;
    private WelcomePanel welcomePanel;
    private StaffPanel createTest;
    private TestDetails testDetails;
    private StudentPanel takeTest;
    private MarkerPanel markerPanel;
    private TestList testList;
    public void setController(Controller controller){
        this.controller = controller;
        
    }
    
    
    public void displayGUI(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        contentPane.setLayout(new CardLayout());
        welcomePanel = new WelcomePanel(contentPane,this.controller);
        createTest = new StaffPanel(contentPane,this.controller);
        takeTest= new StudentPanel(contentPane,this.controller);
        markerPanel = new MarkerPanel(contentPane, this.controller);
        testList = new TestList(contentPane, this.controller);
        contentPane.add(welcomePanel,"welcomePanel");
        contentPane.add(createTest,"createTest");
        contentPane.add(takeTest,"takeTest");
        contentPane.add(markerPanel,"markTest");
        contentPane.add(testList,"testList");
        this.setContentPane(contentPane);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        cards = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout cardsLayout = new javax.swing.GroupLayout(cards);
        cards.setLayout(cardsLayout);
        cardsLayout.setHorizontalGroup(
            cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        cardsLayout.setVerticalGroup(
            cardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public void open(){
        
        //this.pack();
        controller.loadFromXmlFile();
        controller.loadStudentFile();
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                displayGUI();
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel cards;
    // End of variables declaration                   
}
