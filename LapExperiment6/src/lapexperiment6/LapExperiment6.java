/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lapexperiment6;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class LapExperiment6 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double points[][]  = new double[4][2];
        System.out.println("Enter p0, p1, p2 ,p3 of x and y coordinates respectively");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }
        System.out.print("Enter how many steps to do: ");
        int steps = input.nextInt();
        JFrame frame = new JFrame("Bezier Cubic Spline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bezier curve = new Bezier(points, steps);
        curve.setPreferredSize(new Dimension(600, 600));
        frame.add(curve);
        frame.pack();
        frame.setVisible(true);
    }
}
