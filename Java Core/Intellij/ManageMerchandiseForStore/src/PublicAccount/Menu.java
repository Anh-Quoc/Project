package PublicAccount;

import Item.ModuleItem;
import Item.OrderIteam;

import java.io.IOException;

public class Menu implements Public{
    public static void printMenu() throws IOException {
        // View
        boolean Condition = true;
        while (Condition){
            System.out.println("(1) List items");
            System.out.println("(2) Log in");
            System.out.println("(3) Create Account");
            System.out.println("(4) Forget Password");
            System.out.println("(5) Exit");

        // Controller
            String UserChoose = sc.nextLine();
            switch (UserChoose){
                case "1" :
                   ModuleItem.PrintListItems();
                   OrderIteam.OrderNewIteam();
                    break;
                case "2" :
                    Module.Login();
                    break;
                case "3" :
                    Module.CreateAccount();
                    break;
                case "4" :
                    Module.ForgetPassword();
                    break;
                case "5" :
                    Condition = false;
                default :
                    System.out.println("Please import one number!");
            }
        }
    }
}
