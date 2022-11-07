package Item;

import PublicAccount.DataAccess;
import PublicAccount.Public;
import PublicAccount.Module;
import java.io.IOException;

public class ModuleItem implements Public {

    public static void PrintListItems() throws IOException {
        DataAccess.GetListItem();
        for (String Item : ListItem) {
            System.out.print(Module.CutStringFrom(Item, 2) + " ");
            if (Integer.parseInt(Module.CutStringFrom(Item, 3)) > 0) {
                System.out.print("Stocking ");
            } else {
                System.out.print("No stocking ");
            }
            System.out.println(Module.CutStringFrom(Item, 4));
        }
    }

    public static void PrintListItems(int SaleMan) throws IOException {
        DataAccess.GetListItem();
        for (String Item : ListItem) {
            System.out.println(Item.replaceAll("\\|", " "));
        }
    }

    public static void AddItem() throws IOException {
        Item newItem = new Item();
    }

    public static boolean RemoveItem() throws IOException {
        PrintListItems(2);
        DataAccess.GetListItem();
        System.out.print("Choose code Item : ");
        String UserChoose = sc.nextLine();
        for(int i = 0 ; i < ListItem.size() ; ++i) {
            if(Module.CutStringFrom(ListItem.get(i) , 1).equals(UserChoose)){
                ListItem.remove(i);
                DataAccess.SetListItem();
                System.out.println("Item remove Success!");
                return true;
            }
        }
        System.out.println("No code item found!");

        return false;
    }

    public static void EditItem() throws IOException{
        DataAccess.GetListItem();
        PrintListItems(2);
        System.out.print("Choose code Item : ");
        String ItemUserChoose = sc.nextLine();
        for(int i = 0 ; i < ListItem.size() ; ++i){
            if(Module.CutStringFrom(ListItem.get(i) , 1).equals(ItemUserChoose)){
                boolean Condition = true;
                while (Condition){
                    String Item = ListItem.get(i);
                    System.out.println(Item.replaceAll("\\|" , " "));
                    System.out.println("(1) Name Item");
                    System.out.println("(2) Amount Item");
                    System.out.println("(3) Price Item");
                    String UserChoose = sc.nextLine();
                    switch (UserChoose){
                        case "1" :
                            Item = EditNameItem(Item);
                            ListItem.remove(i);
                            ListItem.add(i,Item);
                            Condition = false;
                            break;
                        case "2" :
                            Item = EditAmountItem(Item);
                            ListItem.remove(i);
                            ListItem.add(i,Item);
                            Condition = false;
                            break;
                        case "3" :
                            Item = EditPriceItem(Item);
                            ListItem.remove(i);
                            ListItem.add(i,Item);
                            Condition = false;
                            break;
                        default:
                            System.out.println("Please import number");
                    }
                }
                break;
            }
        }
        DataAccess.SetListItem();
    }

    private static String EditNameItem(String Item){
        System.out.print("New Name item : ");
        String NewNameItem = sc.nextLine();
        return Module.ReplaceStringFrom(Item , NewNameItem , 2);
    }

    public static String EditAmountItem(String Item){
        System.out.print("New Amount item : ");
        String NewAmountItem = sc.nextLine();
        return Module.ReplaceStringFrom(Item , NewAmountItem , 3);
    }

    private static String EditPriceItem(String Item){
        System.out.print("New Price item : ");
        String NewPriceItem = sc.nextLine();
        return Module.ReplaceStringFrom(Item , NewPriceItem , 4);
    }
}
