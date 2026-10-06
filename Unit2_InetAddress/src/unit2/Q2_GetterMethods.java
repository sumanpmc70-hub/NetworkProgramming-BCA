package unit2;

import java.net.InetAddress;

public class Q2_GetterMethods {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name    : " + ip.getHostName());
            System.out.println("Canonical    : " + ip.getCanonicalHostName());
            System.out.println("Host Address : " + ip.getHostAddress());
            System.out.println("toString()   : " + ip.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}