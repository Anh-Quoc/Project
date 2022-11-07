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
public class Triangle extends Shape{
    private double SideA;
    private double SideB;
    private double SideC;
    
    public Triangle(){
        setSideA();
        setSideB();
        setSideC();
    }
    
    public void setSideA(){
        System.out.println("Please input side A of Triangle:");
        this.SideA = sc.nextDouble();
    }
    
    public void setSideB(){
        System.out.println("Please input side B of Triangle:");
        this.SideB = sc.nextDouble();
    }
    
    public void setSideC(){
        System.out.println("Please input side C of Triangle:");
        this.SideC = sc.nextDouble();
    }
    
    public double getSideA(){
        return this.SideA;
    }
    
    public double getSideB(){
        return this.SideB;
    }
    
    public double getSideC(){
        return this.SideC;
    }
    
    public double getPerimeter() {        
        return getSideA() + getSideB() + getSideC();
    }
    
    public double getArea(){
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }
    
    public void printResult (){
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + getSideA());
        System.out.println("Side B: " + getSideB());
        System.out.println("Side C: " + getSideC());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
