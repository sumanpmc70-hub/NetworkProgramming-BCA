package unit2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Q6_IPandMAC {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> list =
                    NetworkInterface.getNetworkInterfaces();

            while (list.hasMoreElements()) {
                NetworkInterface ni = list.nextElement();

                if (!ni.getInetAddresses().hasMoreElements()) continue;

                System.out.println("Interface : " + ni.getName());

                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    System.out.println("  IP  : " + ips.nextElement().getHostAddress());
                }

                byte[] mac = ni.getHardwareAddress();
                if (mac != null) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : mac) {
                        sb.append(String.format("%02X:", b));
                    }
                    System.out.println("  MAC : " + sb.toString());
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}