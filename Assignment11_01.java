import java.util.*;

public class Assignment11_01 {
    public static void main(String[] args) {
        System.out.println("Infix Expression     Postfix Expression");
        System.out.println("  (1 + 2) * 3            "
                + infixToPostfix("(1 + 2) * 3"));
        System.out.println("   2 * (1 + 3)           "
                + infixToPostfix("2 * (1 + 3)"));
    }

    public static String infixToPostfix(String expression) {

        LinkedList<String> operatorList = new LinkedList<>();
        LinkedList<String> resultList = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
        expression = insertBlanks(expression);
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.length() == 0)
                continue;
            else if (token.charAt(0) == '(')
                stack.push(token.charAt(0));
            else if (!stack.isEmpty() && stack.peek() == '(' &&
                    token.charAt(0) != ')') {
                if (Character.isDigit(token.charAt(0)))
                    resultList.addLast(token);
                else if (token.charAt(0) == '+' || token.charAt(0) == '-' ||
                        token.charAt(0) == '*' || token.charAt(0) == '/')
                    operatorList.addFirst(token);
            } else if (!stack.isEmpty() && token.charAt(0) == ')') {

                resultList.addAll(operatorList);
                operatorList.clear();
                stack.pop();
            } else if (token.charAt(0) == '+' || token.charAt(0) == '-')
                operatorList.addLast(token);
            else if (token.charAt(0) == '*' || token.charAt(0) == '/')
                operatorList.addFirst(token);
            else if (Character.isDigit(token.charAt(0)))
                resultList.addLast(token);
        }
        String result = "";
        resultList.addAll(operatorList);
        for (String e : resultList) {
            result += e + " ";
        }

        return result;
    }

    public static String insertBlanks(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                    s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/')
                result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }

        return result;
    }
}
