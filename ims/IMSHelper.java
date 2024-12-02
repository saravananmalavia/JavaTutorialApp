package ims.helper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;
public class IMSHelper{

	private static String inventoryFile;

	static{
		inventoryFile = "products.data";
	}

	public static void setInventoryFile(String file){
		inventoryFile = file;
	}


	public static Hashtable readData(){

		 FileInputStream inputFIS = null;
		 ObjectInputStream outputOIS = null;
		 Hashtable inventoryHT = null;
		 try {
		 	 inputFIS = new FileInputStream(inventoryFile);
			 outputOIS = new ObjectInputStream(inputFIS);

			 inventoryHT = (Hashtable) outputOIS.readObject();
			 inputFIS.close();
			 outputOIS.close();

			}
			catch(Exception e) {
				//e.printStackTrace();
				//System.out.println("IMSHelper.readData()");
			}

		 return inventoryHT;
	}
	public static boolean writeData(Hashtable inventoryHT){

		FileOutputStream outputFOS = null;
		ObjectOutputStream outputOOS = null;
		boolean result = false;

		try{
			outputFOS = new FileOutputStream(inventoryFile);
			outputOOS = new ObjectOutputStream(outputFOS);
			outputOOS.writeObject(inventoryHT);
			
			outputFOS.close();
			outputOOS.close();
			result = true;
		}
		catch(Exception e) {
			//e.printStackTrace();
			//result = true;
		}

		return result;
	}
}