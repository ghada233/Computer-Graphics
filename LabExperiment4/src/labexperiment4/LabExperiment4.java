/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexperiment4;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class LabExperiment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input user  for  raduis  and <300
        System.out.print("Enter the radius of the circle(less than 300): ");
        java.util.Scanner input = new java.util.Scanner(System.in);
         MCircle circle = new MCircle(input.nextInt());
        JFrame frame = new JFrame("Bresenham Circle");
        frame.setSize(800, 800);
        //x windows 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sixe windo frame 
        circle.setPreferredSize(new Dimension(600,600));
        frame.add(circle);
        frame.pack();
        frame.setVisible(true);

    }
    
}
