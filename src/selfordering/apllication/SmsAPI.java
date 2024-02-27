
package selfordering.apllication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class SmsAPI {
    public String sendSMS(String billID,String phoneno,String Cusname,double billvalue,double remain)
    {
        String smsmessage=null;
    // Get values from input fields or other sources
        String apiKey = "abdfghjdswgfghdhsj";
        String user_id = "4154646";
        String numbers = phoneno; // Replace with the telephone number
        String sender_id = "NotifyDEMO";
        String name = Cusname; // Replace with the name obtained from input
        String bill=billID;
        double total=billvalue;
        double balanace=remain;
        // Message composition
        String message = "Hi " + name + ",\r\n\r\nYour order #"+bill+" has been confirmed! Ready within 12 mins.\r\nYour Bill: Rs "+total+" Balance: Rs "+balanace+"\r\nThank you for choosing us.\r\nEnjoy your meal!\r\n\r\n-Arthur's Pizza-\r\nHotline:011-3108746. ";

        // API URL
                String urlString = "https://app.notify.lk/api/v1/send" +
                "?user_id=" + user_id +
                "&api_key=" + apiKey +
                "&sender_id=" + sender_id +
                "&to=" + numbers +
                "&message=" + URLEncoder.encode(message);

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            // Read the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();

            // Handle the response data as needed
             System.out.println("SMS Sent Successfully!");
              smsmessage="SMS Sent Successfully!";
             
        } catch (IOException e) {
            // Handle any errors that occurred during the fetch
            
             System.out.println("SMS send Failed "+e.getMessage());
            

        }
        catch(Exception e)
        {
              System.out.println("SMS send Failed "+e.getMessage());
  
        }
        return smsmessage;
    }
    
    
}
