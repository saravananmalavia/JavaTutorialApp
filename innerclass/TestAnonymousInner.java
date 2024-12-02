abstract class Person{  
  abstract void eat();  
}  

class Student extends Person{
void eat(){
    System.out.println("nice fruits");
  }

  method1(){

      Person p = new Student();

  }

}



class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p = new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  