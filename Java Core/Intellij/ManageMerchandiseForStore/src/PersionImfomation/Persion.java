package PersionImfomation;

import PublicAccount.CheckValueInput;
import PublicAccount.DataAccess;
import PublicAccount.Public;
import java.io.IOException;

public class Persion implements Public {
    private String EmployeeNumber;
    private String Name;
    private int Age;
    private HomeTown homeTown;

    public Persion(String employeeNumber) {
        System.out.println("Import your infomation : ");
        SetName();
        SetAge();
        homeTown = new HomeTown();
        this.EmployeeNumber = employeeNumber;
    }

    private void SetName(){
        while (true){
            System.out.print("Name : ");
            String NameNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckString(NameNeedCheck)){
                this.Name = NameNeedCheck;
                break;
            }
        }
    }

    private void SetAge(){
        while (true){
            System.out.print("Age : ");
            String AgeNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckAge(AgeNeedCheck)){
                this.Age = Integer.parseInt(AgeNeedCheck);
                break;
            }
        }
    }

    public void SaveInfomation(String PathFile) throws IOException {
        String Infomation = "|"+ EmployeeNumber + "|" + Name + "|" + Age + "|" + homeTown.Commune + "|" +
                homeTown.District + "|" + homeTown.Province + "|";

        if(PathFile.equals(PathPersonalInformation)){
            DataAccess.GetListPersonalInformation();
            ListPersonalInfomation.add(Infomation);
            DataAccess.SetListPersonalInformation();
        } else {
            DataAccess.GetListPersonalInformationNeedAccept();
            ListPersonalInfomationNeedAccept.add(Infomation);
            DataAccess.SetListPersonalInformationNeedAccept();
        }

    }
}
