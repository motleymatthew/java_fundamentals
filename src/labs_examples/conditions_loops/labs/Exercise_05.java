package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a different positive number: ");
        int num2 = scanner.nextInt();

        if(num1<num2){
            //calculates if first number is less than number 2
            for(int i = 0; num1 <= num2; num1++) {
                i = i + num1;
                float avgi = 0.0f;
                System.out.println("The sum is: " + i);
                float f = i;
                avgi = f / num2;
                System.out.println("The average is: " + avgi);
            }
        }else if(num1>num2){
            //calculates if first number is greater than number 2
            for(int i = 0; num1 >= num2; num2++) {
                i = i + num2;
                float avgi = 0.0f;
                System.out.println("The sum is: " + i);
                float f = i;
                avgi = f / num1;
                System.out.println("The average is: " + avgi);
            }
        }else{
            System.out.println("Function not supported");
        }
    }
}
//Known issues: printing results only once, negative numbers. I spent two hours on this, I'm content with this build for now.
