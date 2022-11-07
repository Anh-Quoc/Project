import java.io.IOException;

public class Menu implements ListStudent{
    public boolean MainMenu() throws IOException {
        System.out.println("Select Number : ");
        System.out.println("(1) Add Student");
        System.out.println("(2) List Student");
        System.out.println("(3) Edit student infomation");
        System.out.println("(4) Exit");

        switch (sc.nextLine()){
            case "1" :
                Model.addStudent();
                break;
            case "2":
                Model.PrintListStudent();
                break;
            case "3" :
                Model.EditStudentInfo();
                break;
            case "4" :
                return true;
            default:
                System.out.print("Please import number!");
        }
        return false;
    }

}
