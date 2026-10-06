package unit2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q9_FactoryGetter {
    public static void main(String[] args) {
        try {
            NetworkInterface ni = NetworkInterface.getByName("loopback_0");

            if (ni != null) {
                System.out.println("Name       : " + ni.getName());
                System.out.println("Display    : " + ni.getDisplayName());
                System.out.println("Loopback?  : " + ni.isLoopback());
                System.out.println("Up?        : " + ni.isUp());
                System.out.println("Virtual?   : " + ni.isVirtual());

                System.out.println("IPs        :");
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    System.out.println("  " + ips.nextElement().getHostAddress());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}