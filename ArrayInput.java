import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] array1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] array2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.print("First Array: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.print("\nSecond Array: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}