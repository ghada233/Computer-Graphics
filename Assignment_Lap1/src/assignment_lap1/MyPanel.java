/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_lap1;


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
  
   //لون الخلفية
   super.paintComponent(g);
   this.setBackground(Color.WHITE);
   
   //--------------------------------------------
    //تعليمات الفيقر 
  g2D.setPaint(Color.LIGHT_GRAY);
  g2D.drawRect(0,0, 500, 40);
  g2D.fillRect(0,0, 500, 40);
  g2D.setPaint(Color.red);
  g2D.setFont(new Font("Ink Free",Font.TYPE1_FONT,20));
  g2D.drawString("Applet ", 2, 20);

 //--------------------------------------------
  //الشمس
  g2D.setPaint(Color.red);
  g2D.drawOval(30, 30, 100, 100);
  g2D.setPaint(Color.yellow);
  g2D.fillOval(30, 30, 100, 100);
   //--------------------------------------------
   
  //تصميم الفطر من السطح 
  g2D.setPaint(new Color(120,30,40));
  g2D.drawOval(270, 120, 50, 50);
  g2D.fillOval(270, 120, 50, 50);
  g2D.setPaint(Color.pink);
  g2D.drawArc(345, 140, 55, 60, 300, -185);
  g2D.fillArc(345, 140, 55, 60, 300, -185);
  g2D.setPaint(Color.orange);
  g2D.drawArc(200, 150, 50, 50, 250, 190);
  g2D.fillArc(200, 150, 50, 50, 250, 190);
   //--------------------------------------------
   
  //شكل البيضاوي  
  g2D.setPaint(Color.red);
  g2D.drawArc(300, 200, 100, 100, 270 , 180); 
  g2D.setPaint(Color.red);
  g2D.drawArc(200, 200, 100, 100, 270 , -180);
  
   //--------------------------------------------
  //شكل المضلع بإستخدام اللاين 
  g2D.setPaint(Color.red);
  g2D.setStroke(new BasicStroke(8));
  g2D.drawLine(200, 250, 250, 100);
  g2D.setPaint(Color.red);
  g2D.setStroke(new BasicStroke(8));
  g2D.drawLine(400, 250, 350, 100);
  g2D.setPaint(Color.red);
  g2D.setStroke(new BasicStroke(8));
  g2D.drawLine(250, 100, 350, 100);
  
   //--------------------------------------------
  //عدت الكود عشان تسير ثقيلةالخاص بالشكل البيضاوي  
  g2D.setPaint(Color.red);
  g2D.drawArc(300, 200, 100, 100, 270 , 180);
  g2D.setPaint(Color.red);
  g2D.drawArc(200, 200, 100, 100, 270 , -180);
  
   //--------------------------------------------
  //ساق الفطر
  g2D.setPaint(Color.black);
  g2D.drawRect(250, 200, 100, 400);
  
   //--------------------------------------------
  //عشان اوازي 
  g2D.setPaint(Color.red);
  g2D.setStroke(new BasicStroke(8));
  g2D.drawLine(250,200, 350, 200);
  
   //--------------------------------------------
  //الارض 
  g2D.setPaint(Color.green);
  g2D.drawRect(0,400, 500, 200);
  g2D.fillRect(0,400, 500, 200);
  
   //--------------------------------------------
  
     //تعليمات الفيقر 
  g2D.setPaint(new Color(255,100,0));
  g2D.drawRect(0,500, 500, 400);
  g2D.fillRect(0,500, 500, 400);
  g2D.setPaint(Color.black);
  g2D.setFont(new Font("Ink Free",Font.TYPE1_FONT,20));
  g2D.drawString("Applet started", 0, 520);
  
   //--------------------------------------------
  
  //اسم اللوحة وتوقيعي
  g2D.setPaint(Color.black);
  g2D.setFont(new Font("Ink Free",Font.BOLD,30));
  g2D.drawString("mushroom ! :Ghada drwing", 0, 450);
  
   //--------------------------------------------
  //سحاب 
 
  //oval
  g2D.setPaint(Color.CYAN);
  g2D.drawOval(20,150, 100, 20);
  g2D.fillOval(20, 150, 100, 20);
  //oval
  g2D.setPaint(Color.CYAN);
  g2D.drawOval(40,180, 100, 20);
  g2D.fillOval(40, 180, 100, 20);
  //oval
  g2D.setPaint(Color.CYAN);
  g2D.drawOval(200,40, 100, 20);
  g2D.fillOval(200, 40, 100, 20);
  //oval
  g2D.setPaint(Color.CYAN);
  g2D.drawOval(370, 80, 100, 20);
  g2D.fillOval(370, 80, 100, 20);
  //oval
  g2D.setPaint(Color.CYAN);
  g2D.drawOval(350, 50, 100, 20);
  g2D.fillOval(350, 50, 100, 20);

 }
}
