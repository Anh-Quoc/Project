package Ex3;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Car> ListCar = new ArrayList<>();
        for(int i = 0 ; i < 3 ; ++i){
            System.out.print("Car Owner : ");
            String CarOwner = sc.next();

            System.out.print("Range Of Vehicle : ");
            String RangeOfVehicle = sc.next();
            
            System.out.print("Capacity : ");
            float Capacity = sc.nextFloat();
            
            System.out.print("Value : ");
            float Value = sc.nextFloat();
            
            Car newCar = new Car(CarOwner , RangeOfVehicle , Capacity , Value);
            ListCar.add(newCar);
        }

        // In thành form nữa thôi >_<
        for(int i = 0 ; i < 3 ; ++i){
            // String form = "";
            System.out.printf("%1$10%2$20","hi","hi2");
        }        
        sc.close();
    }
}