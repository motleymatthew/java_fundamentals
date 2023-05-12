package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any other number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int n = factorial(5);
        //factorial(4);
        System.out.println(n);
//        should print 120
    }
        public static int factorial(int n) {
            if (n <= 2) {
                return n;
            }
            return n * factorial(n - 1);
        }
}







