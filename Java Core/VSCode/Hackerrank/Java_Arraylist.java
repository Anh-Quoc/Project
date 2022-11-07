import java.io.*;
import java.util.*;

public class Java_Arraylist {
    private static ArrayList<ArrayList<Integer>> listNumber;
    private static ArrayList<ArrayList<Integer>> listQueries;
    private static final int INPUT_VALUE = 1;
    private static final int INPUT_QUERIE = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = Integer.parseInt(sc.nextLine());
        listNumber = new ArrayList<>(inputArrayNumber(n, INPUT_VALUE));       
        
        int q = Integer.parseInt(sc.nextLine());
        listQueries = new ArrayList<>(inputArrayNumber(q, INPUT_QUERIE));        
        queriesNumber();
    }

    private static ArrayList inputArrayNumber(int numberOfLine, int start){
        ArrayList<ArrayList<Integer>> listData = new ArrayList<>();
        for(int i = 0; i < numberOfLine; ++i){
            String[] arrNumberInLine = sc.nextLine().split(" ");            
            ArrayList<Integer> listNumberInLine = new ArrayList<>();
            for(int j = start; j < arrNumberInLine.length; ++j){
                listNumberInLine.add(Integer.parseInt(arrNumberInLine[j]));                
            }
            listData.add(listNumberInLine);
        }
        return listData;
    }

    private static void queriesNumber(){
        for(int i = 0; i < listQueries.size(); ++i){           
            int x = listQueries.get(i).get(0) - 1;
            int y = listQueries.get(i).get(1) - 1;
            
            try {
                System.out.println(listNumber.get(x).get(y));                
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }

    private static void printListNumber(ArrayList<ArrayList<Integer>> listData){
        System.out.println();
        for(int i = 0; i < listData.size(); ++i){
            for(int j = 0; j < listData.get(i).size(); ++j){
                System.out.print(listData.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }   
}