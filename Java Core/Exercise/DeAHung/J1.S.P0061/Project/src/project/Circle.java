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
public class Circle extends Shape{
    private double Radius;
    
    public Circle(){
        setRadius();
    }
    
    public void setRadius(){
        System.out.println("Please input radius of Circle: ");
        this.Radius = sc.nextDouble();        
    }
    
    public double getRadius(){
        return this.Radius;
    }
    
    public double getPerimeter() {         
        return getRadius() * 2 * Math.PI;
    }
    
    public double getArea(){ 
        return getRadius() * getRadius() * Math.PI;
    }
    
    public void printResult (){
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }    
}
