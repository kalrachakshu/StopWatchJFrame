/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author shivesh
 */
public class StopWatch {
    
    public static void pr(String f)
    {
        System.out.println(f);
    }

    public static void pr(int f)
    {
        System.out.println(f);
    }

    public static void pr(long f)
    {
        System.out.println(f);
    }

    
    public static void pr(Double f)
    {
        System.out.println(f);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Watch wt=new Watch();
        wt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        wt.setVisible(true);  
      
         
    }
    
}
