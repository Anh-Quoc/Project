package J1SP0006;

import MainProject.ControlProgram;
import MainProject.Localized;

import java.util.Arrays;

public class Solution {

    private static int[] intArray;
    private static int searchValue;

    public static void main(String[] args) {
    	createArray();
        createSearchValue();

        quickSort(0, intArray.length - 1);
        printArray(Localized.print_Sorted_Array);

        search();
    }
           
    private static void createArray(){
        System.out.println(Localized.input_Length_Array);
        int sizeArray = Integer.parseInt(Localized.sc.nextLine());
        intArray = ControlProgram.create_Array(sizeArray);
    }

    private static void createSearchValue(){
        System.out.println(Localized.input_Message_SearchValue);
        searchValue = Integer.parseInt(Localized.sc.nextLine());
    }

    private static void printArray(String message){
        System.out.print(message);
        System.out.println(Arrays.toString(intArray));
    }

    private static void search(){
        int index = binarySearch(searchValue, 0,intArray.length - 1 );
        if(index != -1) {
            System.out.printf(Localized.message_Output_Value, searchValue);
        } else {
            System.out.print(Localized.value_NotFound);
        }
    }

    private static void quickSort(int begin, int end){
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

    public static int binarySearch(int searchValue ,int begin, int end){
        if(begin <= end){
            int middle = (begin + end)/2;
            if(searchValue == intArray[middle]){
                return middle;
            } else if(intArray[middle] < searchValue){
                return binarySearch(searchValue,middle + 1, end);
            } else if(intArray[middle] > searchValue){
                return binarySearch(searchValue, begin, middle - 1);
            }
        }
        return -1;
    }
}
