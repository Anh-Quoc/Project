package SalesMan;

import PersionImfomation.Persion;
import PublicAccount.Account;

import java.io.IOException;

public class SalesManAccount extends Account {
    public SalesManAccount() throws IOException {
        super.SaveAccount(PathAccountSalesmanNeedAcceptForAdmin);
        Persion a = new Persion(EmployeeNumber);
        a.SaveInfomation(PathPersonalInformationNeedAcceptForAdmin);
        System.out.println("Success! Your account will moderated by Admin!");
    }
}
