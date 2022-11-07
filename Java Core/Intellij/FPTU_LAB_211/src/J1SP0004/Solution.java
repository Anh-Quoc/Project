package J1SP0004;

import MainProject.ControlProgram;
import MainProject.Localized;
import MainProject.SolutionExercise;

import java.util.Arrays;

public class Solution extends SolutionExercise {

    private int[] intArray;

    public void run_J1SP0004(){
        create_Array();
        printArray(Localized.print_UnSorted_Array);

        quickSort(0, intArray.length - 1);
        printArray(Localized.print_Sorted_Array);
    }

    private void create_Array(){
        System.out.println(Localized.input_Length_Array);
        int sizeArray = Integer.parseInt(Localized.sc.nextLine());
        intArray = ControlProgram.create_RandomArray(sizeArray);
    }

    private void printArray(String message){
        System.out.print(message);
        System.out.println(Arrays.toString(intArray));
    }

    private void quickSort(int begin, int end){
        int i = begin;
        int j = end;
        int key = intArray[(begin + end)/2];

        while(i <= j){
            while(intArray[i] < key) ++i;
            while(intArray[j] > key) --j;

            if(i <= j){
                int value = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = value;
                ++i; --j;
            }
        }
        if (i < end) quickSort(i, end);
        if (j > begin) quickSort(begin, j);
    }

}
