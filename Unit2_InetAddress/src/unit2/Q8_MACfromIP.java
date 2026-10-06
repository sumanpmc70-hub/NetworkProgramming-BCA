package unit2;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class Q8_MACfromIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("192.168.0.131");
            NetworkInterface ni = NetworkInterface.getByInetAddress(ip);

            if (ni != null) {
                System.out.println("IP  : " + ip.getHostAddress());
                System.out.println("Interface : " + ni.getName());

                byte[] mac = ni.getHardwareAddress();
                if (mac != null) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : mac) {
                        sb.append(String.format("%02X:", b));
                    }
                    System.out.println("MAC : " + sb.toString());
                }
            } else {
                System.out.println("No interface for this IP.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}