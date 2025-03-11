package stack;

import java.util.Stack;

/**
 * 1) Проверка палиндрома
 */
public class Palindrom {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = isPalindrome(input);

        System.out.println("Строка '" + input + "' является палиндромом? " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Добавляем первую половину символов в стек
        for (int i = 0; i < input.length() / 2; i++) {
            stack.push(input.charAt(i));
        }

        // Сравниваем вторую половину символов с элементами стека
        int startIndex = (input.length() + 1) / 2; // Учитываем нечетную длину
        for (int i = startIndex; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
