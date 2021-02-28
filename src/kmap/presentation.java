 
package kmap;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon; // for label
import javax.swing.JButton; // for button
import javax.swing.JFrame;  //for frame
import javax.swing.JLabel;
import javax.swing.JPanel;  //for panel
import javax.swing.JTextField;



public class presentation
{
  
   public static void main(String args[])
    {
      JFrame f = new JFrame();  // at first creating frame where we will work 
       f.setTitle("K-map simulator"); // setting title at the top
       f.setSize(800,600);            // setting frame size
       f.setVisible(true);            // setting the frame visible
       f.setLocationRelativeTo(null); // this helps to setting the frame in center
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for this,after clicking exit(cross) button....frame  directly close
       f.setResizable(false); //this helps so that frame must be constant not to be resize
       f.setContentPane(new JLabel(new ImageIcon("G:\\Kmap\\kmap\\icon\\bg.jpg"))); //this method helps to add background image upper on the jframe without jlebel
       f.setLayout(null);
       
      //jpanel for creating tabl
       JPanel table = new JPanel(); 
       table.setBounds(268, 232, 335, 230);// set the table position,if here the size up down the button size must be up & down
       table.setBackground(Color.GRAY);   //set the table colour
       table.setLayout(new GridLayout(4, 4)); //set the layout of table ,where gridlayout helps to create table by rows & collumns
   
      //creating button & add this button into panel 
       JButton b[] =new JButton[16];
       int value[] = new int[16];
       for(int i=0;i<16;i++)
       {
         b[i]=new JButton();
         b[i].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
         b[i].setBackground(Color.GRAY);  //set the button color
         table.add(b[i]);  //add button in table panel 
         table.validate();
         value[i]=0;
       }
       //refresh button
       JButton refresh = new JButton("Refresh");
       refresh.setBounds(630, 100, 90, 40);
       refresh.setBackground(Color.GRAY);
       //result button
       JButton result = new JButton("Result");
       result.setBounds(630, 250, 90, 40);
       result.setBackground(Color.GRAY);
       //add jtextfield for showing sop form output
       JTextField output = new JTextField("output text");
       output.setEnabled(false);
       output.setBounds(630, 400, 100, 50);
       output.setBackground(Color.BLACK);
       
       //add table+buttons+jtextfield in frame
       f.add(refresh);
       f.add(result);
       f.add(table);
       f.add(output);
       //validating the buttons & frame . validating means deleting previous redraw in every call.
       //we don't validate jtextfield bacause it is directly collect value so there is no redraw.
       refresh.validate();
       result.validate();
       f.validate();
       
       //works of buttons
       //1st button
       b[0].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[0]++;
           value[0]=value[0]%3;
           switch(value[0])
           {
               case 0: 
                   b[0].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[0].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[0].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });
       
       //2nd button
       b[1].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[1]++;
           value[1]=value[1]%3;
           switch(value[1])
           {
               case 0: 
                   b[1].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[1].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[1].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });
       
       //3rd button
       b[2].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[2]++;
           value[2]=value[2]%3;
           switch(value[2])
           {
               case 0: 
                   b[2].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[2].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[2].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });  
       
       //4th button
       b[3].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[3]++;
           value[3]=value[3]%3;
           switch(value[3])
           {
               case 0: 
                   b[3].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[3].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[3].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 
       
       //5th button
       b[4].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[4]++;
           value[4]=value[4]%3;
           switch(value[4])
           {
               case 0: 
                   b[4].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[4].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[4].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });  
       
       //6th button
       b[5].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[5]++;
           value[5]=value[5]%3;
           switch(value[5])
           {
               case 0: 
                   b[5].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[5].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[5].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });

       //7th button
       b[6].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[6]++;
           value[6]=value[6]%3;
           switch(value[6])
           {
               case 0: 
                   b[6].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[6].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[6].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 
       
       //8th button
       b[7].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[7]++;
           value[7]=value[7]%3;
           switch(value[7])
           {
               case 0: 
                   b[7].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[7].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[7].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });        
       
       
       //9th button
       b[8].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[8]++;
           value[8]=value[8]%3;
           switch(value[8])
           {
               case 0: 
                   b[8].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[8].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[8].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 

       //10th button
       b[9].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[9]++;
           value[9]=value[9]%3;
           switch(value[9])
           {
               case 0: 
                   b[9].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[9].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[9].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });   
       
       //11th button
       b[10].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[10]++;
           value[10]=value[10]%3;
           switch(value[10])
           {
               case 0: 
                   b[10].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[10].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[10].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 

       //12th button
       b[11].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[11]++;
           value[11]=value[11]%3;
           switch(value[11])
           {
               case 0: 
                   b[11].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[11].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[11].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });  
       
       //13th button
       b[12].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[12]++;
           value[12]=value[12]%3;
           switch(value[12])
           {
               case 0: 
                   b[12].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[12].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[12].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });  
      
       //14th button
       b[13].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[13]++;
           value[13]=value[13]%3;
           switch(value[13])
           {
               case 0: 
                   b[13].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[13].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[13].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    });   
       
       //15th button
       b[14].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[14]++;
           value[14]=value[14]%3;
           switch(value[14])
           {
               case 0: 
                   b[14].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[14].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[14].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 

       //16th button
       b[15].addActionListener(new ActionListener() {
         @Override
          public void actionPerformed(ActionEvent e) {
           value[15]++;
           value[15]=value[15]%3;
           switch(value[15])
           {
               case 0: 
                   b[15].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                   break;
               case 1: 
                   b[15].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\zero.jpg"));
                   break;
               case 2: 
                   b[15].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\one.jpg"));
                   break;
           }
      }
       
    }); 
       
     
     
        //refresh button
       //reset all value to x    
       refresh.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0;i<16;i++)
                {
                   b[i].setIcon(new ImageIcon("G:\\Kmap\\kmap\\icon\\cross.jpg"));
                }
          }
      });
}
}
