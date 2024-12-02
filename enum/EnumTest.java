enum Vehicles {
   //Constants with values
   ACTIVA125(80000), ACTIVA5G(70000), ACCESS125(75000), VESPA(90000), TVSJUPITER(75000);
   //Instance variable
   private int price;
   //Constructor to initialize the instance variable
   Vehicles(int price) {
      this.price = price;
   }
   public int getPrice() {
      return this.price;
   }
}
public class EnumTest{
   public static void main(String args[]) {
      Vehicles vehicles[] = Vehicles.values();
      for(Vehicles veh: vehicles) {
         System.out.println("Price of "+veh+" is: "+veh.getPrice());
      }
   }
}