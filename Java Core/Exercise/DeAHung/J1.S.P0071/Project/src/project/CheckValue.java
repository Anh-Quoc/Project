package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckValue {
    static boolean CheckDate(String Date){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);        
        try {
           simpleDateFormat.parse(Date);
           return true;
        } catch (ParseException  e){
            System.out.println("Date must be format dd-MM-yyyy!");
        }        
        return false;
    }
    static boolean CheckTime(double time){
        if(time >= 8 && time <= 17.5){
            return true;
        } else {
            System.out.println("Plan From, Plan To calculate from 8h -> 17h30");
            return false;
        }
    }
}
