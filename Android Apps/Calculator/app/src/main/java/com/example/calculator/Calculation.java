package com.example.calculator;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Stack;

public class Calculation {
    private String infixString;
    private ArrayList<String> infixArray;

    private Stack<String> operator;
    private ArrayList<String> postFix;

    private int ID;
    private String string_Calculation;
    private String answer;
    private final String mathSymbol = "+-x/";
    private final int NUMBER_BEHIND_DOT = 8;

    public Calculation(){
        infixString = "";
        infixArray = new ArrayList<>();
        operator = new Stack<>();
        postFix = new ArrayList<>();
        string_Calculation = "";
        answer = "0";
    }

    public Calculation(int ID, String string_Calculation, String answer){
        this.ID = ID;
        this.string_Calculation = string_Calculation;
        this.answer = answer;
    }

    public void addNumber(String numberInput){
        string_Calculation += numberInput;

    }

    public void addMathSymbol(String mathSymbolInput){
        string_Calculation += mathSymbolInput;

    }

    public void changeLastMathSymbol(String mathSymbolInput){
        string_Calculation = string_Calculation.substring(0, string_Calculation.length() - 1);
        string_Calculation += mathSymbolInput;
    }

    public void clearAll(){
        string_Calculation = "";
        answer = "0";
    }

    public void backSpace(){
        if(string_Calculation.length() == 2 && String.valueOf(string_Calculation.charAt(0)).equals("0")){
            clearAll();
        }
        if(!string_Calculation.equals("")){
            string_Calculation = string_Calculation.substring(0, string_Calculation.length() - 1);
        }
    }

    public void processPercent(){
        StringBuilder lastValue = new StringBuilder();
        int i;
        for(i = string_Calculation.length() - 1; i >= 0; --i){
            if(mathSymbol.contains(String.valueOf(string_Calculation.charAt(i)))){
                break;
            }
            lastValue.insert(0, string_Calculation.charAt(i));
        }
        double value = Double.parseDouble(lastValue.toString());
        value = value / 100;
        string_Calculation = string_Calculation.substring(0, i + 1) + value;
    }

    public boolean isEmpty(){
        return string_Calculation.isEmpty();
    }

    public boolean noMathSymbolInTheEnd(){
        String lastCharacters = String.valueOf(string_Calculation.charAt(string_Calculation.length() - 1));
        return !mathSymbol.contains(lastCharacters);
    }

    public boolean hasDotInFront(){
        int indexOfLastDot = string_Calculation.lastIndexOf(".");
        if(indexOfLastDot == -1){
            return false;
        }
        for(int i = indexOfLastDot; i < string_Calculation.length(); ++i){
            String characters = String.valueOf(string_Calculation.charAt(i));
            if(mathSymbol.contains(characters)){
                return false;
            }
        }
        return true;
    }

    public void calculate(){
        string_CalculationFormat();
        convertInfixToPostFix();

        answer = answerWithCondition(calculateValueInStack());
    }

    public int getID() {
        return ID;
    }

    public String getString_Calculation() {
        return string_Calculation;
    }

    public String getAnswer(){
        if(answer.isEmpty()){
            return "0";
        }
        return answer;
    }

    private void string_CalculationFormat(){
        String lastCharacters = String.valueOf(string_Calculation.charAt(string_Calculation.length() - 1));
        if(isOperator(lastCharacters)){
            backSpace();
        }
    }

    private void convertInfixToPostFix(){
        infixString = "";
        infixArray.clear();
        operator.clear();
        postFix.clear();
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
    }

    private String answerWithCondition(String answer){
        int indexDot = answer.indexOf(".");
        if(indexDot == answer.length() - 2){
            answer = answer.replace(".0", "");
        }  else if(indexDot >= 0 && indexDot + NUMBER_BEHIND_DOT < answer.length()){
            answer = answer.substring(0, indexDot + NUMBER_BEHIND_DOT);
        }

        return "= " + answer.replace(".0", "");
    }

    private int operatorPrecedence(String op){
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

    private String calculateValueInStack(){
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

    private boolean isOperator(String value){

        return mathSymbol.contains(value);
    }

    private String calculateValue(Double value_1, Double value_2, String operator){
        double result = 0.0;
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

        return Double.toString(result);
    }

    private void infixFormat(){
        infixString = string_Calculation;
        infixString = infixString.replaceAll("[+]", " + ");
        infixString = infixString.replaceAll("-", " - ");
        infixString = infixString.replaceAll("x", " x ");
        infixString = infixString.replaceAll("/", " / ");

        infixArray.addAll(Arrays.asList(infixString.split(" ")));
    }

    public String toString(){
        return this.string_Calculation;
    }
}
