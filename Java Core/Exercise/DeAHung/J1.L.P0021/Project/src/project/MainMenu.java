/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static project.Module.Creat;

/**
 *
 * @author hungh
 */
public class MainMenu implements MainInterface{
    public static boolean printMenu(){
        System.out.println("WELCOME TO STUDENT MANAGEMENT");    
        System.out.println("1. Create");
        System.out.println("2. Find or Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Repot");
        System.out.println("5. Exit");
        System.out.println("Please choose 1 to creat , 2 to Find or Sort,"
                + "3 to Update/ Delete , 4 to Report and 5 to Exit a program");
        
        String UserChoose = sc.nextLine();
        
        switch(UserChoose){
            case "1" :
                Creat();                                
                break;
            case "2" :
                
                break;
            case "3" :
                break;
            case "4" :
                break;
            case "5" :
                return false;
            default :                    
                System.out.print("Please import a number!");
        }
        return true;
    }
}        
