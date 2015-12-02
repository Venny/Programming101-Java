package Week03.Wednesday;

import java.util.Stack;

/**
 * Created by inspired on 02.12.15.
 */
public class Brackets {
    public static void main(String[] args){
        System.out.println(checkTheBrackets("()()())))((())("));
        System.out.println(checkTheBrackets("(()()())"));
    }

    public static boolean checkTheBrackets(String brackets){
        if(brackets.charAt(0) == ')' || brackets.charAt(brackets.length() - 1) == '('){
            return false;
        }
        Stack<Character> tempData = new Stack<>();
        for(char bracket:brackets.toCharArray()){
            if(bracket == '('){
                tempData.push(bracket);
            } else {
                if(tempData.pop() != '('){
                    return false;
                }
            }
        }
        return true;
    }
}
