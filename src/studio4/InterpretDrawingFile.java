package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled =  in.nextBoolean();
		double parameterOne;
		double parameterTwo;
		double parameterThree;
		double parameterFour;
		double parameterFive;
		double parameterSix;
		
		if(shapeType.equals("ellipse")) {
			parameterOne = in.nextDouble();
			parameterTwo = in.nextDouble();
			parameterThree = in.nextDouble();
			parameterFour = in.nextDouble();
	
			if(isFilled) {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		
			
		}
		
		if(shapeType.equals("rectangle")) {
			parameterOne = in.nextDouble();
			parameterTwo = in.nextDouble();
			parameterThree = in.nextDouble();
			parameterFour = in.nextDouble();
			
			if(isFilled) {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			
			
		}
		
		if(shapeType.equals("triangle")) {
			parameterOne = in.nextDouble();
			parameterTwo = in.nextDouble();
			parameterThree = in.nextDouble();
			parameterFour = in.nextDouble();
			parameterFive = in.nextDouble();
			parameterSix = in.nextDouble();
			
			double[] xCord = {parameterOne, parameterThree, parameterFive};
			double[] yCord = {parameterTwo, parameterFour, parameterSix};
		
			if(isFilled) {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.filledPolygon(xCord,yCord);
			}
			else {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.polygon(xCord, yCord);
			}
			
			
		}
		

		
		
	}
}
