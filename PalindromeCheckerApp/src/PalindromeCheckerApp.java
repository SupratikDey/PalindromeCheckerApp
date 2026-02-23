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
 Compares characters from both ends
 *- Determines whether the string is a palindrome
 *- Displays the result on the console
 *
 *This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
public class UseCase2PalindromeChecker App {
/**
 * Application entry point for UC2.
 *
 * @param args Command-line arguments
 */


public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "madam";
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
