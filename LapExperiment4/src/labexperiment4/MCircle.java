
package labexperiment4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JApplet;

//algrithm we take in 
public class MCircle extends JApplet {

    BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
    WritableRaster raster = image.getRaster();
    int r;

    MCircle(int r){
        this.r = r;
        init();
    }

    public void init() {
        setSize(600, 600);
        //remove paint 
        repaint();
    }
    //method from plane 
public void paint(Graphics g) {
        int []color = {255, 0, 0, 255};
        //center 
        //هنا جالسين نلعب بالسنتر وين تروح 
     //هنا اعتبروه الواي
        int xc=600-200;
        //هنا اعتروع الاكس 
        int yc=600/6;
        int p0 = 1 - r;
        int x0 = 0;
        int y0 = r;
        int pk = p0;
        //متغير اللي اععمل له تحديث 
        int x = x0;
        int y = y0;
     
        
        raster.setPixel(xc+x,yc+y, color);
        raster.setPixel(xc+x,yc-y, color);
        raster.setPixel(xc-x,yc+y, color);
        raster.setPixel(xc-x,yc-y, color);

           
        
while (x<y){
            System.out.println(x + " "+y);
            if(pk < 0)
            {
                pk = pk + 2*x + 3;
            }
            else
            {
                pk = pk + 2*(x-y) + 5;
               y--;
            }
           x++;
             raster.setPixel(xc+x,yc+y, color);
        raster.setPixel(xc+x,yc-y, color);
        raster.setPixel(xc-x,yc+y, color);
        raster.setPixel(xc-x,yc-y, color);

            raster.setPixel(xc+y,yc+x, color);
             raster.setPixel(xc+y,yc-x, color);
             raster.setPixel(xc-y,yc+x, color);
             raster.setPixel(xc-y,yc-x, color);
            
        }
//احنى نطبع القيم بالنص مو على الجنب
        g.drawImage(image, 0, 0, null);
    }
    }
