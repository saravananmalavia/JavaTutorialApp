import java.util.*;
abstract class Shape{
   double area;
   static final double PI = 3.14;

   public abstract void findArea();

   public void display(){
    System.out.println("Area : " + area);
   }
}

class Circle extends Shape{
  double radius;
  public Circle(double r){
    radius = r;
  }
   public void findArea(){
    area = PI * Math.pow(radius,2);
      System.out.println(" Circle ");
    display();
   }
}
class Square  extends Shape{
  int side;
  public Square(int s){
    side = s;
  }
  public void findArea(){
    area = side * side;
       System.out.println(" Square ");
    display();
 }

}
class Triangle  extends Shape{
  int length;
  int height;
  int breadth;
  public Triangle(int l,int h,int b){
    length = l;
    height = h;
    breadth = b;
  }

  public void findArea(){
    area = 0.5 * breadth * height;
    System.out.println(" Triangle ");
    display();
 }
 

}

class Test{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    Shape shapes[] = new Shape[5];

    for(int i = 0; i < shapes.length;i++){

        System.out.println("Enter the option 1C/2S/3T");
        int option  = sc.nextInt();
        
        switch(option){
          case 1:
                  Circle circle1 = new Circle(5.0);
                  shapes[i] = circle1;
                  calculateArea(shapes[i]);
                  break;
          case 2:
                  Square s1 = new Square(10);
                   shapes[i] = s1;
                  calculateArea(shapes[i]);
                  break;
          case 3:
                      Triangle t1 = new Triangle(5,2,20);
                       shapes[i] = t1;
                      calculateArea(shapes[i]);
                  break;
        
        }
    }  
  }



  public static void calculateArea(Shape s1){

      s1.findArea();
  }


}

/*
//Shape shapes1;
shapes1 = new Shape();
//Shape shapes2;
shapes2 = new Shape();
//Shape shapes3;
shapes3 = new Shape();
//Shape shapes4;
shapes = new Shape();
//Shape shapes5;
shapes5 = new Shape();

int i1;
int i2;
int i3;
int i4;
int i5;

int values[] = new int[5];

Shape shapes[] = new Shape[5];
for(int i = 0;i<5;i++){
  shapes[i] = new Shape();
  shapes[i].findArea();
}

 shapes[1].findArea();
*/












