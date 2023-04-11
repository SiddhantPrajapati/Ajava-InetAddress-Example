import java.util.*;
import java.net.*;
import java.io.*;

public class InetExample {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.google.com");
		InetAddress ip2 = InetAddress.getLocalHost();
		//InetAddress lhn = InetAddress.getHostName("127.0.0.1");
		
		System.out.println("IP : " + ip);
		System.out.println("Local Host : " + ip2);
		System.out.println("Local Host Name : " + ip2.getHostName());
		System.out.println("Google's Host Address : " + ip.getHostAddress());
	}
}
		