/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.*;

/**
 *
 * @author hungh
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String StringInput = sc.nextLine();                                   
        
        System.out.print("{");
        StringTokenizer st = new StringTokenizer(StringInput);
        CountString(st.nextToken(),StringInput);        
        System.out.println("}");
        
        String StringNewInput = "";
        StringInput = StringInput.replaceAll(" ","");
        for(int i = 0;i < StringInput.length(); ++i){
            StringNewInput += StringInput.charAt(i) + " ";
        }        
        
        System.out.print("{");
        StringTokenizer st2 = new StringTokenizer(StringNewInput);
        CountString(st2.nextToken(),StringNewInput);
        System.out.println("}");
    }
    
    public static void CountString(String StringNeedCount ,String StringInput){
        int Count = 0 ;
        while(StringInput.contains(StringNeedCount)){
            StringInput = StringInput.replaceFirst(StringNeedCount,"");            
            ++Count;
        }
        
        System.out.print(StringNeedCount + "=" + Count);
        StringTokenizer st = new StringTokenizer(StringInput);
        if(st.hasMoreTokens()){            
             System.out.print(",");
            CountString(st.nextToken(),StringInput);           
        }        
    }
}
