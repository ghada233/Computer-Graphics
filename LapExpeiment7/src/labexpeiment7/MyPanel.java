/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexpeiment7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author ccse
 */
public class MyPanel extends JPanel {
      MyPanel(){
      this.setPreferredSize(new Dimension(500,500));
 }
     private void doTranslation(Graphics g) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setPaint(new Color(255, 0, 0, 255));
         //Translation
             Random r = new Random();
         int n =10;
         int x []={150, 180,200,220,250,220,250,200,180,180};
         int y[]={140,130,100,130,140,160,200,180, 200 ,160};
         for(int i=0; i<20; i++){
             
     g2d.translate(200, -200);
     g2d.rotate(Math.toRadians(50));
     g2d.setPaint(new Color( r.nextInt(254),  r.nextInt(254),  r.nextInt(254),  r.nextInt(254)));
     g2d.fillPolygon(x, y, n); 
        
         }
       
       g2d.dispose();
    }



    private void doRotation(Graphics g) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setPaint(new Color(255, 0, 0, 255));
         //Rotation
        g2d.fillOval(300, 200, 100, 250);
        g2d.translate(150, 50);
        g2d.rotate(Math.toRadians(40));
        g2d.fillOval(100, 100, 100, 250);
        g2d.translate(700, -420);
        g2d.rotate(Math.toRadians(-40));
        g2d.rotate(Math.toRadians(90));
        g2d.fillOval(100, 200, 100, 250);



        g2d.dispose();
    }
  
private void doScaling(Graphics g) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setPaint(new Color(255, 0, 0, 255));
         //Scaling
        g2d.fillRect(20, 20, 80, 50);
        AffineTransform tx1 = new AffineTransform();
        tx1.translate(110, 22);
        tx1.scale(0.5, 0.5);
        g2d.setTransform(tx1);
        g2d.fillRect(0, 0, 80, 50);
        AffineTransform tx2 = new AffineTransform();
        tx2.translate(170, 20);
        tx2.scale(1.5, 1.5);
        g2d.setTransform(tx2);
        g2d.fillRect(0, 0, 80, 50);
        g2d.dispose();
   }   

private void doShearing(Graphics g) {
          Graphics2D g2d = (Graphics2D) g.create();
          g2d.setPaint(new Color(255, 0, 0, 255));
         //Shearing
       AffineTransform tx1 = new AffineTransform();
        tx1.translate(50, 90);
        g2d.setTransform(tx1);
        g2d.setPaint(Color.green);
        g2d.drawRect(0, 0, 160, 50);
        AffineTransform tx2 = new AffineTransform();
        tx2.translate(50, 90);
        tx2.shear(0, 1);
        g2d.setTransform(tx2);
        g2d.setPaint(Color.blue);  
       g2d.draw(new Rectangle(0, 0, 80, 50));
       AffineTransform tx3 = new AffineTransform();
        tx3.translate(130, 10);
        tx3.shear(0, 1);
        g2d.setTransform(tx3);
        g2d.setPaint(Color.red);
        g2d.drawRect(0, 0, 80, 50);
        g2d.dispose();
   }      

     @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        doTranslation(g);
       // doRotation(g);
        //doScaling(g);
        //doShearing(g);

    }
}

