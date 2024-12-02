package myutility; // it should be the very first statement in java file

// to compile  javac -d . Utility.java
import java.util.Random;
import java.security.SecureRandom;
public class Utility{

public static String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }

    public static int  getRandomInt(int bound){
    	 // create instance of Random class
        Random rand = new Random();
  
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(bound);
       
     	return rand_int1;
    }


   	public static void main(String args[]){

   		String password = generateRandomPassword(10);
   		System.out.println(password);
   	}

}
