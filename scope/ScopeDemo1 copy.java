public class ScopeDemo1 {

public static void disp(){

}


  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);

    disp();
    print();


  }

  public static void print(){
  
}
}