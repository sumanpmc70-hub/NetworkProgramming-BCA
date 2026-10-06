package unit3;

import java.net.URL;

public class Q11_SplitURL {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.example.com:8080/course/java.html?id=101#section1");

            System.out.println("Protocol : " + u.getProtocol());
            System.out.println("Host     : " + u.getHost());
            System.out.println("Port     : " + u.getPort());
            System.out.println("Path     : " + u.getPath());
            System.out.println("File     : " + u.getFile());
            System.out.println("Query    : " + u.getQuery());
            System.out.println("Ref      : " + u.getRef());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}