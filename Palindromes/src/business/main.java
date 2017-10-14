/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.Queue;
import entity.Stack;
import java.util.Scanner;

/**
 *
 * @author vdanh
 */
public class main {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        Stack<String> stack = new Stack<>();

        //using stack to store the palindromes and achieve reverse print order
        Stack<String> palindroms = new Stack<>();

        String word = "";
        Scanner sc = new Scanner(System.in);

        while (!(word = sc.next()).equals("quit")) {
            queue.enqueue(word);
            stack.push(word);

            if (isPalindrome(word)) {
                palindroms.push(word);
                System.out.println("\"" + word + "\"" + " is palindrome!");
            }
        }

        System.out.println("All the palindrom: ");
        System.out.println(palindroms.toString());
    }

    public static boolean isPalindrome(String word) {
        char[] _word = word.toCharArray();
        int i1 = 0, i2 = _word.length - 1;
        while (i2 > i1) {
            if (_word[i1] != _word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    /**
     * Rather than detecting if a word is a palindrome, instead tell me if an
     * entire String is a palindrome, ignoring capitalization and punctuation.
     *
     * @param sentence the sentence to check if it's a palindrome
     * @return {@code true} if the sentence is a palindrome, {@code false}
     * otherwise
     */
    public static boolean extraCredit(String sentence) {
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[\\s+\\pP]", ""); //regex
        /**
         * \\s+ -> means all white spaces (space, tab); \\pP -> means all
         * punctuation
         */
        return isPalindrome(sentence);
    }
}
