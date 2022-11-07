package PublicAccount;

import java.io.IOException;

public class Account implements Public {
    
    protected String UserName = "";
    protected String Password = "";
    protected String QuestionReminiscent = "";
    protected String AnswerForQuestionReminiscent = "";
    protected String EmployeeNumber;

    public Account() throws IOException {
        CreateUserName();
        CreatePassword();
        CreateQuestionReminiscent();
        CreateAnswerForQuestionReminiscent();
        CreateEmployeeNumber();
    }

    private void CreateUserName() throws IOException {
        while (true){
            System.out.print("UserName : ");
            String UserNameNeedCheck = sc.nextLine();
            if(!CheckValueInput.CheckUserName(UserNameNeedCheck)){
                System.out.println("Format Gmail not true! Please import again.");
                continue;
            }
            if(!CheckValueInput.CheckUserNameSame(UserNameNeedCheck)){
                System.out.println("Your Gmail is used! Please import again ");
                continue;
            }
            this.UserName = UserNameNeedCheck;
            break;
        }
    }

    private void CreatePassword(){
        while (true){
            System.out.print("Password : ");
            String PasswordNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckPassword(PasswordNeedCheck)){
                this.Password = PasswordNeedCheck;
                break;
            } else {
                System.out.println("Length password is greater than 7 and less than 12! ");
            }
        }
    }

    private void CreateQuestionReminiscent(){
        String Question1 = "What is your father's or mother's name?";
        String Question2 = "The flower you like best?";
        String Question3 = "The sport you like best?";

        System.out.println("Question Reminiscent help you reset your password.");
        System.out.println("Choose one in list question and import answer.");

        boolean Condition = true;
        while (Condition) {
            System.out.println("(1) " + Question1);
            System.out.println("(2) " + Question2);
            System.out.println("(3) " + Question3);

            String UserChoose = sc.nextLine();
            switch (UserChoose){
                case "1" :
                    this.QuestionReminiscent = Question1;
                    Condition = false;
                    break;
                case "2" :
                    this.QuestionReminiscent = Question2;
                    Condition = false;
                    break;
                case "3" :
                    this.QuestionReminiscent = Question3;
                    Condition = false;
                    break;
                default :
                    System.out.println("Please import one digit!");
            }
        }
    }

    private void CreateAnswerForQuestionReminiscent(){
        System.out.print("Your answer : ");
        this.AnswerForQuestionReminiscent = sc.nextLine();
    }

    private void CreateEmployeeNumber() throws IOException {
        DataAccess.GetListEmployeeNumber();
        int EmployeeNumberNext = ListEmployeeNumber.get(ListEmployeeNumber.size() - 1);
        this.EmployeeNumber = String.valueOf(EmployeeNumberNext + 1);
        ListEmployeeNumber.add(EmployeeNumberNext + 1);
        DataAccess.SetListEmployeeNumber();
    }

    public void SaveAccount(String PathFile) throws IOException {
        String AccountInformation = "|" +EmployeeNumber + "|" + UserName + "|" + Password + "|" +
                                        QuestionReminiscent + "|" + AnswerForQuestionReminiscent + "|";
        if(PathFile.equals(PathAccountAdmint)){
            DataAccess.GetListAccountAdmin();
            ListAccountAdmin.add(AccountInformation);
            DataAccess.SetListAccountAdmin();
        } else {
            DataAccess.GetListAccountSalesmanNeedAccept();
            ListAccountSalesManNeedAccept.add(AccountInformation);
            DataAccess.SetListAccountSalesmanNeedAccept();
        }
    }

}
