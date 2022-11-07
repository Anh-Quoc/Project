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
public class File {
    private String pathFile;
    public File(){
        System.out.print("Please input Path: ");
        Scanner sc = new Scanner(System.in);
        this.pathFile = sc.nextLine();
    }
    public String getPath(){
        return pathFile.substring(0,pathFile.lastIndexOf("\\"));
    }
    public String getFileName(){
        String fileName = pathFile.substring(pathFile.lastIndexOf("\\"));
        return fileName.substring(1,fileName.lastIndexOf("."));
    }
    public String getExtension(){
        return pathFile.substring(pathFile.lastIndexOf(".") + 1);
    }
    public String getDisk(){
        return pathFile.substring(0,pathFile.indexOf("\\"));
    }
    
    public String getFolders(){
        String newPathFile = pathFile.replaceAll("\\\\", " ");
        String[] a = newPathFile.split("\\s");
        return "[" + a[a.length - 2] + "]";
    }
}
