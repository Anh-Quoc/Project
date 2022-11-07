package PublicAccount;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataAccess implements Public{

    public static void GetListAccountAdmin() throws IOException {
        Scanner scAccountAdmin = new Scanner(Paths.get(PathAccountAdmint));
        ListAccountAdmin.clear();
        while (scAccountAdmin.hasNextLine()){
            ListAccountAdmin.add(scAccountAdmin.nextLine());
        }
        scAccountAdmin.close();
    }

    public static void GetListAccountSalesman() throws IOException {
        Scanner scAccountSalesman = new Scanner(Paths.get(PathAccountSalesman));
        ListAccountSalesMan.clear();
        while (scAccountSalesman.hasNextLine()){
            ListAccountSalesMan.add(scAccountSalesman.nextLine());
        }
        scAccountSalesman.close();
    }

    public static void GetListAccountSalesmanNeedAccept() throws IOException {
        Scanner scAccountSalesmanNeedAccept = new Scanner(Paths.get(PathAccountSalesmanNeedAcceptForAdmin));
        ListAccountSalesManNeedAccept.clear();
        while (scAccountSalesmanNeedAccept.hasNextLine()){
            ListAccountSalesManNeedAccept.add(scAccountSalesmanNeedAccept.nextLine());
        }
        scAccountSalesmanNeedAccept.close();
    }

    public static void GetListItem() throws IOException {
        Scanner scListItem = new Scanner(Paths.get(PathListItem));
        ListItem.clear();
        while (scListItem.hasNextLine()){
            ListItem.add(scListItem.nextLine());
        }
        scListItem.close();
    }

    public static void GetListEmployeeNumber() throws IOException {
        Scanner scEmployeeNumber = new Scanner(Paths.get(PathEmployeeNumber));
        ListEmployeeNumber.clear();
        while (scEmployeeNumber.hasNextLine()){
            ListEmployeeNumber.add(Integer.parseInt(scEmployeeNumber.nextLine()));
        }
        scEmployeeNumber.close();
    }

    public static void GetListPersonalInformation() throws IOException {
        Scanner scListPersonalInformation = new Scanner(Paths.get(PathPersonalInformation));
        ListPersonalInfomation.clear();
        while (scListPersonalInformation.hasNextLine()){
            ListPersonalInfomation.add(scListPersonalInformation.nextLine());
        }
        scListPersonalInformation.close();
    }

    public static void GetListPersonalInformationNeedAccept() throws IOException {
        Scanner scListPersonalInformationNeedAccept = new Scanner(Paths.get(PathPersonalInformationNeedAcceptForAdmin));
        ListPersonalInfomationNeedAccept.clear();
        while (scListPersonalInformationNeedAccept.hasNextLine()){
            ListPersonalInfomationNeedAccept.add(scListPersonalInformationNeedAccept.nextLine());
        }
        scListPersonalInformationNeedAccept.close();
    }

    public static void GetListItemOrder() throws IOException {        
        Scanner scListItemOrder = new Scanner(Paths.get(PathListItemOrder));
        ListItemOrder.clear();
        while(scListItemOrder.hasNextLine()){
            ListItemOrder.add(scListItemOrder.nextLine());
        }
        scListItemOrder.close();
    }

    public static void SetListAccountAdmin() throws IOException {
        FileWriter frAccountAdmin = new FileWriter(PathAccountAdmint);
        for(String s : ListAccountAdmin){
            frAccountAdmin.write(s + "\n");
        }
        frAccountAdmin.close();
    }

    public static void SetListAccountSalesman() throws IOException {
        FileWriter frAccountSalesman = new FileWriter(PathAccountSalesman);
        for(String s : ListAccountSalesMan){
            frAccountSalesman.write(s + "\n");
        }
        frAccountSalesman.close();
    }

    public static void SetListAccountSalesmanNeedAccept() throws IOException {
        FileWriter frAccountSalesmanNeedAccept = new FileWriter(PathAccountSalesmanNeedAcceptForAdmin);
        for(String s : ListAccountSalesManNeedAccept){
            frAccountSalesmanNeedAccept.write(s + "\n");
        }
        frAccountSalesmanNeedAccept.close();
    }

    public static void SetListItem() throws IOException {
        FileWriter frListItem = new FileWriter(PathListItem);
        for(String s : ListItem){
            frListItem.write(s + "\n");
        }
        frListItem.close();
    }

    public static void SetListEmployeeNumber() throws IOException{
        FileWriter frListEmployeeNumber = new FileWriter(PathEmployeeNumber);
        for(Integer s : ListEmployeeNumber){
            frListEmployeeNumber.write(s + "\n");
        }
        frListEmployeeNumber.close();
    }

    public static void SetListPersonalInformation() throws IOException {
        FileWriter frListPersonalInformation = new FileWriter(PathPersonalInformation);
        for(String s : ListPersonalInfomation){
            frListPersonalInformation.write(s + "\n");
        }
        frListPersonalInformation.close();
    }

    public static void SetListPersonalInformationNeedAccept() throws IOException {
        FileWriter frListPersonalInformationNeedAccept = new FileWriter(PathPersonalInformationNeedAcceptForAdmin);
        for(String s : ListPersonalInfomationNeedAccept){
            frListPersonalInformationNeedAccept.write(s + "\n");
        }
        frListPersonalInformationNeedAccept.close();
    }

    public static void SetListItemOrder() throws IOException{
        FileWriter frListItemOrder = new FileWriter(PathListItemOrder);
        for(String s : ListItemOrder){
            frListItemOrder.write(s + "\n");
        }
        frListItemOrder.close();
    }
}
