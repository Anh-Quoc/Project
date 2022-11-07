package Item;

import PublicAccount.DataAccess;
import PublicAccount.Public;

import java.io.IOException;

public class Item implements Public{

    private int CodeItem;
    private String NameItem;
    private String AmountItem;
    private String PriceItem;

    public Item() throws IOException {
        setCodeItem();
        setNameItem();
        setAmountItem();
        setPriceItem();
        SaveItem();
    }

    public void setCodeItem() throws IOException {
        DataAccess.GetListItem();
        String LastCodeItem = PublicAccount.Module.CutStringFrom(ListItem.get(ListItem.size() - 1) , 1);
        this.CodeItem = Integer.parseInt(LastCodeItem) + 1;
    }

    public void setNameItem(){
        System.out.print("Name Item : ");
        this.NameItem = Public.sc.nextLine();
    }

    public void setAmountItem(){
        while (true){
            try {
                System.out.print("Amount Item : ");
                int test = Integer.parseInt(Public.sc.nextLine());
                this.AmountItem = Integer.toString(test);
                break;
            } catch (Exception e){
                System.out.println("Please import a integer number!");
            }
        }
    }

    public void setPriceItem(){
        System.out.print("Price Item : ");
        this.PriceItem = Public.sc.nextLine();
    }

    private void SaveItem() throws IOException {
        DataAccess.GetListItem();
        String s = "|" + CodeItem + "|" + NameItem + "|" + AmountItem + "|" + PriceItem + "|";
        Public.ListItem.add(s);
        DataAccess.SetListItem();
    }
}
