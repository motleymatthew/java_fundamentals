package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean none = false;
        System.out.println("Is today Sunday? "+ none);

        char letter = 'J';
        System.out.println("The 10th letter of the alphabet is: "+ letter);

        byte byteNum = 123;
        System.out.println("My favorite number between -128 and 127 is: "+ byteNum);

        short shorty = 12623;
        System.out.println("There are " + shorty + " residence in my hometown.");

        int chance = 1000000;
        System.out.println("The odds are "+ chance + ":1");

        long limit = 9223372036854775807l;
        System.out.println(limit + " Now that's a LONG number!");

        float floating = 93485709348752093452340985723495f;
        System.out.println("I could FLOAT for less than " + floating + " minutes");

        double percentSure = 99.996934845723459902372349934577;
        System.out.println("I'm " + percentSure + "% sure you'll be ok.");
    }

}
