package Admin;

import PersionImfomation.Persion;
import PublicAccount.Account;
import PublicAccount.Public;

import java.io.IOException;

public class AdminAccount extends Account {

    public AdminAccount() throws IOException {

        boolean Condition = true;
        while(Condition) {
            System.out.println("Please import code admin!");
            String CodeAdminNeedCheck = sc.nextLine();
            String codeAdmin = "123456";
            if(CodeAdminNeedCheck.equals(codeAdmin)){
                super.SaveAccount(Public.PathAccountAdmint);
                Persion a = new Persion(EmployeeNumber);
                a.SaveInfomation(Public.PathPersonalInformation);
                System.out.println("Create Account success!");
                Condition = false;
            } else {
                Condition = CodeAdminFalse();
            }
        }
    }

    private boolean CodeAdminFalse(){
        System.out.println("Code Admin is not true , continue?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        String UsesChoose = sc.nextLine();
        switch (UsesChoose){
            case "1" :
                return true;
            case "2" :
                return false;
            default :
                System.out.println("Please import one number!");
                return true;
        }
    }
}
