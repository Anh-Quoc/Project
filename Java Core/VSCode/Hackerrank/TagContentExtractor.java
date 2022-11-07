import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

    }

    public static void getElement(String line) {

        while (line.contains("<")) {
            String tag = line.substring(1, line.indexOf(">") - 1);
            String endTag = "</" + tag + ">";
            line = line.substring(tag.length() - 1, line.indexOf(endTag));
        }
        System.out.println(line);
    }

}
