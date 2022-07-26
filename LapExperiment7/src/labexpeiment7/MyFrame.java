package labexpeiment7;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;

public class MyFrame extends JFrame{

MyFrame(){
  MyPanel panel = new MyPanel();
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.add(panel);
  this.setLocationRelativeTo(null);
  this.setVisible(true);
  setSize(800,800); 
 }  }
  
