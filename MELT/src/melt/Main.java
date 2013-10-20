/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt;

import melt.View.Viewer;
import melt.Model.TestBank;

/**
 *
 * Class: Main
 * 
 * This class is the first class called by the program and it initializes
 * everything
 * 
 * @author mbaxkpg2
 */
public class Main {  
    
    public static void main(String[] args){

        TestBank model = new TestBank(); 
        Viewer view = new Viewer();
        Controller controller = new Controller(model, view, "melt.xml");
        view.setController(controller);
        //InterfaceClass interf = new InterfaceClass();
        view.open();
    }
}
