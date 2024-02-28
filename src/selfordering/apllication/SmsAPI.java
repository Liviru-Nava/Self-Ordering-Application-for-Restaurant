
package selfordering.apllication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class SmsAPI {
    public String sendSMS(String phoneno,double billvalue,String estimatetime,int preptime,int deliverytime)
    {
       String smsmessage=null;
    // Get values from input fields or other sources
        String apiKey = "";
        String user_id = "";
        String sender_id = "NotifyDEMO";
        String numbers = phoneno; // Replace with the telephone number
        String esttime = estimatetime;
        int prep = preptime; // Replace with the name obtained from input
        int delivery=deliverytime;
        double bill=billvalue;
        
        // Message composition
        String message = "Dear Customer ,\r\n\r\nYour Order Will be Ready in " +prep+" Minutes.and order will deliver within" +deliverytime+ " Minutes "+estimatetime+"\r\nYour Bill: Rs "+bill+" \r\nThank you for choosing us.";
        

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
              System.out.println("SMS Sent Successfully!"+numbers);
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
