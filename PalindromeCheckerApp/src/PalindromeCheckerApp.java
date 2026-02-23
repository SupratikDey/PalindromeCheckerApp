/**
 *
 *MAIN CLASS Use Case 2Palindrome Checker App
 * Use Case 2: Hardcoded Palindrome Validation
 * Description:
 *This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 *At this stage, the application:
 * - Stores a predefined string
 =============================================
 UC3 - Palindrome Check Using String Reverse
 * ===========================================
 * Checking Palindrome by reversing the String
 * Hardcoded String is Reversed using For loop and Then both string are compared using .equals() method
 *
 Display the result

 @Developer Supratik
 @version 3.0
  * */


public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version 1.0");
        System.out.println("System initialized successfully.");
        String word = "hello";
        String word_reverse = "";
        for(int i=word.length()-1;i>=0;i--){
            word_reverse = word_reverse + word.charAt(i);
        }
        if(word.equals(word_reverse)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}