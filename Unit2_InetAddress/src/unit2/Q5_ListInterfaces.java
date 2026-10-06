package unit2;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q5_ListInterfaces {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> list =
                    NetworkInterface.getNetworkInterfaces();

            while (list.hasMoreElements()) {
                NetworkInterface ni = list.nextElement();
                System.out.println("Name    : " + ni.getName());
                System.out.println("Display : " + ni.getDisplayName());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}