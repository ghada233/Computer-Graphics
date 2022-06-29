/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexpeiment1;

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
      this.setPreferredSize(new Dimension(500,500));
      
      
 }
        //method in class 
   @Override
   
 public void paint(Graphics g) {
 /* 
  Graphics2D g2D = (Graphics2D) g;
  //line   
  g2D.setPaint(Color.blue);
  g2D.setStroke(new BasicStroke(5));
  g2D.drawLine(0, 0, 500, 500);
   
 //rec
  g2D.setPaint(Color.pink);
  g2D.drawRect(200, 200, 100, 200);
  g2D.fillRect(0, 0, 100, 200);
  //oval
  g2D.setPaint(Color.orange);
  g2D.drawOval(100, 100, 100, 100);
  g2D.fillOval(0, 0, 100, 100);
  //arc
   
   g2D.setPaint(Color.blue);
  g2D.drawArc(0, 0, 100, 100, 0, 90);
  g2D.fillArc(0, 0, 100, 100, 0, 90);
  g2D.setPaint(Color.black);
  g2D.fillArc(0, 0, 100, 100, 180, 180);
  
  //triangles
  
  int[] xPoints = {150,250,350};
  int[] yPoints = {300,150,300};
  g2D.setPaint(Color.yellow);
  g2D.drawPolygon(xPoints, yPoints, 3);
  g2D.fillPolygon(xPoints, yPoints, 3);

  //random polygons
  int[] xPoints1 = {500,270,3600,600,400};
  int[] yPoints1 = {500,160,320,400,400};
  g2D.setPaint(Color.yellow);
  g2D.drawPolygon(xPoints1, yPoints1, 5);
  g2D.fillPolygon(xPoints1, yPoints1, 5);

*/
    Graphics2D g2D = (Graphics2D) g;
      //سماء 
    super.paintComponent(g);
    this.setBackground(Color.CYAN);
    
     g2D.setPaint(Color.blue);
  g2D.setStroke(new BasicStroke(5));
  g2D.drawLine(200,200, 500, 500);
    g2D.setPaint(Color.pink);
  g2D.drawRect(100,100, 100, 200);
  g2D.fillRect(100,100, 100, 200);
    g2D.setPaint(Color.orange);
  g2D.drawOval(400,400, 100, 100);
  g2D.fillOval(400,400, 100, 100);
  g2D.setPaint(Color.red);
  g2D.drawArc(0, 0, 100, 100, 0, 180);
  g2D.fillArc(0, 0, 100, 100, 0, 180);
  g2D.setPaint(Color.white);
  g2D.fillArc(0,0, 100, 100, 180, 180);
  
  int[] xPoints = {150,250,350};
  int[] yPoints = {300,150,300};
  g2D.setPaint(Color.yellow);
  g2D.drawPolygon(xPoints, yPoints, 3);
  g2D.fillPolygon(xPoints, yPoints, 3);
  
  g2D.setPaint(Color.magenta);
  g2D.setFont(new Font("Ink Free",Font.BOLD,50));
  g2D.drawString("U R A WINNER! :Ghada", 50, 50);  
 }
}

 

 



