package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i, space, rows, k = 0, count = 0, count1 = 0;
        rows = cathetusLength;
        for (i = 1; i <= rows; ++i) {
            for (space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.printf("%d ", i + k);
                    ++count;
                } else {
                    ++count1;
                    System.out.printf("%d ", (i + k - 2 * count1));
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
