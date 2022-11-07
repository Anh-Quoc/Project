package PublicAccount;

import java.io.IOException;

public class CheckValueInput implements Public{

    public static boolean CheckUserName(String UserNameNeedCheck) {
        if(UserNameNeedCheck.length() <= 10){
            return false;
        }
        return UserNameNeedCheck.endsWith("@gmail.com");
    }

    public static boolean CheckPassword(String PasswordNeedCheck) {
        return PasswordNeedCheck.length() >= 7 && PasswordNeedCheck.length() <= 12;
    }

    public static boolean CheckUserNameSame(String GmailNeedCheck) throws IOException {
        DataAccess.GetListAccountAdmin();
        DataAccess.GetListAccountSalesman();
        try{
            for(String Information : ListAccountAdmin){
                if(Information.contains(GmailNeedCheck)){
                    return false;
                }
            }
            for(String Information : ListAccountSalesMan){
                if(Information.contains(GmailNeedCheck)){
                    return false;
                }
            }
        } catch (Exception ignored){

        }
        return true;
    }

    public static boolean CheckString(String StringNeedCheck){
        for(int i = 0 ; i < StringNeedCheck.length() ; ++i){
            if(!Character.isLetter(StringNeedCheck.charAt(i)) && StringNeedCheck.charAt(i) != ' '){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckAge(String StringNeedCheck){
        try{
            int age = Integer.parseInt(StringNeedCheck);
            if(age < 0 || age > 100){
                System.out.println("Your age is greater than 0 and less than 100!");
                return false;
            }
        } catch (Exception e){
            System.out.println("Please import a number");
            return false;
        }
        return true;
    }
}
