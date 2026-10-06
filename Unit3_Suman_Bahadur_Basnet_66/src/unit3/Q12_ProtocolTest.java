package unit3;

import java.net.URL;

public class Q12_ProtocolTest {

    static void test(String url) {
        try {
            URL u = new URL(url);
            System.out.println(u.getProtocol() + " is supported");
        } catch (Exception e) {
            String p = url.substring(0, url.indexOf(':'));
            System.out.println(p + " is NOT supported");
        }
    }

    public static void main(String[] args) {
        test("http://www.adc.org");
        test("https://www.amazon.com");
        test("ftp://ibiblio.org/pub/");
        test("mailto:abc@example.com");
        test("telnet://dibner.poly.edu/");
        test("gopher://gopher.anc.org.za/");
    }
}