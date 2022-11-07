package SalesMan;

import Item.ModuleItem;
import PublicAccount.DataAccess;
import PublicAccount.Module;
import PublicAccount.Public;

import java.io.IOException;

public class MenuItemForSalesMan {
    public static void PrintMenuItem() throws IOException {
        boolean Condition = true;
        while (Condition){
            System.out.println("(1) Print List Item");
            System.out.println("(2) Edit Amount Item");
            String UserChoose = Public.sc.nextLine();
            switch (UserChoose){
                case "1" :
                    ModuleItem.PrintListItems(2);
                    Condition = false;
                    break;
                case "2" :
                    DataAccess.GetListItem();
                    ModuleItem.PrintListItems(2);
                    System.out.print("Import Code Item:");
                    String CodeItemUserChoose = Public.sc.nextLine();
                    for(int i = 0 ; i < Public.ListItem.size() ;++i){
                        String Item = Public.ListItem.get(i);
                        if(Module.CutStringFrom(Item , 1).equals(CodeItemUserChoose)){
                            Item = ModuleItem.EditAmountItem(Item);
                            Public.ListItem.remove(i);
                            Public.ListItem.add(i,Item);
                            DataAccess.SetListItem();
                            break;
                        }
                    }
                    Condition = false;
                    break;
                default:
                    System.out.println("Please import number!");
            }
        }
    }
}
