package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Are");
        list.add("you");
        list.add("ready");
        list.add("for");
        list.add("this");
        list.add("?");

        if (!list.isEmpty()){
            // iterate over ever element in the ArrayList and print it
            for (String s : list){
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println("There are "+list.size()+" elements in this ArrayList");
            System.out.println(list.get(2)+" is in index position 2.");
        }

    }
}
