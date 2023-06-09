package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        int wlength = word.length();
        int position = 0;
        int firstVP = -1;

        while(firstVP == -1){
            if(word.indexOf('a') == position){
                firstVP = position;
            } else if (word.indexOf('e') == position) {
                firstVP = position;
            }else if (word.indexOf('i') == position) {
                firstVP = position;
            }else if (word.indexOf('o') == position) {
                firstVP = position;
            }else if (word.indexOf('u') == position) {
                firstVP = position;
            }else{
                position++;
            }

        }
        System.out.println(word);
        char result = word.charAt(position);
        System.out.println(result);
    }
}
