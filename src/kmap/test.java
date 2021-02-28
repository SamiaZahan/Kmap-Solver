/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmap;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static kmap.AbsoluteLayoutDemo.addComponentsToPane;
public class test {
     public static void addComponentsToPane(Container pane) {
    pane.setLayout(null);

    JButton b1 = new JButton("one");
    JButton b2 = new JButton("two");
    JButton b3 = new JButton("three");

    pane.add(b1);
    pane.add(b2);
    pane.add(b3);

    Insets insets = pane.getInsets();
    Dimension size = b1.getPreferredSize();
    b1.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
    size = b2.getPreferredSize();
    b2
        .setBounds(55 + insets.left, 40 + insets.top, size.width,
            size.height);
    size = b3.getPreferredSize();
    b3.setBounds(150 + insets.left, 15 + insets.top, size.width + 50,
        size.height + 20);
  }
     
   private static void createAndShowGUI() {
    //Make sure we have nice window decorations.
    JFrame.setDefaultLookAndFeelDecorated(true);

    //Create and set up the window.
    JFrame f = new JFrame();  // at first creating frame where we will work 
       f.setTitle("K-map simulator"); // setting title at the top
       f.setSize(650,530);            // setting frame size
       f.setVisible(true);            // setting the frame visible
       f.setLocationRelativeTo(null); // this helps to setting the frame in center
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for this,after clicking exit(cross) button....frame  directly close
       f.setResizable(false); //this helps so that frame must be constant not to be resize
       f.setLayout((LayoutManager) new AbsoluteLayoutDemo());  // using this select frame layout or design

      JLabel bg_image = new JLabel();
       bg_image.setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\bg.jpg"));
       f.add(bg_image); 
       
    //Set up the content pane.
    addComponentsToPane(f.getContentPane());

    
    
    //Size and display the window.
    Insets insets = f.getInsets();
    f.setSize(300 + insets.left + insets.right, 125 + insets.top
        + insets.bottom);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }   
}
