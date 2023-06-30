package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int i, j, rows, k;
        rows = cathetusLength;
        for (i = 1; i <= rows; i++)
        {
            for (j = i; j < rows; j++)
            {
               System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
            {
                System.out.print("*"); // print the Star
            }
            System.out.print ("\n");
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
