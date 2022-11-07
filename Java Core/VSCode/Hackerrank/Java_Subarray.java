import java.io.*;
import java.util.*;

public class Java_Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        for(int i = 0; i < lengthArr; ++i){
            arr[i] = sc.nextInt();
        }

        int countSubArr = 0;
        for(int i = 0; i < arr.length; ++i){
            int sum = 0;
            for(int j = i; j < arr.length; ++j){
                sum += arr[j];
                if(sum < 0){
                    ++countSubArr;
                }
            }
        }
        System.out.println(countSubArr);
    }
}