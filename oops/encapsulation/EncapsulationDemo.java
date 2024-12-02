import java.util.*;
public class EncapsulationDemo{
	public static void main(String[] args){  
			 
			 Message message1 = 	 new Message("Welcome to java programing");
			 message1.display();
			 //System.out.println(message1.message);
			
		}
}

class Message{
	private String message;
	public Message(){

	}
	public Message(String message){
	 	this.message = message;
	}
	public void display(){
		System.out.println(message);
	}


} 