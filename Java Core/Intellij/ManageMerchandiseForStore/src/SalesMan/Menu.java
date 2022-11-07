package SalesMan;

import PublicAccount.Public;
import java.io.IOException;

public class Menu {
    public static void printMenu(String EmployeeNumber) throws IOException {
        boolean Condition = true;
        while (Condition){
            System.out.println("(1) Manipulation item");
            System.out.println("(2) Account Information");
            System.out.println("(3) Your Information");
            System.out.println("(4) Log out");

            boolean Condition1 = true;
            while (Condition1){
                String UserChoose = Public.sc.nextLine();
                switch (UserChoose){
                    case "1" :
                        MenuItemForSalesMan.PrintMenuItem();
                        Condition1 = false;
                        break;
                    case "2" :
                        PublicAccount.Module.PrintAccountInformation(EmployeeNumber);
                        Condition1 = false;
                        break;
                    case "3" :
                        PublicAccount.Module.PrintPersonaInformation(EmployeeNumber);
                        Condition1 = false;
                        break;
                    case "4" :
                        Condition = false;
                        Condition1 = false;
                        break;
                    default :
                        System.out.println("Please import a number!");
                }
            }
        }
    }
}
