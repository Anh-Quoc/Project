package Item;

import java.io.IOException;

import PublicAccount.DataAccess;
import PublicAccount.Public;

public class OrderIteam implements Public {
    public static void OrderNewIteam() throws IOException{
        System.out.println("Are you want to order?? Please import a name iteam!");
        String iteamName = sc.nextLine();
        DataAccess.GetListItemOrder();
        boolean condition = false;
        for(String s : ListItem) {
            if(s.contains(iteamName)) {
                System.out.print("Amount: ");
                int amount = sc.nextInt();
                System.out.print("Table: ");
                int table = sc.nextInt();                
                condition = true;
                ListItemOrder.add("|" + String.valueOf(table) +"|" + iteamName +"|" + String.valueOf(amount) + "|");
                DataAccess.SetListItemOrder();      
                break;          
            }
        }
        if(condition == false){
            System.out.print("Item not found!");
        }
    }
}