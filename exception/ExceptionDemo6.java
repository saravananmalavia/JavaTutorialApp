// demo for checked and unchecked exception
// just comment the try catch block and compile

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ExceptionDemo6
{
    // Program to read input from console in Java by using `BufferedReader`
    public static void main(String[] args)
    {
        BufferedReader br = null;
        
        try {
            // Create a buffered character-input stream
            br = new BufferedReader(new InputStreamReader(System.in));
 
            // read the whole line
            System.out.println(br.readLine());
 
            // get double
            System.out.println(Double.parseDouble(br.readLine()));
 
            // get integer
            System.out.println(br.read());
 
            // close the stream
            br.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
