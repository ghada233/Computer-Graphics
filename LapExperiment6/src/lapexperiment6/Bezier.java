/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lapexperiment6;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JApplet;

/**
 *
 * @author hp
 */
public class Bezier extends JApplet {
    BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    WritableRaster raster = image.getRaster();

    private final double controlPoints[][];
    private final double steps;

    Bezier(double controPoints[][], int steps){
        this.controlPoints = controPoints;
        this.steps = steps;
    }
    public void init() {
        setSize(1280, 720);
        repaint();
    }
    int[ ] computePoint(float u){
        float c0,c1,c2,c3;
        c0 =  1 - 3*u + 3*u*u - u*u*u;
        c1 =  3*u - 6*u*u + 3*u*u*u;
        c2 =  3*u*u - 3*u*u*u;
        c3 =  u*u*u;
        int ptx = (int)(c0 * controlPoints[0][0] + c1 * controlPoints[1][0] + c2 * controlPoints[2][0] + c3 * controlPoints[3][0]);
        int pty = (int)(c0 * controlPoints[0][1] + c1 * controlPoints[1][1] + c2 * controlPoints[2][1] + c3 * controlPoints[3][1]);
        int pts[] = {ptx, pty};
        return  pts;
    }
public void paint(Graphics g) {
        int prevPointx = 0;
        int prevPointy = 0;
        int color[] = {255, 0, 0, 255};
        for(int i = 0; i < steps; i++){
            int[] pts = computePoint(i/(float)steps);
            int x = pts[0];
            int y = pts[1];
            if(i != 0)
                g.drawLine(prevPointx, prevPointy, x, y);
            prevPointx = x;
            prevPointy = y;
            raster.setPixel(x, y,color);
        }
                g.drawImage(image, 0, 0, null);
    }
    }

