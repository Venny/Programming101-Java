package week02.Friday.CalcTheCalculator;

import java.util.*;

/**
 * Created by inspired on 27.11.15.
 */
public class CalcTheCalculator {
    public static int evaluate(String input){
        Queue<String> output = postfix(input);
        int result = calculate(output);
        System.out.println("Output: " + result);
        return result;
    }

    /*
	 * Implementing Shunting Yard Algorithm
	 */
    private static Queue<String> postfix(String input) {
        Queue<String> outputQueue = new LinkedList<>();
        Stack<Character> operatorStack = new Stack<>();
        char[] inputArray = input.replaceAll(" ", "").toCharArray();
        System.out.println(input.replaceAll(" ", ""));

        for (int i = 0; i < inputArray.length; i++) {

            // operator
            if (ops.containsKey(Character.toString(inputArray[i]))) {
                while (!operatorStack.isEmpty() && isHigherPrecedence(inputArray[i], operatorStack.peek())) {
                    outputQueue.add(String.valueOf(operatorStack.pop()));
                }
                operatorStack.push(inputArray[i]);

            // left parenthesis
            } else if (inputArray[i] == '(') {
                operatorStack.push(inputArray[i]);

            // right parenthesis
            } else if (inputArray[i] == ')') {
                while (operatorStack.peek() != '(') {
                    outputQueue.add(String.valueOf(operatorStack.pop()));
                }
                operatorStack.pop();

            // digit
            } else {
                String num = "";
                int n = i;
                while(n < inputArray.length && Character.isDigit(inputArray[n])){
                    num += inputArray[n];
                    n++;
                }
                i = n - 1;
                outputQueue.add(num);
            }
        }
        // While we have operators
        while (!operatorStack.isEmpty()) {
            outputQueue.add(String.valueOf(operatorStack.pop()));
        }

        return outputQueue;
    }

    /*
          * Implementing Postfix Calculator Algorithm
          */
    private static int calculate(Queue<String> postfix) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        while (!postfix.isEmpty()) {
            if (ops.containsKey(postfix.peek()) && !stack.isEmpty()) {
                int rightInt = stack.pop();
                int leftInt = stack.pop();
                // Get the result
                result = postfix.peek().compareTo("*") == 0 ? leftInt * rightInt
                        : postfix.peek().compareTo("/") == 0 ? leftInt / rightInt
                        : postfix.peek().compareTo("+") == 0 ? leftInt + rightInt : leftInt - rightInt;

                // Add the result to the stack
                stack.add(result);
                // remove the operator from the postfix queue
                postfix.poll();
            } else {
                stack.add(Integer.parseInt(postfix.poll()));
            }
        }
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
        return result;
    }

    private static enum Operator {
        ADD(1), SUBSTRACT(2), MULTIPLY(3), DIVIDE(4);
        final int precedence;

        Operator(int p) {
            precedence = p;
        }
    }

    private static Map<String, Operator> ops = new HashMap<String, Operator>() {
        {
            put("+", Operator.ADD);
            put("-", Operator.SUBSTRACT);
            put("*", Operator.MULTIPLY);
            put("/", Operator.DIVIDE);
        }
    };

    private static boolean isHigherPrecedence(char operator, Character sub) {
        return (ops.containsKey(sub) && ops.get(sub).precedence >= ops.get(operator).precedence);
    }
}
