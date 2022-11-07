    import java.net.URL;
    import java.net.URLConnection;
 
public class SendCookieWithHTTPRequest {
     
    public static void main(String[] args) throws Exception {
         
        URL url = new URL("https://fap.fpt.edu.vn/");
        URLConnection conn = url.openConnection();
 
        // Set the cookie value to send
        conn.setRequestProperty("Cookie", "ASP.NET_SessionId=bq1qjq5f3fgehw1jxhpncpzf");
 
        // Send the request to the server
        conn.connect();
         
    }
 
}