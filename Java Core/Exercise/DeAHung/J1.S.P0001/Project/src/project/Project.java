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

import java.util.*;

public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();		
	Random rd = new Random();

	int[] array = new int[n];
	for(int i = 0 ; i < n ; ++i){
            array[i] = rd.nextInt(n);
            System.out.print(array[i] + " ");
	}

	System.out.println("");
	int SoLan = 0;

	for(int i = 0 ; i < n; ++i ){
            for(int j = 0 ; j < n - SoLan - 1; ++j){
		if(array[j] > array[j +1] ) {
                    int tg = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tg;
		}
            }
            ++SoLan;			
	}

	for(int i = 0 ; i < n ; ++i){
            System.out.print(array[i] + " ");
	}
    }        
}
