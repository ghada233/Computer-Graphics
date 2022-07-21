/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package butterfly;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
        MyPanel(){
     //windows 
      this.setPreferredSize(new Dimension(500,550));
      
      
      
 }
        //method in class 
   @Override
   
 public void paint(Graphics g) {
     
   Graphics2D g2D = (Graphics2D) g;
 

  
  
 //body
  g2D.setPaint(Color.PINK);
  g2D.fillOval(100, 100, 40, 100);
  
  //wing
  
  

  g2D.setPaint(Color.CYAN);
  g2D.setStroke(new BasicStroke(4));
  g2D.drawArc(40, 100, 60, 90, 270, 180);
  
  
  g2D.setPaint(Color.CYAN);
  g2D.setStroke(new BasicStroke(4));
  g2D.drawArc(140, 100, 60, 90, 90, 180);
 
  //head 
g2D.setPaint(Color.DARK_GRAY);
g2D.fillOval(100, 80, 40, 40);

//

  g2D.setPaint(Color.MAGENTA);
  g2D.setStroke(new BasicStroke(3));
  g2D.drawLine(100,60, 110, 100);
  g2D.setPaint(Color.MAGENTA);
  g2D.setStroke(new BasicStroke(3));
  g2D.drawLine(150, 60, 130, 100);
  
  
  
 }
}