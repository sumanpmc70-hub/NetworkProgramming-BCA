package unit3;

import java.net.URLDecoder;

public class Q15_URLDecoder {
    public static void main(String[] args) {
        try {
            System.out.println(URLDecoder.decode("This+string+has+spaces", "UTF-8"));
            System.out.println(URLDecoder.decode("This%25string%25has%25percent%25signs", "UTF-8"));
            System.out.println(URLDecoder.decode("This%2Bstring%2Bhas%2Bpluses", "UTF-8"));
            System.out.println(URLDecoder.decode("This%2Fstring%2Fhas%2Fslashes", "UTF-8"));
            System.out.println(URLDecoder.decode("This%26string%26has%26ampersands", "UTF-8"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}