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
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("0" + "\n" + "1");
        FibonacciNext(-1,1,0);
    }
    
    public static void FibonacciNext(int Fibonacci1 , int Fibonacci2 , int Count){
        if(Count < 46){
            System.out.println(Fibonacci1 + Fibonacci2);
            FibonacciNext(Fibonacci2,Fibonacci1 + Fibonacci2,Count + 1);
        }
    }    
}
