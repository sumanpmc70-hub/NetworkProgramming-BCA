package unit2;

import java.net.InetAddress;

public class Q4_IPv4IPv6 {
    public static void main(String[] args) {
        try {
            InetAddress ip4 = InetAddress.getByName("192.168.1.1");
            InetAddress ip6 = InetAddress.getByName("::1");

            System.out.println("IPv4 : " + ip4.getHostAddress());
            System.out.println("Bytes: " + ip4.getAddress().length);
            System.out.println("Type : " + (ip4.getAddress().length == 4 ? "IPv4" : "IPv6"));

            System.out.println("\nIPv6 : " + ip6.getHostAddress());
            System.out.println("Bytes: " + ip6.getAddress().length);
            System.out.println("Type : " + (ip6.getAddress().length == 16 ? "IPv6" : "IPv4"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}