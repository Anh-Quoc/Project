/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author hungh
 */
public abstract class Shape {    
    abstract double getPerimeter ();
    abstract double getArea ();
    abstract void printResult ();
    Scanner sc = new Scanner(System.in);
}
