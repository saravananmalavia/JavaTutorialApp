import java.io.FileOutputStream;  
public class FileOutputStreamDemo1 {  
    public static void main(String args[])throws Exception{    
          // try{  
           	// FileOutputStream fout=new FileOutputStream("D:\\testout.txt");      
             FileOutputStream fout = new FileOutputStream("testout4.txt");    
             fout.write(65);  
             fout.write(66);  
             fout.write(67);  
             fout.write(68);    
             fout.close();    
             System.out.println("success...");    
           /* }catch(Exception e){
            	System.out.println(e);
            }  */  
      }    
} 