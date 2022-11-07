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
public class Student implements MainInterface{
    private String StudentName;
    private String Course;
    
    public void Student(){
        CreatStudentName();
        CreatStudentCourse();
    }
    public void CreatStudentName(){
        String StudentName = sc.nextLine();
        this.StudentName = StudentName;
    }
    public void CreatStudentCourse(){
        String Course = sc.nextLine();
        this.Course = Course;
    }    
}
