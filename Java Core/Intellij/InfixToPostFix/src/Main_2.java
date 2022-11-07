

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Stack;

public class Main_2 {
    static String infixString = "10/3";
    static ArrayList<String> infixArray = new ArrayList<>();

    static final String mathSymbol = "+-x/";
    static Stack<String> operator = new Stack<>();
    static ArrayList<String> postFix = new ArrayList<>();

    public static void main(String[] args) {
        infixFormat();

        for(int i = 0; i < infixArray.size(); ++i){
            if(isOperator(infixArray.get(i))){
                while (!operator.isEmpty() && operatorPrecedence(infixArray.get(i)) <= operatorPrecedence(operator.peek())){
                    postFix.add(operator.pop());
                }
                operator.push(infixArray.get(i));
            } else {
                postFix.add(infixArray.get(i));
            }
        }

        while (!operator.isEmpty()){
            postFix.add(operator.pop());
        }

        System.out.println(calculation());
    }

    private static boolean isOperator(String value){

        return mathSymbol.contains(value);
    }

    private static void infixFormat(){
        infixString = infixString.replaceAll("[+]", " + ");
        infixString = infixString.replaceAll("-", " - ");
        infixString = infixString.replaceAll("x", " x ");
        infixString = infixString.replaceAll("/", " / ");

        infixArray.addAll(Arrays.asList(infixString.split(" ")));
    }

    private static int operatorPrecedence(String op){
        switch (op){
            case "+":
            case "-":
                return 1;
            case "x":
            case "/":
                return 2;
        }
        return -1;
    }

    private static String calculation(){
        Stack<String> result = new Stack<>();
        for(int i = 0; i < postFix.size(); ++i){
            if(isOperator(postFix.get(i))){
                Double value_1 = Double.parseDouble(result.pop());
                Double value_2 = Double.parseDouble(result.pop());
                result.push(calculateValue(value_1, value_2, postFix.get(i)));
            } else {
                result.push(postFix.get(i));
            }
        }
        return result.pop();
    }

    private static String calculateValue(Double value_1, Double value_2, String operator){
        Double result = 0.0;
        switch (operator){
            case "+":
                result = value_1 + value_2;
                break;
            case "-":
                result = value_2 - value_1;
                break;
            case "x":
                result = value_1 * value_2;
                break;
            case "/":
                result = value_2 / value_1;
                break;
        }
        return String.valueOf(result);
    }

}
