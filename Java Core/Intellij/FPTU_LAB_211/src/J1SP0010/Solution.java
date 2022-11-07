package J1SP0010;

import MainProject.ControlProgram;
import MainProject.Localized;
import MainProject.SolutionExercise;

import java.util.Arrays;

public class Solution extends SolutionExercise {

    private int[] intArray;
    private int searchValue;

    public void run_J1SP0010(){
        createArray();
        createSearchValue();
        printAnswer();
    }

    private void createArray(){
        System.out.println(Localized.input_Length_Array);
        int sizeOfArray = Integer.parseInt(Localized.sc.nextLine());
        intArray = ControlProgram.create_RandomArray(sizeOfArray);
    }

    private void createSearchValue(){
        System.out.println(Localized.input_Message_SearchValue);
        searchValue = Integer.parseInt(Localized.sc.nextLine());
    }

    private void printAnswer(){
        System.out.println(Localized.print_Array + Arrays.toString(intArray));
        int indexOfValue = searchIndexValue(searchValue);
        if(indexOfValue != -1){
            System.out.printf(Localized.message_Output_SearchValue, searchValue, indexOfValue);
        } else {
            System.out.println(Localized.value_NotFound);
        }
    }

    private int searchIndexValue(int searchValue){
        for(int i = 0; i < intArray.length; ++i){
            if(intArray[i] == searchValue){
                return i;
            }
        }
        return -1;
    }
}
