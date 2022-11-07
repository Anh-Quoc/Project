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
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){        
        setWidth();
        setLength();
    }   
    
    public void setWidth(){
        System.out.println("Please input side width of Rectangle:");
        this.width = sc.nextDouble();
    }
    
    public void setLength(){
        System.out.println("Please input length of Rectangle:");
        this.length = sc.nextDouble();
    }        
    
    public double getWidth(){
        return this.width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getPerimeter() {        
        return (getWidth() + getLength()) * 2;
    }
    
    public double getArea(){
        return getWidth() * getLength();
    }
    
    public void printResult (){
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + getWidth());
        System.out.println("Length : " + getLength());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }    
}
