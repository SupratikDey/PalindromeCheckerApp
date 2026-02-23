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
 UC5: Stack-Based Palindrome Checker
 * ===========================================
 * Checking Palindrome using Stack
 * Stack<Character> Letter_Stack = new Stack<>();
 * use for loop to .push() all elements into stack
 * declare boolean ispalindrome = true (initially assume its true)
 * for loop for [0 to word.length()-1] comparing elements
 * if(word.charAt(i)!=Letter_Stack.pop())
 * update ispalindrome to false and break loop
 * Display the result

 @Developer Supratik
 @version 5.0
  * */
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "hello";
        Stack<Character> Letter_Stack = new Stack<>();
        for(int i=0;i<word.length();i++){
            Letter_Stack.push(word.charAt(i));
        }
        boolean ispalindrome = true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=Letter_Stack.pop()){
                ispalindrome = false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}