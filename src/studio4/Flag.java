package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor((int)(Math.random()*256),(int)(Math.random()*256) , (int)(Math.random()*256));
		StdDraw.filledRectangle(.5, .5, .4, .2);
		StdDraw.setPenColor((int)(Math.random()*256),(int)(Math.random()*256) , (int)(Math.random()*256));
		StdDraw.arc(.5, .3, .4, 0, 180);
		StdDraw.arc(.5, .7, .4, 180, 360);
		StdDraw.setPenColor((int)(Math.random()*256),(int)(Math.random()*256) , (int)(Math.random()*256));
		double[] xCord = {.6,0.35,.65,.4,.5};
		double[] yCord = {.35,.55,.55,.35,.65};
		StdDraw.filledPolygon(xCord,yCord);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .4, .2);
		
		
		
		
	}
}