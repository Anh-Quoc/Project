import java.util.ArrayList;

class CalculatorTest{
    static String string_Calculation = "4x3/4x123/2";
    static String allMathSymbol = "+-x/";
    static String allNumber = "0123456789.";
    static ArrayList<String> array_Calculation = new ArrayList<>();

	public static void main(String[] args) {
        convertCalculationToArray();
        System.out.println(asteriskAndDivisionStartAt(1));
        // System.out.println(asteriskNumber("4.0", "3.0"));

	}
    
    private static String asteriskAndDivisionStartAt(int index){
        String value = array_Calculation.get(index - 1);
        for(int i = index; i < array_Calculation.size() - 1; i = i + 2){
            if(array_Calculation.get(i).equals("x")){
                value = asteriskNumber(value, array_Calculation.get(i + 1));
            }
            if(array_Calculation.get(i).equals("/")){
                value = divisionNumber(value, array_Calculation.get(i + 1));                
            }
            
        }
        return value;
    }

    private static String asteriskNumber(String number_1, String number_2){
        Double valueNumber_1 = Double.valueOf(number_1);
        Double valueNumber_2 = Double.valueOf(number_2);

        return String.valueOf(valueNumber_1 * valueNumber_2);
    }

    private static String divisionNumber(String number_1, String number_2){
        Double valueNumber_1 = Double.valueOf(number_1);
        Double valueNumber_2 = Double.valueOf(number_2);

        return String.valueOf(valueNumber_1 / valueNumber_2);
    }
    private static void convertCalculationToArray(){
        String number = "";
        for(int i = 0; i < string_Calculation.length(); ++i){
            String characters = String.valueOf(string_Calculation.charAt(i));
            if(isNumberAndDot(characters)){
                number += characters;
            } else {
                array_Calculation.add(number);
                array_Calculation.add(characters);
                number = "";
            }
        }
        array_Calculation.add(number);
    }

    private static boolean isNumberAndDot(String value){

        return allNumber.contains(value);
    }


}