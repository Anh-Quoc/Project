import java.io.*;
import java.util.*;

public class danchoixuFU {
    
    static String getNumberThroughMirror(int number){
        String[] listNumber = {"0", "1", "5", "null", "null", "2", "null", "null", "8", "null"};
        return listNumber[number];
    }

    public static void main(String[] args) {
        String time = "12:21";
        for(int i = time.length() - 1; i >= 0 ; --i){
            if(time.charAt(i) == ':'){
                continue;
            }
            int number = Integer.parseInt(String.valueOf(time.charAt(i)));
            System.out.println(getNumberThroughMirror(number));
        }
        
    }
}