import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.io.InputStreamReader;

public class Main extends Thread {
    public static void main(String[] args) throws IOException {
        for (int j = 0; j < 50; ++j) {
            Main m1 = new Main();
            m1.start();
        }
    }

    public void run() {
        int i = 0;
        while (true) {
            ++i;
            System.out.println(i);
            getContentFrom("https://spiderum.com/bai-dang/BAN-VE-NHUNG-KHAI-NIEM-TRONG-NGANH-KI-THUAT-PHAN-MEM-10q5");
        }
    }

    public static void getContentFrom(String Link) {
        try {
            // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
            URL url = new URL(Link);
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}