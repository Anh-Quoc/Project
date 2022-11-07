/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hungh
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("====== Collection Sort Program ======");        
        ArrayList<Student> ListStudent = new ArrayList();
        while(true){
            Student newStudent = new Student();
            ListStudent.add(newStudent);
            System.out.print("Do you want to enter more student information?(Y/N):");            
            String UserInput = MainInterface.sc.nextLine();
            if(UserInput.equals("y") || UserInput.equals("Y")){
                
            } else {
                break;
            }
        }
                
        Collections.sort(ListStudent, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                return (sv1.getName().compareTo(sv2.getName()));                
            }
        });
        
        for(int i = 0 ; i < ListStudent.size() ; ++i){
            System.out.println("-------------Student "+ (i + 1) +"-------------");
            System.out.println("Name: " + ListStudent.get(i).getName());
            System.out.println("Classes: " + ListStudent.get(i).getClasses());
            System.out.println("Mark: " + ListStudent.get(i).getMark());
        }
    }
}
