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
 UC4 - Palindrome Check Using Character arrays
 * ===========================================
 * Checking Palindrome by converting String to character array using
 * char[] letters = word.toCharArray();
 * 2 pointers are initiated start=0 ; end = word.length()-1;
 * declare boolean ispalindrome = true (initially assume its true)
 * While loop is implemented while (start<end)
 *if word[start] != word[end]
 *update palindrome to false and break loop
 *Display the result

 @Developer Supratik
 @version 4.0
  * */


public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "hello";
        char[] letters = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        boolean ispalendrome = true;
        while(start<end){
            if(letters[start]!=letters[end]){
                ispalendrome = false;
                break;
            }
            start++;
            end--;
        }
        if(ispalendrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}