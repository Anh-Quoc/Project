package J1SP0051;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {

    public void run_J1SP0051(){

        boolean exitProgram = false;
        while (!exitProgram) {
            switch (showMenu()){
                case Localized.str_Number_1:
                    break;
                case Localized.str_Number_2:
                    break;
                case Localized.str_Number_3:
                    exitProgram = true;
                    break;

            }
        }

    }

    private String showMenu(){
        System.out.println(Localized.contentMenu_J1SP0051);
        System.out.println(Localized.option_1_J1SP0051);
        System.out.println(Localized.option_2_J1SP0051);
        System.out.println(Localized.option_3_J1SP0051);
        System.out.println(Localized.input_Message_ChooseOption);

        return Localized.sc.nextLine();
    }


}
