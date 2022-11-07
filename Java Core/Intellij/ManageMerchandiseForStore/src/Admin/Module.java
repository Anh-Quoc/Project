package Admin;

import Item.Item;
import PublicAccount.DataAccess;
import PublicAccount.Public;

import java.io.IOException;


public class Module implements Public{

    public static void CheckAccountSaleMane() throws IOException {

        DataAccess.GetListPersonalInformationNeedAccept();
        if(Public.ListPersonalInfomationNeedAccept.size() > 0){

            DataAccess.GetListAccountSalesman();
            DataAccess.GetListAccountSalesmanNeedAccept();

            DataAccess.GetListPersonalInformation();

            for(int i = 0 ; i < ListPersonalInfomationNeedAccept.size() ; ++i){
                System.out.println(ListPersonalInfomationNeedAccept.get(i).replaceAll("\\|" , " "));
                ChooseAccount(i);
            }
        } else {
            System.out.println("No account need accept!");
        }

        DataAccess.SetListAccountSalesman();
        DataAccess.SetListPersonalInformation();

        ListAccountSalesManNeedAccept.clear();
        ListPersonalInfomationNeedAccept.clear();
        DataAccess.SetListAccountSalesmanNeedAccept();
        DataAccess.SetListPersonalInformationNeedAccept();
    }

    private static void ChooseAccount(int i){
        boolean Condition = true;
        while (Condition) {
            System.out.println("(1) Accept");
            System.out.println("(2) Refuse");

            String UserChoose = Public.sc.nextLine();
            switch (UserChoose) {
                case "1":
                    AcceptAccount(i);
                    Condition = false;
                    break;
                case "2":
                    RefuseAccount();
                    Condition = false;
                    break;
                default:
                    System.out.println("Please import one number");
            }
        }
    }

    private static void AcceptAccount(int i) {
        Public.ListPersonalInfomation.add(ListPersonalInfomationNeedAccept.get(i));
        Public.ListAccountSalesMan.add(ListAccountSalesManNeedAccept.get(i));
    }

    private static void RefuseAccount(){

    }

    public static void AddItemByAdmin() throws IOException {
        Item a = new Item();
    }
}
