package login;
// import myutility.Helper;
// import myutility.Utility;
import myutility.*;

// to run java login.Authentication
// to compile  javac -d . Authentication.java

public class Authentication{

	public static void main(String args[]){

		Authentication auth1 = new Authentication();
		auth1.suggestPassword();

	}


	public void suggestPassword(){
		String pass;
		pass = Utility.generateRandomPassword(8);
		System.out.println("Password :" + pass);
		int randomNumber = Utility.getRandomInt(100);
		System.out.println("Random Int :" + randomNumber);

		System.out.println("IP :" + Helper.getIP());

	}
	



} 