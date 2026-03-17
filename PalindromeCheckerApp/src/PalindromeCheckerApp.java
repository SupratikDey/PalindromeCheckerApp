/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 *
 * Description:
 * Measures execution time of palindrome validation algorithms.
 *
 * @author Supratik
 * @version 13.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Choose strategy (Stack-based here)
        PalindromeStrategy strategy = new StackStrategy();

        // Start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time (nanoseconds): " + duration);

        sc.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based Strategy
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}