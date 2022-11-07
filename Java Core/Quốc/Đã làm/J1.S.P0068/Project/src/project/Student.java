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
    private String name;
    private float mark;
    private String classes;
    
    public Student(){        
        System.out.println("Please input student information");
        setName();
        setClasses();
        setMark();        
    }
    
    public void setName(){
        System.out.print("Name: ");        
        this.name = sc.nextLine();
    }
    
    public void setMark(){
        System.out.print("Mark: ");
        String mark = sc.nextLine();
        try {
            this.mark = Float.parseFloat(mark);
        } catch (Exception e){
            System.out.println("Please import a number!");
            setMark();
        }         
    }
    
    public void setClasses(){
        System.out.print("Classes: ");        
        this.classes = sc.nextLine();
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getMark(){
        return this.mark;
    }
    
    public String getClasses(){
        return this.classes;
    }
}
