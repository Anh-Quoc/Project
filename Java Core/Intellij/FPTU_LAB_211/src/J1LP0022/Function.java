package J1LP0022;

import MainProject.ControlProgram;
import MainProject.Localized;

public class Function {

    public static void create_Experience() {
        Experience newExperience = new Experience();
        if (ControlProgram.isContinue(Localized.input_Message_Continue)) {
            create_Experience();
        }
        newExperience.getInfomation();
        Localized.all_Experience.add(newExperience);
    }

    public static void create_Fresher() {
        Fresher newFresher = new Fresher();
        if (ControlProgram.isContinue(Localized.input_Message_Continue)) {
            create_Fresher();
        }
        newFresher.getInfomation();
        Localized.all_Fresher.add(newFresher);
    }

    public static void create_Intern() {
        Intern newIntern = new Intern();
        if (ControlProgram.isContinue(Localized.input_Message_Continue)) {
            create_Intern();
        }
        newIntern.getInfomation();
        Localized.all_Intern.add(newIntern);
    }


    public static void searching() {
        show_All_CandidateName();
        System.out.print(Localized.input_Message_CandidateName);
        String name = Localized.sc.nextLine();

        System.out.print(Localized.input_Message_TypeOfCandidate);
        String type_Candidate = Localized.sc.nextLine();

        if (type_Candidate.equals(Localized.all_candidatesType[0])) {
            search_Experience(name);
        }
        if (type_Candidate.equals(Localized.all_candidatesType[1])) {
            search_Fresher(name);
        }
        if (type_Candidate.equals(Localized.all_candidatesType[2])) {
            search_Intern(name);
        }
    }

    private static void show_All_CandidateName() {
        if (!Localized.all_Experience.isEmpty()) {
            System.out.println(Localized.content_ShowExperienceName);
            for (Experience candidate : Localized.all_Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        if (!Localized.all_Fresher.isEmpty()) {
            System.out.println(Localized.content_ShowFresherName);
            for (Fresher candidate : Localized.all_Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        if (!Localized.all_Intern.isEmpty()) {
            System.out.println(Localized.content_ShowInternName);
            for (Intern candidate : Localized.all_Intern) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }

    private static void search_Experience(String name) {
        for (Experience candidate : Localized.all_Experience) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(Localized.error_Message_Search);
    }

    private static void search_Fresher(String name) {
        for (Fresher candidate : Localized.all_Fresher) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(Localized.error_Message_Search);
    }

    private static void search_Intern(String name) {
        for (Intern candidate : Localized.all_Intern) {
            String nameCandidate = candidate.getFirstName() + candidate.getLastName();
            if (nameCandidate.contains(name)) {
                candidate.getInfomation();
                return;
            }
        }
        System.out.println(Localized.error_Message_Search);
    }
}
