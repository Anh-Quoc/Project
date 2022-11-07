package PublicAccount;

import java.util.ArrayList;
import java.util.Scanner;

public interface Public {
    Scanner sc = new Scanner(System.in);

    String PathAccountAdmint = "Data\\Account\\AccountAdmin.txt";
    String PathAccountSalesman = "Data\\Account\\AccountSalesman.txt";
    String PathAccountSalesmanNeedAcceptForAdmin = "Data\\Account\\AccountSalesmanNeedAcceptForAdmin.txt";

    String PathListItem = "Data\\Item\\ListItem.txt";

    String PathListItemOrder = "Data\\Item\\ListOrder.txt";

    String PathEmployeeNumber = "Data\\People\\EmployeeNumber.txt";
    String PathPersonalInformation = "Data\\People\\PersonalInformation.txt";
    String PathPersonalInformationNeedAcceptForAdmin = "Data\\People\\PersonalInformationNeedAcceptForAdmin.txt";

    ArrayList<String> ListAccountAdmin = new ArrayList<>();
    ArrayList<String> ListAccountSalesMan = new ArrayList<>();
    ArrayList<String> ListAccountSalesManNeedAccept = new ArrayList<>();
    ArrayList<String> ListItem = new ArrayList<>();
    ArrayList<Integer> ListEmployeeNumber = new ArrayList<>();
    ArrayList<String> ListPersonalInfomationNeedAccept = new ArrayList<>();
    ArrayList<String> ListPersonalInfomation = new ArrayList<>();
    ArrayList<String> ListItemOrder = new ArrayList<>();
}
