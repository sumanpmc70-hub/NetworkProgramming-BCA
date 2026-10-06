package unit3;

import java.net.URL;
import java.io.*;

public class Q10_RetrieveData {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://pmc.tu.edu.np/");
            InputStream in = u.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}