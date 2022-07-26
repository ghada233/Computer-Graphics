/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package labexperiment3;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JApplet;

/**
 *
 * @author hp
 */
public class Bresenham extends JApplet {

    BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    WritableRaster raster = image.getRaster();
    int x1;
    int x2;
    int y1;
    int y2;

    Bresenham(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        init();
    }
     public void init() {
        setSize(600, 600);
        repaint();
    }

    float updateP(float p, float dy, float dx){
        //يحدد المعادلة بناء على قيمة ال بي 
        return p < 0?  p + 2*dy : p + 2*(dy-dx);
    }
 public void paint(Graphics g) {
        float dx, dy;
        int color[] = {255, 0, 0, 255};
        dx = Math.abs( x2 - x1);
        dy = Math.abs(y2 - y1);
        float slope = dy / dx;
        boolean swapped = false;
        
        //ما احتاح اذا كان اقل من واحد 
     if(slope > 1){
            float temp = x1;
            x1 = y1;
            y1 = (int)temp;
            temp = x2;
            x2 = y2;
            y2 = (int)temp;
            temp = dx;
            dx = dy;
            dy = temp;
            swapped = true;
        }
     //اول بي موجودة عندي 
        float p = 2*dy - dx;
        raster.setPixel(x1, y1, color);
//جمل طباعه
        for(int k = 1; k <= dx; k++){
            if(swapped)
                System.out.println("x: " + y1 + " y: " + x1);
            else
                System.out.println("x: " + x1 + " y: " + y1);
            //بناء على حالة الكود 
            if (p<0){
                if(x1 < x2)
                    x1++;
                else
                    x1--;
            }
    else{
                if(y1 < y2)
                    y1++;
                else
                    y1--;
 if(x1 < x2)
                    x1++;
                else
                    x1--;
            }
            //update p 
p = updateP(p, dy, dx);
            if(slope>1)
                raster.setPixel(y1, x1, color);
            else
                raster.setPixel(x1, y1, color);
        }
if(swapped)
            System.out.println("x: " + y1 + " y: " + x1);
        else
            System.out.println("x: " + x1 + " y: " + y1);
        g.drawImage(image, 0, 0, null);
    }  }

