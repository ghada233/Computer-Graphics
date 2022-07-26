/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexperiment3;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class LabExperiment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.print("Enter x1, y1, x2, y2, respectively(from zero to 600): ");
        //Scanner to broject 
          java.util.Scanner input = new java.util.Scanner(System.in);
        //object line from cladd DDA1 
        Bresenham line = new Bresenham(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        //title for page 
        JFrame frame = new JFrame("Bresenham Line");

        //frame for page 
        frame.setSize(800, 800);
        //x for windows
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //الطباعه تكون في مساحة اقل 
        line.setPreferredSize(new Dimension(600,600));
        frame.add(line);
        //بالحجم اللي ابغاه
        frame.pack();
        //تكون ظاهرة 
        frame.setVisible(true);  
    }
    
}
