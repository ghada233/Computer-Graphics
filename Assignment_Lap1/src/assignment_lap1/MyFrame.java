/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_lap1;

import java.awt.*;
import javax.swing.*;
//  class "MyFrame and extends for laibary JFrame "
public class MyFrame extends JFrame{
//const
MyFrame(){
    /*
         we create the class name "MyPanel" and obj name "panel"
        and to create by uesing new and const "MyPanel()"
        
        */
 MyPanel panel = new MyPanel();
 //is give as x in window 
 JFrame MyFrame = new JFrame("فطر");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.add(panel);
 //display window
 this.pack();
 //make it in center 
  this.setLocationRelativeTo(null);
  //make it visible
  this.setVisible(true);
 }  
}