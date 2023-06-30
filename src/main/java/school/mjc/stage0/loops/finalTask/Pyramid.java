package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i, j, rows, k = 0;
        rows= cathetusLength;
        for ( i =1; i <= rows; i++)
        {
            // inner loop define j should be less than equal to rows- i
            for ( j = 1; j <= rows - i; j++)
            {
                System.out.print("  "); // print the space
            }
            // use for loop where k is less than equal to (2 * i -1)
            for ( k = 1; k <= ( 2 * i - 1); k++)
            {
                System.out.printf ("%d ",i); // print the number
            }
            System.out.print ("\n");
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
