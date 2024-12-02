class Abc

 {

    public Abc(){
        
    }

    public int Abc(){
        return 10;
    }
    public static int main(int args){
      System.out.println("a1.Abc()");
      return args;
    }
     static  public void main(String... args)

     {

         String[] elements = { "for", "tea", "too" };

         String first = (elements.length > 0) ? elements[0]: null;

         Abc a1 = new Abc();
         System.out.println(a1.Abc());

     }

 }