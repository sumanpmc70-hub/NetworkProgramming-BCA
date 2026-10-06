package unit2;

import java.net.InetAddress;

public class Q3_AddressTypes {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            System.out.println("IP         : " + ip.getHostAddress());
            System.out.println("Loopback?  : " + ip.isLoopbackAddress());
            System.out.println("AnyLocal?  : " + ip.isAnyLocalAddress());
            System.out.println("LinkLocal? : " + ip.isLinkLocalAddress());
            System.out.println("SiteLocal? : " + ip.isSiteLocalAddress());
            System.out.println("Multicast? : " + ip.isMulticastAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}