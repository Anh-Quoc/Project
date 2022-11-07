package Admin;

import PublicAccount.Public;
import java.io.IOException;

public class Menu {
    public static void printMenu(String EmployeeNumber) throws IOException {
        boolean Condition = true;
        while (Condition) {
            System.out.println("(1) Account need check");
            System.out.println("(2) Manuplation item");
            System.out.println("(3) Account Infomation");
            System.out.println("(4) Your Infomation");
            System.out.println("(5) Log out");

            boolean Condition1 = true;
            while (Condition1){
                String UserChoose = Public.sc.nextLine();
                switch (UserChoose){
                    case "1" :
                        Module.CheckAccountSaleMane();
                        Condition1 = false;
                        break;
                    case "2" :
                        MenuItemForAdmin.PrintMenu();
                        Condition1 = false;
                        break;
                    case "3" :
                        PublicAccount.Module.PrintAccountInformation(EmployeeNumber);
                        Condition1 = false;
                        break;
                    case "4" :
                        PublicAccount.Module.PrintPersonaInformation(EmployeeNumber);
                        Condition1 = false;
                        break;
                    case "5" :
                        Condition1 = false;
                        Condition = false;
                        break;
                    default :
                        System.out.println("Please import one number");
                }
            }
        }
    }
}
