package studio4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {

    public static void main(String[] args) throws FileNotFoundException {
    
        JFileChooser chooser = new JFileChooser("resources");
        chooser.showOpenDialog(null);
        File f = new File(chooser.getSelectedFile().getPath());

        Scanner in = new Scanner(f);
        
    
        String shapeType = in.next();
        

        int red = in.nextInt();
        int green = in.nextInt();
        int blue = in.nextInt();
        

        boolean isFilled = in.nextBoolean();
        

        StdDraw.setPenColor(red, green, blue);
        
      
        if (shapeType.equals("rectangle")) {
           
            double x = in.nextDouble();
            double y = in.nextDouble();
            double halfWidth = in.nextDouble();
            double halfHeight = in.nextDouble();
            
            
            if (isFilled) {
                StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
            } else {
                StdDraw.rectangle(x, y, halfWidth, halfHeight);
            }
        }
      
        in.close();
    }
}