package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WelcomeAll {
	public void welcome() {
		System.out.println("---------------------------------");
		System.out.println("Hello Everyone");
		System.out.println("---------------------------------");
	}
	
	public void getMachineDetails() {
		InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("---------------------------------");
            System.out.println("Current IP address : " + ip);
            System.out.println("Current Hostname : " + hostname);
            System.out.println("---------------------------------");
        } catch (UnknownHostException e) { 
            e.printStackTrace();
        }
	}
}
