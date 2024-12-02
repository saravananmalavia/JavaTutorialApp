package graph;
import java.util.*;

public class Circle extends Shape {
    private int radius;
    static double pi = 3.14;

    public Circle(int radius, int x, int y) {
		super(x, y);
        this.radius = radius;	
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
    	return this.radius;
    }
    public double calculateArea() {
      	return (Circle.pi * Math.pow(this.radius, 2));
    }

  /*  public void readData() {

    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter radius");
    	radius = scanner.nextInt();
    }*/

	
}



