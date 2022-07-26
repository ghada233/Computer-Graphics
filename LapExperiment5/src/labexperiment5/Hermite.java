/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexperiment5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JApplet;

public class Hermite extends JApplet {

    BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    WritableRaster raster = image.getRaster();
    private double controlPoints[][];
    private double steps;

    Hermite(double controPoints[][], int steps){
        this.controlPoints = controPoints;
        this.steps = steps;
    }

    public void init() {
        setBackground(Color.YELLOW);
        setSize(800, 600);
        repaint();
    }
    /*-------------Comment Line-------------------------------------------------------------
     *  Compute Hemite Cubic Points Derivatives 
     *  +-Hermite matrix--+   +-CP & TV---+  +-Parameter(u)-+
     *  |  2  -2   1   1  |   |  x0   y0  |
     *  | -3   3  -2  -1  | * |  x1   y1  | * [u^3 u^2 u 1] = [x, y]
     *  |  0   0   1   0  |   |  x'0  y'0 |
     *  |  1   0   0   0  |   |  x'1  y'1 |
     *  +-----------------+   +-----------+
     -------------------------------------------------------------------------*/
         int[] computePoint(float u){
        float h0,h1,h2,h3;
        //hermite blending functions 
        h0 =  2*u*u*u - 3*u*u + 1;
        h1 = -2*u*u*u + 3*u*u;
        h2 =    u*u*u - 2*u*u + u;
        h3 =    u*u*u -   u*u;
int ptx = (int)(h0 * controlPoints[0][0] + h1 * controlPoints[1][0] + h2 * controlPoints[2][0] + h3 * controlPoints[3][0]);
int pty = (int)(h0 * controlPoints[0][1] + h1 * controlPoints[1][1] + h2 * controlPoints[2][1] + h3 * controlPoints[3][1]);
int pts[] = {ptx, pty};
        return  pts;
    }

 public void paint(Graphics g) {
        int prevPointx = 0;
        int prevPointy = 0;
        int []color = {255, 0, 0, 255};
       /*------------------------------------------------------------------------
         * Increasing steps make curve smooth
        * U varies from 0 to 1-Hence i < steps
      */ 
        for(int i = 0; i < steps; i++){
            int[] pts = computePoint(i/(float)steps);
            int x = pts[0];
            int y = pts[1];


       // Draw the line from previous end point to the current end point
                if(i != 0)
                g.drawLine(prevPointx, prevPointy, x, y);
            prevPointx = x;
            prevPointy = y;
             raster.setPixel(x, y,color);
             raster.setPixel(y, x,color);
             raster.setPixel(x, x,color);
             
             int inc=200;
             int Colors []={0,0,250,100};
              raster.setPixel(x+inc, y+inc,Colors);
             raster.setPixel(y+inc, x+inc,Colors);
             raster.setPixel(x+inc, x+inc,Colors);
             
        }
        g.drawImage(image, 0, 0, null);
       

    }
}


        
 