
package labexperiment2;

import java.awt.Dimension;
import javax.swing.JFrame;


public class LabExperiment2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter x1, y1, x2, y2, respectively(from zero to 600): ");
        //Scanner to broject 
          java.util.Scanner input = new java.util.Scanner(System.in);
        //object line from cladd DDA1 
        DDA1 line = new DDA1(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        JFrame frame = new JFrame("DDA Line");
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
