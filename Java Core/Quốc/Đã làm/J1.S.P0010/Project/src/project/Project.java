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
        
        System.out.print("Input length array : ");        
        int[] arr = new int[sc.nextInt()];
        
        Random rd = new Random();        
        
        for(int i = 0 ; i < arr.length ; ++i){
            arr[i] = rd.nextInt(arr.length);
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        System.out.print("\nInput nummber need seach : ");
        int Number = sc.nextInt();      
        
        
        Project project = new Project();                
        project.SeachNumber(arr , Number);                    
    }
    
    public boolean SeachNumber(int[] arr , int NumberNeedSeach){
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] == NumberNeedSeach){
                System.out.print("Found " + NumberNeedSeach + " at index " + i + " ");
                return true;
            }
        }
        System.out.print(NumberNeedSeach + " is not found in array");
        return false;
    }
}
