package J1LP0022;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {

    public void run_J1LP0022() {
        choose_Option_Menu();
    }

    public void choose_Option_Menu() {
        boolean exitProgram = false;
        while (!exitProgram) {
            switch (showMenu()) {
                case Localized.str_Number_1:
                    Function.create_Experience();
                    break;
                case Localized.str_Number_2:
                    Function.create_Fresher();
                    break;
                case Localized.str_Number_3:
                    Function.create_Intern();
                    break;
                case Localized.str_Number_4:
                    Function.searching();
                    break;
                case Localized.str_Number_5:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(Localized.user_Manual_Menu_J1LP0022);
            }
        }
    }

    public String showMenu() {
        System.out.println(Localized.contentMenu_J1LP0022);
        System.out.println(Localized.option_1_J1LP0022);
        System.out.println(Localized.option_2_J1LP0022);
        System.out.println(Localized.option_3_J1LP0022);
        System.out.println(Localized.option_4_J1LP0022);
        System.out.println(Localized.option_5_J1LP0022);
        System.out.println(Localized.user_Manual_Menu_J1LP0022);
        return Localized.sc.nextLine();
    }
}
