package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
//-------Having trouble finding the sum of array numbers
        for(int i = 0;i < numbers.length;i++){
            System.out.print("Enter number: ");
            numbers[i] = nums.nextInt();
            sum = sum + numbers[i];

        }
        System.out.println(sum);
        System.out.println(sum/numbers.length);
    }
}