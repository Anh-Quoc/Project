import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostFixCalculator {

    private static final String ADD = "+"; 
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    public static void main(String[] args) {
        String input = "4/2+3*2";
        System.out.println(input + " = " + calculate(input));
    }

    // public void calculateFile(String fileName) throws IOException {


    //         System.out.println(input + " = " + calculate(input));

    // }

    private static int calculate(String input) {
        SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<>();

        String[] inputs = input.split(" ");

        return handleCalculation(stack, inputs);
    }

    private static int handleCalculation(SinglyLinkedListStack<Integer> stack, String[] el) {
        int operand1, operand2;

        for(int i = 0; i < el.length; i++) {
            if( el[i].equals(ADD) || el[i].equals(SUB) || el[i].equals(MUL) || el[i].equals(DIV) ) {
                operand2 = stack.pop();
                operand1 = stack.pop();
                switch(el[i]) {
                    case ADD: {
                        int local = operand1 + operand2;
                        stack.push(local);
                        break;
                    }

                    case SUB: {
                        int local = operand1 - operand2;
                        stack.push(local);
                        break;
                    }

                    case MUL: {
                        int local = operand1 * operand2;
                        stack.push(local);
                        break;
                    }

                    case DIV: {
                        int local = operand1 / operand2;
                        stack.push(local);
                        break;
                    }
                }
            } else {
                stack.push(Integer.parseInt(el[i]));
            }
        }

        return stack.pop();
    }

}