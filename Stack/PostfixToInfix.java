import java.util.*;

public class PostfixToInfix {

    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String result = "(" + op2 + c + op1 + ")";
                stack.push(result);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();

    }

    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            String postfix = input.nextLine();
            if (postfix.isEmpty()) {
                input.close();
                break;
            }
            System.out.println(postfixToInfix(postfix));
        }
    }
}
