import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();
            for (int i = 0; i < a.length(); ++i) {
                if (b.contains(Character.toString(a.charAt(i)))) {
                    String b1 = b.substring(0, b.indexOf(Character.toString(a.charAt(i))));
                    String b2 = b.substring(b.indexOf(Character.toString(a.charAt(i))) + 1);
                    b = b1 + b2;
                    String a1 = a.substring(0, i);
                    String a2 = a.substring(i + 1);
                    a = a1 + a2;
                    --i;
                    System.out.println(a + " " + b + " ");
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagramm";
        String b = "marganaa";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}