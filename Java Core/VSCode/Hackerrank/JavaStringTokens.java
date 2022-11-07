import java.util.*;

public class JavaStringTokens {
    // A -> Z : 65 -> 90
    // a -> z : 97 -> 122
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next();
        // Write your code here.
        s = s.trim();
        if (s.length() > 0) {
            String[] string = s.split("[!,?._'@\\s]+");
            System.out.println(string.length);
            for (int i = 0; i < string.length; ++i) {
                System.out.println(string[i]);
            }
        } else {
            System.out.println("0");
        }

        scan.close();
    }
}
