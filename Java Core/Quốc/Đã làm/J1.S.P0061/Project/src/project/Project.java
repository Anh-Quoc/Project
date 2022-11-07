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
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        Rectangle newRectangle = new Rectangle();
        Circle newCircle = new Circle();
        Triangle newTriangle = new Triangle();
        
        newRectangle.printResult();
        newCircle.printResult();
        newTriangle.printResult();
    }    
}
