import java.util.LinkedList;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char first = list.removeFirst(); // remove from front
            char last = list.removeLast();   // remove from end

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}