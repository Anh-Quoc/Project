package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Project {    
    public static void main(String[] args){
        System.out.println("====== Collection Sort Program ======");        
        ArrayList<Student> ListStudent = new ArrayList<>();
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
        
        ListStudent = sortStudent(ListStudent);
        display(ListStudent);
    }

    static ArrayList<Student> sortStudent(ArrayList<Student> ListStudent){
        
        // Cái chỗ này này, nó sắp xếp kiểu gì chẳng hiểu

        Collections.sort(ListStudent, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                return (sv1.getName().compareTo(sv2.getName()));                
            }
        });
        
        return ListStudent;
    }

    static void display(ArrayList<Student> ListStudent){
        for(int i = 0 ; i < ListStudent.size() ; ++i){
            System.out.println("-------------Student "+ (i + 1) +"-------------");
            System.out.println("Name: " + ListStudent.get(i).getName());
            System.out.println("Classes: " + ListStudent.get(i).getClasses());
            System.out.println("Mark: " + ListStudent.get(i).getMark());
        }
    }
}
