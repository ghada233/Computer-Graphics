/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexperiment5;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class LabExperiment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        java.util.Scanner input = new java.util.Scanner(System.in);
        double points[][]  = new double[4][2];
        System.out.println("Enter p1, p2, p1', p2' respectively");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }
        System.out.print("Enter how many steps to do: ");
        int steps = input.nextInt();
        JFrame frame = new JFrame("Hermite splines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hermite curve = new Hermite(points, steps);
        curve.setPreferredSize(new Dimension(600, 600));
        frame.add(curve);
        frame.pack();
        frame.setVisible(true);
    }
}
