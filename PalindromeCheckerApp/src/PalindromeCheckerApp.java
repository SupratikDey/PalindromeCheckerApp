/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates dynamic selection of palindrome algorithms
 * using Strategy Design Pattern.
 *
 * @author Supratik
 * @version 12.0
 */

import java.util.Scanner;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Inject strategy (Stack-based)
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected algorithm
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines contract for all palindrome algorithms
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Stack-based implementation of palindrome checking
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create a stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}