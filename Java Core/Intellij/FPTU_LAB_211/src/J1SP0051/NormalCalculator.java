package J1SP0051;

import MainProject.Localized;

public class NormalCalculator {
    public static void inputNumAndOperator(){
        System.out.println(Localized.normalCalculator_Menu);
        double value_1;
        double value_2;
        String operator;
        do {
            value_1 = inputNumber();
            operator = inputOperator();
            value_2 = inputNumber();

        } while (!operator.equals(Localized.listOperator[6]));

    }

    private static double inputNumber(){
        try {
            System.out.println(Localized.input_Message_Enter_Number);
            String value = Localized.sc.nextLine();
            return Double.parseDouble(value);
        } catch (NumberFormatException e){
            return inputNumber();
        }
    }

    private static String inputOperator(){
        System.out.println(Localized.input_Message_Enter_Operator);
        String operator = Localized.sc.nextLine();
        if(!checkOperator(operator)){
            return inputOperator();
        }
        return operator;
    }

    private static boolean checkOperator(String value){
        return value.matches(Localized.regexForCheckOperator);
    }

    private static double calculate(double value_1, String operator, double value_2){
        switch (operator){
            case Localized.print_Array:
                break;
        }
    }

}
