public class EnumDemo {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }



  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    Level myVar1 = Level.HIGH; 
   // System.out.println(myVar);

     switch(myVar1) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
          break;
      case HIGH:
        System.out.println("High level");
        break;
    }
    //for each 
    for (Level level : Level.values()) {
      //System.out.print( "test ");
 		 System.out.print(level + " ");
	 }

  }
}











