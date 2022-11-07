package J1SP0009;

import MainProject.Localized;
import MainProject.SolutionExercise;

import static MainProject.Localized.fibonacciArray;


public class Solution extends SolutionExercise {
    public void run_J1SP0009(){
        createFibonacciNumber(Localized.numberOfFibonacci);
        printFibonacci();
    }

    private void createFibonacciNumber(int size){
        fibonacciArray.add(0);
        fibonacciArray.add(1);
        for(int i = 2; i < size - 2; ++i){
            fibonacciArray.add(fibonacciArray.get(i - 2) + fibonacciArray.get(i - 2));
        }
    }

    private void printFibonacci(){
        System.out.println(Localized.print_45_Fibonacci_Number);
        for(int i : fibonacciArray){
            System.out.print(i + Localized.commaPunctuation + " ");
        }
    }

}
