package graph;
import java.util.*;

public class Circle {
    private int radius;
    //double area;
    static double pi = 3.14;
    //double perimeter;
    private int x, y;

    public Circle(int radius, int x, int y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
    	return this.radius;
    }
    public void setXvalue(int x) {
        this.x = x;
    }
    public int getXvalue() {
    	return this.x;
    }
    

    public double findArea() {
      	return (Circle.pi * Math.pow(this.radius, 2));
    }

    /*public void readData() {

    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter radius");
    	radius = scanner.nextInt();
    }*/

	
}

