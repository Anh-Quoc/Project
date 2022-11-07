package J1SP0001;

import MainProject.ControlProgram;
import MainProject.Localized;
import MainProject.SolutionExercise;

import java.util.Arrays;

public class Solution extends SolutionExercise {

    private int[] intArray;

    public void run_J1SP0001(){

        create_Array();
        printArray(Localized.print_UnSorted_Array);

        bubble_Sort();
        printArray(Localized.print_Sorted_Array);
    }

    private void printArray(String message){
        System.out.print(message);
        System.out.println(Arrays.toString(intArray));
    }

    private void create_Array(){
        System.out.println(Localized.input_Length_Array);
        int sizeArray = Integer.parseInt(Localized.sc.nextLine());
        intArray = ControlProgram.create_RandomArray(sizeArray);
    }

    private void bubble_Sort(){
        for (int i = 0; i < intArray.length; ++i) {
            boolean haveSwap = false;
            for (int j = 0; j < intArray.length - 1; ++j) {
                if (intArray[j] > intArray[j + 1]) {
                    intArray[j] = intArray[j] + intArray[j + 1];
                    intArray[j + 1] = intArray[j] - intArray[j + 1];
                    intArray[j] = intArray[j] - intArray[j + 1];
                    haveSwap = true;
                }
            }
            if (!haveSwap) {
                break;
            }
        }
    }

}
