abstract class Shape{
	double area;
	int x,y;

	public Shape(){

	}

	public Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setCordinate(int xValue,int yValue ){
		x = xValue;
		y = yValue;
	}	

	public void display(){
		System.out.println("area : " + this.area);
	}

	public abstract void findArea();

	public abstract void readShape();

}
