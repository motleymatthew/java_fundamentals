package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 6;
        int b =3;
        int years = 10;


        int m = multiply(a,b);
        System.out.println(a+"*"+b+"="+m);
        int d = divide(a,b);
        System.out.println(a+"/"+b+"="+d);
        printJoke();
        int ysec = yrsSec(years);
        System.out.println("There are " + ysec + " seconds in " + years + "year(s)");
        vargs(1,56,88,345,334,43,55);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        public static int multiply(int a, int b){
            return a * b;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
        public static int divide(int a, int b){
            return a / b;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
        public static void printJoke(){
            System.out.println("Why do gorillas have big nostrils?  Big fingers");
        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
        public static int yrsSec(int years){
            return years * 31536000;
        }

    // 5) Create a varargs method that will return the length of the varargs array passed in
        public static void vargs(int...v){
            System.out.println("Length of array: " + v.length);
        }





}
