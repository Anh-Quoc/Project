package Admin;

import Item.ModuleItem;
import PublicAccount.Public;

import java.io.IOException;

public class MenuItemForAdmin {
    public static void PrintMenu() throws IOException {
        boolean Condition = true;
        while (Condition){
            System.out.println("(1) Print List Item");
            System.out.println("(2) Add Item");
            System.out.println("(3) Edit Item");
            System.out.println("(4) Remove Item");
            System.out.println("(5) Exit");

            String UserChoose = Public.sc.nextLine();
            switch (UserChoose){
                case "1" :
                    ModuleItem.PrintListItems(2);
                    Condition = false;
                    break;
                case "2" :
                    ModuleItem.AddItem();
                    Condition = false;
                    break;
                case "3" :
                    ModuleItem.EditItem();
                    Condition = false;
                    break;
                case "4" :
                    while (!ModuleItem.RemoveItem()){
                        System.out.println("Do you want again?");
                        System.out.println("(1) Yes");
                        System.out.println("(2) No");
                        String UserChoose2 = Public.sc.nextLine();
                        if(UserChoose2.equals("2")){
                            break;
                        }
                    }
                    Condition = false;
                    break;
                case "5" :
                    Condition = false;
                    break;
                default:
                    System.out.println("Please import a number!");
            }
        }
    }
}
