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
        File a = new File();
        System.out.println("----- Result Analysis -----");
        System.out.println("Disk: " + a.getDisk());
        System.out.println("Extension: " + a.getExtension());
        System.out.println("File Name: " + a.getFileName());
        System.out.println("Path: " + a.getPath());
        System.out.println("Folders: " + a.getFolders());
    }    
}
