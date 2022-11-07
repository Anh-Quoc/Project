package PublicAccount;

import Admin.AdminAccount;
import SalesMan.SalesManAccount;

import java.io.IOException;

public class Module implements Public {
    public static void CreateAccount() throws IOException {
        boolean Condition = true;
        while (Condition) {
            System.out.println("(1) Admin Account");
            System.out.println("(2) SalesMan Account");
            System.out.println("To create an account admin you need to know Code Admin!");
            String UserChoose = sc.nextLine();
            switch (UserChoose) {
                case "1":
                    AdminAccount adminAccount = new AdminAccount();           
                    Condition = false;
                    break;
                case "2":
                    SalesManAccount salesManAccount = new SalesManAccount();
                    Condition = false;
                    break;
                default:
                    System.out.println("Please import one number!");
            }
        }
    }

    public static void Login() throws IOException {
        String UserNameImport;
        String PasswordImport;
        do {
            System.out.println("Please import Information");
            System.out.print("User Name : ");
            UserNameImport = sc.nextLine();
            System.out.print("Password : ");
            PasswordImport = sc.nextLine();
            if (LoginAdmin(UserNameImport, PasswordImport)) {
                break;
            }
        } while (!LoginSaleMan(UserNameImport, PasswordImport));
    }

    private static boolean LoginAdmin(String UserNameImport, String PasswordImport) throws IOException {
        DataAccess.GetListAccountAdmin();
        for (String Information : ListAccountAdmin) {
            if (UserNameImport.equals(CutStringFrom(Information, 2))) {
                if (PasswordImport.equals(CutStringFrom(Information, 3))) {
                    Admin.Menu.printMenu(CutStringFrom(Information, 1));
                    return true;
                } else if (IncorrectPassWord(Information)) {
                    Admin.Menu.printMenu(CutStringFrom(Information, 1));
                    return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    private static boolean IncorrectPassWord(String Information) {
        boolean Condition = true;
        while (Condition) {
            System.out.println("Incorrect Password!");
            System.out.println("(1) Import Again");
            System.out.println("(2) Exit");
            String UserChoose = sc.nextLine();
            switch (UserChoose) {
                case "1":
                    System.out.print("Password : ");
                    String PasswordImport = sc.nextLine();
                    if (PasswordImport.equals(CutStringFrom(Information, 3))){
                        return true;
                    }
                    break;
                case "2":
                    Condition = false;
                    break;
                default:
                    System.out.println("Please import a number!");
            }
        }
        return false;
    }

    private static boolean LoginSaleMan(String UserNameImport, String PasswordImport) throws IOException {
        DataAccess.GetListAccountSalesman();
        for (String Information : ListAccountSalesMan) {
            if (UserNameImport.equals(CutStringFrom(Information, 2))) {
                if (PasswordImport.equals(CutStringFrom(Information, 3))) {
                    SalesMan.Menu.printMenu(CutStringFrom(Information, 1));
                    return true;
                } else if (IncorrectPassWord(Information)) {
                    SalesMan.Menu.printMenu(CutStringFrom(Information, 1));
                    return true;
                }
            }
        }
        System.out.println("Account not found!");
        while (true) {
            System.out.println("(1) Again");
            System.out.println("(2) Exit");
            String UserChoose = sc.nextLine();
            switch (UserChoose) {
                case "1":
                    return false;
                case "2":
                    return true;
                default:
                    System.out.println("Please import one number!");
            }
        }
    }

    public static String CutStringFrom(String StringNeedCut, int Start) {
        int count = 0;
        while (count != Start) {
            StringNeedCut = StringNeedCut.substring(StringNeedCut.indexOf("|") + 1);
            ++count;
        }
        return StringNeedCut.substring(0, StringNeedCut.indexOf("|"));
    }

    public static String ReplaceStringFrom(String StringNeedReplace, String StringReplace, int Start) {
        String Value = CutStringFrom(StringNeedReplace, Start);
        return StringNeedReplace.replaceAll(Value, StringReplace);
    }

    static void ForgetPassword() throws IOException {
        DataAccess.GetListAccountAdmin();
        DataAccess.GetListAccountSalesman();

        System.out.print("Import user name : ");
        String UserName = sc.nextLine();

        boolean Condition = true;
        for(int i = 0 ; i < ListAccountAdmin.size() ; ++i){
            if(CutStringFrom(ListAccountAdmin.get(i), 2).equals(UserName)){
                String a =  ReplacePassword(ListAccountAdmin.get(i));
                ListAccountAdmin.remove(i);
                ListAccountAdmin.add(i,a);
                DataAccess.SetListAccountAdmin();
                Condition = false;
                break;
            }
        }
        if(Condition){
            for(int i = 0 ; i < ListAccountSalesMan.size() ; ++i){
                if(CutStringFrom(ListAccountSalesMan.get(i) , 2).equals(UserName)){
                    String a =  ReplacePassword(ListAccountSalesMan.get(i));
                    ListAccountSalesMan.remove(i);
                    ListAccountSalesMan.add(i,a);
                    DataAccess.SetListAccountSalesman();
                    Condition = false;
                    break;
                }
            }
        }
        if(Condition){
            System.out.println("Account not found!");
        }

    }

    static String ReplacePassword(String AccountNeedReplacePassword) {
        System.out.println(CutStringFrom(AccountNeedReplacePassword , 4));
        String UserAnswer = sc.nextLine();
        if(CutStringFrom(AccountNeedReplacePassword , 5).equals(UserAnswer)) {
            System.out.print("New Password : ");
            String NewPassword = sc.nextLine();
            while (!CheckValueInput.CheckPassword(NewPassword)){
                System.out.println("Length password is greater than 7 and less than 12! ");
                System.out.print("New Password : ");
                NewPassword = sc.nextLine();
            }
            AccountNeedReplacePassword = ReplaceStringFrom(AccountNeedReplacePassword , NewPassword , 3);
        } else {
            System.out.println("Your answer not incorrect!");
            System.out.println("(1) Again");
            System.out.println("(2) Exit");
            String UserChoose = sc.nextLine();
            boolean Condition = true;
            while (Condition){
                switch (UserChoose){
                    case "1" :
                        AccountNeedReplacePassword = ReplacePassword(AccountNeedReplacePassword);
                        Condition = false;
                        break;
                    case "2" :
                        Condition = false;
                        break;
                    default :
                        System.out.println("Please import a number!");
                }
            }

        }
      return AccountNeedReplacePassword;
    }

    public static void PrintAccountInformation(String EmployeeNumber) throws IOException {
        DataAccess.GetListAccountAdmin();
        DataAccess.GetListAccountSalesman();

        boolean Condition = true;
        for (String Information : ListAccountAdmin) {
            if (Information.contains(EmployeeNumber)) {
                System.out.println(Information.replaceAll("\\|", " "));
                Condition = false;
                break;
            }
        }

        if(Condition){
            for(String Information : ListAccountSalesMan) {
                if(Information.contains(EmployeeNumber)){
                    System.out.println(Information);
                    break;
                }
            }
        }

    }

    public static void PrintPersonaInformation(String EmployeeNumber) throws IOException {
        DataAccess.GetListPersonalInformation();
        for(String Information : ListPersonalInfomation) {
            if(Information.contains(EmployeeNumber)){
                System.out.println(Information.replaceAll("\\|" , " "));
                break;
            }
        }
    }

}
