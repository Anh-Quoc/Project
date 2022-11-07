package J1SP0050;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {


    public void run_J1SP0050(){
        mainMenu();

    }

    private void mainMenu(){

        System.out.println(Localized.contentMenu_J1SP0050);
        System.out.println(Localized.option_1_J1SP0050);
        System.out.println(Localized.option_2_J1SP0050);
        System.out.println(Localized.option_3_J1SP0050);
        System.out.println(Localized.input_Message_ChooseOption);

        String optionUserChoose = Localized.sc.nextLine();

        switch (optionUserChoose){
            case Localized.str_Number_1:
                calculateEquation();
                mainMenu();
                break;
            case Localized.str_Number_2:
                calculateQuadraticEquation();
                mainMenu();
                break;
            case Localized.str_Number_3:
                break;
            default:
                mainMenu();
                break;

        }
    }

    private void calculateEquation(){
        System.out.println(Localized.calculateEquation_Menu);
        float numberA = getInputNumber(Localized.input_Message_Enter_A);
        float numberB = getInputNumber(Localized.input_Message_Enter_B);


    }

    private void calculateQuadraticEquation(){
        System.out.println(Localized.calculateQuadraticEquation_Menu);
        float numberA = getInputNumber(Localized.input_Message_Enter_A);
        float numberB = getInputNumber(Localized.input_Message_Enter_B);
        float numberC = getInputNumber(Localized.input_Message_Enter_C);



    }

    private float getInputNumber(String inputMessage){
        System.out.print(inputMessage);
        float valueInput;
        try {
            valueInput = Integer.parseInt(Localized.sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println(Localized.error_Message_InputNumber);
            return getInputNumber(inputMessage);
        }
        return valueInput;
    }

    private boolean checkSquareNumber(float number){
        int value = (int) Math.sqrt(number);
        return (value * value) == number;
    }

    private boolean checkOddNumber(float number){

        return number % 2 != 0;
    }


}
