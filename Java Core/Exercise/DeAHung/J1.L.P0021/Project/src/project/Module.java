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
public class Module implements MainInterface{
    public static void Creat(){
        for(int i = 0 ; i < 10 ; ++i){
            Student newStudent = new Student();
            ListStudent.add(newStudent);
        }        
        System.out.println("Do you want continue (Y/N)?");
        String UserChoose = sc.nextLine();
        if(UserChoose.equals("Y")){
            Creat();
        } else {
            
        }
    }
    public static void FindOrSort(){
        
    }
    public static void UpdateOrDelete(){
            
    }
}
