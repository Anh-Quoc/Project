package J1LP0022;

import MainProject.Localized;

public class Intern extends Candidates {

    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
        super(Localized.all_candidatesType[2]);
        create_Majors();
        create_Semester();
        create_UniversityName();
    }

    private void create_Majors() {
        System.out.print(Localized.input_Message_Majors);
        setMajors(Localized.sc.nextLine());
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    private void create_Semester() {
        System.out.print(Localized.input_Message_Semester);
        setSemester(Localized.sc.nextLine());
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    private void create_UniversityName() {
        System.out.print(Localized.input_Message_UniversityName);
        setUniversityName(Localized.sc.nextLine());
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getMajors() {
        return this.majors;
    }

    public String getSemester() {
        return this.semester;
    }

    public String getUniversityName() {
        return this.universityName;
    }
}
