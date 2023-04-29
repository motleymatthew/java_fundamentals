package labs_examples.fundamentals.labs;


import java.net.SocketOption;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int x = str.length();
        System.out.println("The string length is: "+x);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        int y =str2.length();
        boolean bool = x==y;
        System.out.println("Is str equal to str2? " + bool);
        // please concatenate str & str2 and set the result to a new String variable below
        System.out.println(str+" "+str2);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("A big " + str2.toUpperCase() + " to you!");
        String substr = "";
        substr = str.substring(4,6);
        System.out.println(substr);

    }


}