package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0,30);
		StdDraw.setYscale(0,18);
		
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(6,3,30,3);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(6, 9, 30,3);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(6, 15, 30,3);
	}
}