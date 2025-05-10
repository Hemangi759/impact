
import java.util.Scanner;

public class KaprekarCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isKaprekar(num))
            System.out.println(num + " is a Kaprekar number.");
        else
            System.out.println(num + " is not a Kaprekar number.");
    }

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        long square = (long) n * n;
        int numDigits = countDigits(n);

        long divider = (long) Math.pow(10, numDigits);

        if (divider == 0) return false;

        long right = square % divider;
        long left = square / divider;

        return (right + left) == n;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}