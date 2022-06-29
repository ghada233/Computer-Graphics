/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package labexperiment2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JApplet;

/**
 *
 * @author hp
 */
public class DDA1 extends JApplet {
    //obj = image 
BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
//raster 
WritableRaster raster = image.getRaster();
//قبم عرفتها 
    int x1;
    int x2;
    int y1;
    int y2;
    //الكونستركتر
    DDA1(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        init();
    }

public void init() {
    //size 
        setSize(600, 600);
        //clear in windows 
        repaint();
    }
    public void paint(Graphics g) {
        //algorthim 
        //declear dx, dy 
        int dx, dy;
        //red/green/blue /الشفافسة 
        int color[] = {100, 250, 300, 255};
        int steps;
        dx = x2 - x1;
        dy = y2 - y1;
     if(Math.abs(dx) > Math.abs(dy))
            steps = Math.abs(dx);
        else
            steps = Math.abs(dy);
     
 float Xinc = (float)dx/steps;
        float Yinc = (float)dy/steps;
        raster.setPixel(x1, y1, color);
        float x = x1;
        float y = y1;
        System.out.println("x: " + x1 + " y: " + y1);
      for(int k = 1; k <= steps; k++){
            x+=Xinc;
            y+=Yinc;
            raster.setPixel(Math.round(x), Math.round(y), color);
            System.out.println("x: " + Math.round(x) + " y: " + Math.round(y));
        }
        g.drawImage(image, 0, 0, null);
    }
 }

