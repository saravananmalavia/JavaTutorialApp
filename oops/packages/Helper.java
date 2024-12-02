package myutility;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class Helper{

 public static String  getIP() {
	InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            return ip.toString();

            // System.out.println("Your current IP address : " + ip);
            // System.out.println("Your current Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
	}
}