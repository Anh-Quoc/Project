package SalesMan;

import Item.ModuleItem;
import PublicAccount.DataAccess;

import java.io.IOException;


public class Module extends ModuleItem {
    public static void ManuplationItem() throws IOException {
        System.out.println("(1) Print Item");
        System.out.println("(2) Edit Amount Item");
        String UserChoose = sc.nextLine();
        switch (UserChoose){
            case "1" :
                PrintListItems(2);
                break;
            case "2" :
                DataAccess.GetListItem();
                PrintListItems(2);
                System.out.println("Choose Code Item : ");
                String ItemUserChoose = sc.nextLine();
                for(int i = 0 ; i < ListItem.size() ; ++i){
                    String Item = ListItem.get(i);
                    if(PublicAccount.Module.CutStringFrom(Item , 1).equals(ItemUserChoose)){

                    }
                }
                break;
            default:
                System.out.println("Please import a number!");
        }
    }

}
