
package selfordering.apllication;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeEstimation 
{
    public String estimateTime(String currentTimeString, int minutesToAdd) 
    {
        //Parse the current time string to LocalTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime currentTime = LocalTime.parse(currentTimeString, formatter);
        
        //Add minutes to the current time
        LocalTime updatedTime = currentTime.plusMinutes(minutesToAdd);
        
        //Format the updated time to string
        String updatedTimeString = updatedTime.format(formatter);        
        return updatedTimeString;
    }    
}
