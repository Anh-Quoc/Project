package J1SP0011;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {

    private String typeOfInput;
    private String typeOfOutput;
    private String value;

    public void run_J1SP0011(){
        inputValueFromUser();
        process();
    }

    private void inputValueFromUser(){
        System.out.println(Localized.input_Message_InputTypeNumber);
        typeOfInput = getType();
        System.out.println(Localized.input_Message_OutputTypeNumber);
        typeOfOutput = getType();
        System.out.print(Localized.input_Message_ValueNeedConvert);
        value = Localized.sc.nextLine();
    }

    public String getType(){
        System.out.println("(1) Binary");
        System.out.println("(2) Decimal");
        System.out.println("(3) Hexadecimal");

        return Localized.sc.nextLine();
    }

    private void process(){
        switch(typeOfInput + typeOfOutput){
            case "12":
                System.out.print(BIN_to_DEC(value));
                break;
            case "13":
                System.out.print(BIN_to_HEX(value));
                break;
            case "21":
                System.out.print(DEC_to_BIN(value));
                break;
            case "23":
                System.out.print(DEC_to_HEX(value));
                break;
            case "31":
                System.out.print(HEX_to_BIN(value));
                break;
            case "32":
                System.out.print(HEX_to_DEC(value));
        }
    }

    private String BIN_to_HEX(String BIN){
        return DEC_to_HEX(BIN_to_DEC(BIN));
    }

    private String HEX_to_BIN(String HEX){
        return DEC_to_BIN(HEX_to_DEC(HEX));
    }


    private String DEC_to_HEX(String DEC){
        int value = Integer.parseInt(DEC);
        String HEX = "";
        while(value > 0){
            HEX = Localized.charInHEX.charAt(value % 16) + HEX;
            value /= 16;
        }
        return HEX;
    }

    private String HEX_to_DEC(String HEX){
        int DEC = 0;
        for(int i = 0; i < HEX.length(); ++i){
            DEC += Localized.charInHEX.indexOf(HEX.charAt(i)) * Math.pow(16, HEX.length() - 1 - i);
        }
        return String.valueOf(DEC);
    }

    private String DEC_to_BIN(String DEC) {
        int value = Integer.parseInt(DEC);
        String BIN = "";
        while(value > 0){
            BIN = (value % 2) + BIN;
            value = value / 2;
        }
        return BIN;
    }

    private String BIN_to_DEC(String BIN) {
        int DEC = 0;
        for(int i = 0; i < BIN.length(); ++i) {
            DEC += Integer.parseInt(String.valueOf(BIN.charAt(i))) * Math.pow(2, BIN.length() - 1 - i);
        }
        return String.valueOf(DEC);
    }
}
