
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static final int DEFAULT_BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://fap.fpt.edu.vn/Report/ScheduleOfWeek.aspx");
        URLConnection conn = url.openConnection();

        // Set the cookie value to send
        conn.setRequestProperty("Cookie", "ASP.NET_SessionId=ybm0s1ixyp25cwwe4qjhtr1b");

        // Send the request to the server
        conn.connect();

        InputStream stream = conn.getInputStream();

        File file = new File("E:\\Java Core\\Intellij\\SendCookieWithHTTPRequest\\src\\Output.html");

        copyInputStreamToFile(stream, file);

        // Declaring an integer variable
//        int i;
//
//        // Till the time URL is being read
//        while ((i = stream.read()) != -1) {
//
//            // Continue printing the stream
//            System.out.print((char)i);
//        }
    }

    private static void copyInputStreamToFile(InputStream inputStream, File file)
            throws IOException {

        // append = false
        try (FileOutputStream outputStream = new FileOutputStream(file, false)) {
            int read;
            byte[] bytes = new byte[DEFAULT_BUFFER_SIZE];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        }

    }
}
