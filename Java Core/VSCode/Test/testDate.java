import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Date;
import java.text.DateFormat;   
import java.text.SimpleDateFormat;   
import java.util.HashMap;

class testDate{
	public static void main(String[] args) {
		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
  //  		LocalDateTime now = LocalDateTime.now();  

   		// String stringNowDate = dtf.format(now);
  //  		System.out.println(stringNowDate);  

		// Date date = new Date();
		// long timeMilli = date.getTime();
		// System.out.println(timeMilli);
		// DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");   
		// Date date2 = new Date(timeMilli + 1000);
		// System.out.println(obj.format(date2));

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("hu", "hi");
		System.out.println(hashMap.get("hu"));
		hashMap.remove("hu");
		System.out.println(hashMap.get("hu"));
	}

}