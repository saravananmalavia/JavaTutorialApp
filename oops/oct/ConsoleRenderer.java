
interface GraphicRenderer {

	public void renderShape(Shape shape);
	
}
class ConsoleRenderer implements GraphicRenderer {
	
	public void renderCircle(Circle circle) {
		int x = circle.getX();
		int y = circle.getY();
		System.out.println("Circle at : (" + x +", "+ y +")");
	}
	public void renderSquare(Square square) {
		int x = square.getX();
		int y = square.getY();
		System.out.println("Square at : (" + x +", "+ y +")");
	}
	public void renderShape(Shape shape) {
		if(shape instanceof Circle) {
			renderCircle((Circle)shape);
			return;
		}
		if(shape instanceof Square) {
			renderSquare((Square)shape);
			return;
		}
	}
}
