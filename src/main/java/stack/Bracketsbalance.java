package stack;

import java.util.Stack;
/**
 * 1) пример проверки корректности скобок в выражении
 */
public class Bracketsbalance {
    public static void main(String[] args) {
        String expression = "({[]})"; // Пример сбалансированного выражения
        boolean isBalanced = isBalanced(expression);

        System.out.println("Выражение " + expression + " сбалансировано? - " + isBalanced);
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Если открывающая скобка, добавляем в стек
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            // Если закрывающая скобка, проверяем соответствие
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Нет соответствующей открывающей скобки
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Скобки не совпадают
                }
            }
        }

        // Если стек пуст, значит все скобки сбалансированы
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']') ||
                (opening == '(' && closing == ')');
    }
}
