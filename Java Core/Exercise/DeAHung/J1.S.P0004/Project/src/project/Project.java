/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hungh
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");                   
        int[] array = new int[sc.nextInt()];
        Random rd = new Random();
        
        for(int i = 0 ; i < array.length ; ++i){
            array[i] = rd.nextInt(array.length);            
        }
        
        
    }   
    
}
