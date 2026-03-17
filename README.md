# PalindromeCheckerApp

Version 3.0 - UC3: Palindrome Check Using String Reverse

Checking Palindrome by reversing the String
* Hardcoded String is Reversed using For loop 
* String is Concatinated (word_reverse = word_reverse + word.charAt(i);)
* Then both string are compared using .equals() method
* Display the result

Version 4.0 - UC4: Palindrome Check Using Character arrays
* Checking Palindrome by converting String to character array using
* char[] letters = word.toCharArray();
* 2 pointers are initiated start=0 ; end = word.length()-1;
* declare boolean ispalindrome = true (initially assume its true)
* While loop is implemented while (start<end)
* if word[start] != word[end]
* upadte palindrome to false and break loop
* Display the result

Version6 : Queue Stack Fairness Check
* Description:
  *This class demonstrates palindrome validation using
* two different data structures:
  Queue (FIFO First In First Out)
  Stack (LIFO Last In First Out)
* Characters are inserted into both structures and then
* compared by removing from the front of the queue and
  the top of the stack.
* If all characters match, the input string is confirmed
* as a palindrome.
  *This use case helps understand how FIFO and LIFO
  behaviors can be combined for symmetric comparison.
  @author Developer
  @version 6.0

UC7: Deque-Based Optimized Palindrome Checker
Goal: Use Deque to compare front and rear elements.
Flow:
Insert characters into deque
Remove first & last
Compare until empty
Key Concepts used in UC7:
Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.
Front and Rear Access – Enables direct comparison of first and last characters.
Optimized Data Handling – Eliminates the need for separate reversal data structures.
Data Structure: Deque


