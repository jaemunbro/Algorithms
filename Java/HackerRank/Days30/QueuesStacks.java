package HackerRank.Days30;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, , is a palindrome?

 To solve this challenge, we must first take each character in , enqueue it in a queue, and also push that same character onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means  isn't a palindrome).

 Write the following declarations and implementations:

 Two instance variables: one for your , and one for your .
 A void pushCharacter(char ch) method that pushes a character onto a stack.
 A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
 A char popCharacter() method that pops and returns the character at the top of the  instance variable.
 A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.
 */

import java.io.*;
import java.util.*;

public class QueuesStacks {
    // Write your code here.

    String Queue = "";
    String Stacks = "";
    // push data into Stack
    void pushCharacter(char c){
        //qSB.append(c);
        Stacks = Stacks + c;
        //System.out.println("*push stack : " + Stacks);
    }
    // pop data out of Stack
    char popCharacter(){
        return Stacks.charAt(Stacks.length() - 1);

    }

    // enqueue data
    void enqueueCharacter(char c){
        Queue = Queue + c;
        //System.out.println("* enqueue : " + Queue);
    }
    // dequeue data
    char dequeueCharacter(){
        return Queue.charAt(0);

    }

    //StringBuilder qSB = new StringBuilder();
    //StringBuilder sSB = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesStacks p = new QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }



}