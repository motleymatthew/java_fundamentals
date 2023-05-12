package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MethodTraining {

    int[] scores = {45, 96, 69, 87};



    public static void main(String[] args) {
        int numInt = methodPlus(8, 5);
        double numDoub = methodDoub(4.3, 6.26);
        System.out.println("1) int: " + numInt);
        System.out.println("1) double: " + numDoub);

        methodPBV(8,2);

        Person person1 = new Person(35, 70,"Matthew");
        System.out.println("2) " + person1.toString());
        methodPBR(person1);
        System.out.println("2) " + person1.toString());

        arrayMax();

        Scanner scan = new Scanner(System.in);
        System.out.print("4) Enter a sentence: ");
        String sentence = scan.nextLine();

        countCons(sentence);

        Scanner primeScan = new Scanner(System.in);
        System.out.print("5) Enter an int: ");
        String numb = primeScan.nextLine();

        primeTime(numb);

        lowHigh();

        arrList(1,3,2);

        reverseArray();


    }
    //1) Demonstrate method overloading in this class
    public static int methodPlus(int x, int y) {
        return x + y;
    }
    public static double methodDoub(double x, double y) {
        return x + y;
    }
    //2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void methodPBV(double a, double b){
        a = a * b;
        System.out.println("2) "+ a);
        b = b / a;
        System.out.println("2) "+ b);
    }
    public static void methodPBR(Person person1){
        person1.name = "Bethany";
        person1.height = 67;
        person1.age = 34;
    }
    //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static void arrayMax(){
        MethodTraining mt = new MethodTraining();
        int maxNum = mt.scores[0];
        for (int j : mt.scores) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("3) Maximum number = " + maxNum);
    }
    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static void countCons(String sentence){
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int consCount = 0;
        int i;
        int length = sentence.length();
        for(i = 0; i < length; i ++){
            char currentChar = sentence.charAt(i);
            if (vowels.indexOf(currentChar)>=0)
                vowelCount++;
            else if(Character.isLetter(currentChar))
                consCount++;
        }
        System.out.print("4) There are " + consCount + " consonants in your sentence.");
        System.out.println();
    }

    //5) Write a method that will determine whether or not a number is prime
    public static void primeTime(String numb) {
        int number = Integer.parseInt( numb );
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        if (count == 2) {
            System.out.println("5) " + number + " is prime");
        }else {
            System.out.println("5) " + number + " is not prime");
        }
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in
    // a given numeric array, which is passed in as an argument
    public static int[] lowHigh(){
        //two place array, use intScores array
        MethodTraining mt = new MethodTraining();
        int maxNum = mt.scores[0];
        for (int j : mt.scores) {
            if (j > maxNum)
                maxNum = j;
        }
        int minNum = mt.scores[0];
        for (int k : mt.scores) {
            if (k < minNum)
                minNum = k;
        }
        int[] lh = {minNum, maxNum};
        System.out.print("6) ");
        System.out.println(Arrays.toString(lh));
        return lh;

    }
    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //   In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //   divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //   length of the returned list


    public static ArrayList<Integer> arrList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> arrli = new ArrayList();
        if (maxNum > 0) {
            for(int i = maxNum; i > 0; i--){
                for(int diOne = divisor1; i % divisor1 == 0;i--){
                    for(int diTwo = divisor2; i % divisor2 == 0;i--){
                        arrli.add(i);
                    }
                }
            }
            System.out.println("7) ArrayList size: "+arrli.size());
            System.out.println("7) ArrayList: "+ arrli);
        } else {
            System.out.println("7) maxNum less than zero, I cannot compute");
        }
        return arrli;
    }
    /*Need to work through this still ^^^*/
    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array
    public static void reverseArray(){
        MethodTraining mt = new MethodTraining();
        for(int i = 0; i < mt.scores.length / 2; i++){
            int temp = mt.scores[i];
            mt.scores[i] = mt.scores[mt.scores.length - i - 1];
            mt.scores[mt.scores.length - i - 1] = temp;
        }
        System.out.print("8) Contents of array after for loop - ");
        for(int i : mt.scores){
            System.out.print(i + " ");
        }
    }
}

