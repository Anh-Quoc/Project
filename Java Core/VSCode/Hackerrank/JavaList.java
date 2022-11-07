
// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < L; ++i) {
            arrList.add(sc.nextInt());
        }

        int Q = sc.nextInt();
        while (Q-- > 0) {
            switch (sc.next()) {
                case "Insert":
                    arrList.add(sc.nextInt(), sc.nextInt());
                    break;

                case "Delete":
                    arrList.remove(sc.nextInt());
                    break;

                default:
                    System.out.println("Invalid operation.");
                    System.exit(-1);
                    break;
            }
        }
        for (int i : arrList) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}