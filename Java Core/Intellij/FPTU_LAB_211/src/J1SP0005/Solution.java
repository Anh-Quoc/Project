package J1SP0005;

import MainProject.ControlProgram;
import MainProject.Localized;
import MainProject.SolutionExercise;

import java.util.Arrays;

public class Solution extends SolutionExercise {

    private int[] intArray;

    public void run_J1SP0005(){
        create_Array();
        printArray(Localized.print_UnSorted_Array);

        MergeSort(intArray, 0, intArray.length - 1);
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

    public void MergeSort(int[] array, int low, int high){
        if(low < high){
            int middle = low + (high - low)/2;
            MergeSort(array, low, middle);
            MergeSort(array, middle + 1, high);
            Merge(array, low, middle, high);
        }
    }

    public void Merge(int[] array, int low, int middle, int high){
        int k = low;
        int n1 = middle - low + 1;
        int n2 = high - middle;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

//        for(int i = 0; i < n1; ++i){
//            arr1[i] = array[low + i];
//        }

        System.arraycopy(array, low, arr1, 0, n1);

        for(int i = 0; i < n2; ++i){
            arr2[i] = array[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        while(i < n1 && j < n2){
            array[k++] = (arr1[i] <= arr2[j]) ? arr1[i++] : arr2[j++];
        }

        while(i < n1){
            array[k++] = arr1[i++];
        }
        while (j < n2) {
            array[k++] = arr2[j++];
        }
    }

}
