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
        Stack<String> palindroms = new Stack<>();

        String word = "";
        Scanner sc = new Scanner(System.in);

        while (!(word = sc.next()).equals("quit")) {
            queue.enqueue(word);
            if (isPalindrom(word)) {
                palindroms.push(word);
                System.out.println("\"" + word + "\"" + " is palindrom!");
            }
        }
        System.out.println("All the palindrom: ");
        System.out.println(palindroms.toString());
    }

    public static boolean isPalindrom(String word) {
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
}
