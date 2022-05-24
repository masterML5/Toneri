/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toneri;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Jelic
 */
public class Toneri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new Splash().setVisible(true);
        }
    });
      
    }
    
}
