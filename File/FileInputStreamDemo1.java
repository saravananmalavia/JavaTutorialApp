import java.io.FileInputStream;  
public class FileInputStreamDemo1 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin = new FileInputStream("testout.txt");    
            int i = fin.read(); 
            System.out.println(i); 
            System.out.println((char)i);    
  
            fin.close();    
          }catch(Exception e){
          	System.out.println(e);
          } 
    }    
}  