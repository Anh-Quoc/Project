package J1LP0023;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {

    public void run_J1LP0023() {
        choose_Option_Menu();
    }

    private void choose_Option_Menu() {
        boolean exitProgram = false;
        while (!exitProgram) {
            switch (showMenu()) {
                case Localized.str_Number_1:
                    Function.createFruit();
                    Function.printAllFruitCreated();
                    break;
                case Localized.str_Number_2:
                    Function.viewOrders();
                    break;
                case Localized.str_Number_3:
                    Function.shopping();
                    break;
                case Localized.str_Number_4:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(Localized.user_Manual_Menu_J1LP0023);
            }
        }
    }

    private String showMenu() {
        System.out.println(Localized.contentMenu_J1LP0023);
        System.out.println(Localized.option_1_J1LP0023);
        System.out.println(Localized.option_2_J1LP0023);
        System.out.println(Localized.option_3_J1LP0023);
        System.out.println(Localized.option_4_J1LP0023);
        return Localized.sc.nextLine();
    }
}
