package unit2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q7_IPfromInterface {
    public static void main(String[] args) {
        try {
            NetworkInterface ni = NetworkInterface.getByName("wireless_32768");

            if (ni != null) {
                System.out.println("Interface : " + ni.getName());
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    System.out.println("  IP : " + ips.nextElement().getHostAddress());
                }
            } else {
                System.out.println("Interface not found.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}