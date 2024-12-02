// demo throws key word


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ExceptionDemo8
{
    // Program to read input from console in Java by using `BufferedReader`
    public static void main(String[] args) //throws IOException // handled by JVM
    {
        try{
             getRead(); 
        }
        catch (IOException e) {
            e.printStackTrace();
         }
        
    }

    public static void getRead()throws IOException 
    {

        BufferedReader br = null;
        
       // try {
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
        // } catch (IOException e) {
        //    e.printStackTrace();
        //  }

    }




}