package MainProject;


import java.util.Random;

public class ControlProgram {

    public static boolean isContinue(String message) {
        System.out.println(message);
        switch (Localized.sc.nextLine().toLowerCase()) {
            case Localized.choose_Yes:
                return true;
            case Localized.choose_No:
                return false;
            default:
                System.out.println(Localized.error_Message_Continue);
                return isContinue(message);
        }
    }

    public static int[] create_RandomArray(int sizeArray){
        int[] intArray = new int[sizeArray];
        Random ran = new Random(sizeArray);
        for(int i = 0; i < intArray.length; ++i){
            intArray[i] = ran.nextInt(sizeArray);
        }
        return intArray;
    }


}
