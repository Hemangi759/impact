import java.util.Scanner;

public class PerfectHollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int size = scanner.nextInt();

        if (size < 4) {
            System.out.println("");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}