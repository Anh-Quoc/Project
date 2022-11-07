package J1LP0022;

import MainProject.Localized;

public class Fresher extends Candidates {

    private String graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {
        super(Localized.all_candidatesType[1]);
        create_Graduation_date();
        create_Graduation_rank();
        create_Education();
    }

    private void create_Graduation_date() {
        System.out.print(Localized.input_Message_Graduation_date);
        setGraduation_date(Localized.sc.nextLine());
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    private void create_Graduation_rank() {
        System.out.print(Localized.input_Message_Graduation_rank);
        setGraduation_rank(Localized.sc.nextLine());
    }

    public void setGraduation_rank(String graduation_rank) {
        if (checkGraduation_rank(graduation_rank)) {
            this.graduation_rank = graduation_rank;
        } else {
            System.out.println(Localized.error_Message_Graduation_rank);
            create_Graduation_rank();
        }
    }

    private boolean checkGraduation_rank(String graduation_rank) {
        for (String rank : Localized.rankOfGraduation) {
            if (graduation_rank.equalsIgnoreCase(rank)) {
                return true;
            }
        }
        return false;
    }

    private void create_Education() {
        System.out.print(Localized.input_Message_Education);
        setEducation(Localized.sc.nextLine());
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduation_date() {
        return this.graduation_date;
    }

    public String getGraduation_rank() {
        return this.graduation_rank;
    }

    public String getEducation() {
        return this.education;
    }
}
