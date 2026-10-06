package unit3;

import java.net.URI;

public class Q13_URIParts {
    public static void main(String[] args) {
        try {
            URI uri = new URI(
                "https://user:pass@www.example.com:8080/course/java.html?id=101#section1"
            );

            System.out.println("Scheme    : " + uri.getScheme());
            System.out.println("Authority : " + uri.getAuthority());
            System.out.println("UserInfo  : " + uri.getUserInfo());
            System.out.println("Host      : " + uri.getHost());
            System.out.println("Port      : " + uri.getPort());
            System.out.println("Path      : " + uri.getPath());
            System.out.println("Query     : " + uri.getQuery());
            System.out.println("Fragment  : " + uri.getFragment());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}