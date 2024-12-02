package graph;
public abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
    }
	public void setX(int x) {
        this.x = x;
    }
    public int getX() {
    	return this.x;
    }
     public void setY(int y) {
        this.y = y;
    }
    public int getY() {
    	return this.y;
    }
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public abstract double calculateArea();
}