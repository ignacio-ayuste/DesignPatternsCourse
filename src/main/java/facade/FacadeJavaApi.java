package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeJavaApi {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http", "www.google.com.ar", 80, "");

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ( (line = br.readLine()) != null){
            System.out.println(line);
        }

    }

}