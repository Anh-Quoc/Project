package Ex1;

import java.util.*;

class Ex1Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Length : ");
        long length = sc.nextLong();
        System.out.print("Width : ");
        long width = sc.nextLong();
        Rectangle newRectangle = new Rectangle(length, width);
        System.out.println(newRectangle.toString());        
        sc.close();
    }
}