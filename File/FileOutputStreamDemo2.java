import java.io.FileOutputStream;  
public class FileOutputStreamDemo2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testout2.txt");    
             String s="Welcome to File programming for android and JFSD.";    
             byte b[]=s.getBytes();//converting string into byte array    
            
             fout.write(b);    
             fout.close();    
            
             System.out.println("success...");    
            }catch(Exception e){
                System.out.println(e);
            }    
      }    
}  