import java.io.*;  
public class DataOutputStreamDemo1 {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("testout4.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.writeDouble(10.01); 
        data.flush();  
        data.close();  
        System.out.println("Succcess..."); 

	    InputStream input = new FileInputStream("testout4.txt");  
	    DataInputStream inst = new DataInputStream(input);
	    int i = inst.readInt(); 
	    double d = inst.readDouble(); 
	    System.out.println(i);
	    System.out.println(d); 

    }  
}  