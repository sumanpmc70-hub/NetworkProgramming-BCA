package unit2;

import java.net.InetAddress;

public class Q1_DisplayIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address : " + ip.getHostAddress());
            System.out.println("Host Name  : " + ip.getHostName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}