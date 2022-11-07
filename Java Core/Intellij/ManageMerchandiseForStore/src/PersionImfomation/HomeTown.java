package PersionImfomation;

import PublicAccount.CheckValueInput;
import PublicAccount.Public;

public class HomeTown implements Public {
    // Xã
    public String Commune;
    // Huyện
    public String District;
    // Tỉnh
    public String Province;

    public HomeTown(){
        SetCommune();
        SetDistrict();
        SetProvince();
    }
    public void SetCommune(){
        while(true){
            System.out.print("Commune : ");
            String CommuneNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckString(CommuneNeedCheck)){
                this.Commune = CommuneNeedCheck;
                break;
            } else {
                System.out.println("Please import String!");
            }
        }
    }

    public void SetDistrict(){
        while(true){
            System.out.print("District : ");
            String DistrictNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckString(DistrictNeedCheck)){
                this.District = DistrictNeedCheck;
                break;
            } else {
                System.out.println("Please import String!");
            }
        }
    }

    public void SetProvince(){
        while(true){
            System.out.print("Province : ");
            String ProvinceNeedCheck = sc.nextLine();
            if(CheckValueInput.CheckString(ProvinceNeedCheck)){
                this.Province = ProvinceNeedCheck;
                break;
            } else {
                System.out.println("Please import String!");
            }
        }
    }
}
