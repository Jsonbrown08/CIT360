import java.net.*;
import java.io.*;

public class HttpReaderSample {
    public static void main(String[] args) throws Exception {
        URL byui = new URL("https://www.byui.edu");//Url we are pulling from 
        /*Note: has to have http or https in order to connect*/
        
        
        URLConnection see = byui.openConnection();//Opens the connection with the URL.
        
        //Read in the above object as it goes into the buffer using our connection.
        BufferedReader in = new BufferedReader(new InputStreamReader(see.getInputStream()));
        String inputLine;
        
        //As long as the "in" is not null, it will continue to print
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();//closes when finished 
    }
}

