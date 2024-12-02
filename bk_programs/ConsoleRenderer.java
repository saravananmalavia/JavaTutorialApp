package graph;
public class ConsoleRenderer implements GraphicRenderer {
	
	public void renderCircle(Circle circle) {
		int x = circle.getX();
		int y = circle.getY();
		System.out.println("Circle at : (" + x +", "+ y +")");
	}
	public void renderRectangle(Rectangle rectangle) {
		int x = rectangle.getX();
		int y = rectangle.getY();
		System.out.println("Rectangle at : (" + x +", "+ y +")");
	}
	public void renderShape(Shape shape) {
		if(shape instanceof Circle) {
			renderCircle((Circle)shape);
			return;
		}
		if(shape instanceof Rectangle) {
			renderRectangle((Rectangle)shape);
			return;
		}
	}
}

