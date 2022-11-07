
//Complete this code or write your own from scratch
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// import java.io.*;

class JavaMap {
    public static void main(String[] argh) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Map<String, String> phoneBook = new HashMap<>();
        while (--size >= 0) {
            String name = br.readLine();
            String phone = br.readLine();
            phoneBook.put(name, phone);
        }

        String key;

        while ((key = br.readLine()) != null) {
            if (phoneBook.containsKey(key)) {
                System.out.println(key + "=" + phoneBook.get(key));
            } else {
                System.out.println("Not found");
            }
        }

        br.close();
    }
}
