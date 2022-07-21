/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package butterfly;

import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class MyFrame extends JFrame{
//const
MyFrame(){
    /*
         we create the class name "MyPanel" and obj name "panel"
        and to create by uesing new and const "MyPanel()"
        
        */
 MyPanel panel = new MyPanel();
 
 setTitle("Butterfly");
 //is give as x in window 
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