/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hungh
 */
import java.util.*;

public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            System.out.print("array[ " + i + " ] = ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; ++i) {

            int[] value = NumberMinInArray(i + 1, array);

            int NumberMin = value[0];
            int NumberMinLocation = value[1];

            if (array[i] > NumberMin) {
                int tg = array[i];
                array[i] = array[NumberMinLocation];
                array[NumberMinLocation] = tg;
            }
        }

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] NumberMinInArray(int Start, int[] array) {
        int Min = array[Start];
        int MinLocation = Start;

        for (int i = Start + 1; i < array.length; ++i) {
            if (Min > array[i]) {
                Min = array[i];
                MinLocation = i;
            }
        }

        return new int[]{Min, MinLocation};
    }
}
