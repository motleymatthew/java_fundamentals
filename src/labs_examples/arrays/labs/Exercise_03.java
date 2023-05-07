package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDim  = new int[5][5];
        for(int y = 0; y < twoDim.length; y++){
            for(int x = 0; x < twoDim[y].length; x++){
                //just need to figure out the math here
                twoDim[y][x] = (y * 15) + ((x + 1) * 3);
                System.out.print(twoDim[y][x]+" | ");
            }
            System.out.println();
        }
    }
}
//complete