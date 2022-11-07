package J1LP0022;

import MainProject.Localized;

public class Experience extends Candidates {

    private String expInYear;
    private String proSkill;

    public Experience() {
        super(Localized.all_candidatesType[0]);
        create_ExpInYear();
        create_ProSkill();
    }

    private void create_ExpInYear() {
        System.out.print(Localized.input_Message_ExpInYear);
        setExpInYear(Localized.sc.nextLine());
    }

    public void setExpInYear(String expInYear) {
        if (checkExpInYear(expInYear)) {
            this.expInYear = expInYear;
        } else {
            System.out.println(Localized.error_Message_ExpInYear);
            create_ExpInYear();
        }
    }

    private boolean checkExpInYear(String expInYear) {
        try {
            int year = Integer.parseInt(expInYear);
            return year >= Localized.expInYear_Min && year <= Localized.expInYear_Max;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void create_ProSkill() {
        System.out.print(Localized.input_Message_ProSkill);
        setProSkill(Localized.sc.nextLine());
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return this.expInYear;
    }

    public String getProSkill() {
        return this.proSkill;
    }
}
