import java.util.Scanner;

public class TrendyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isTrendy(number)) {
            System.out.println(number + " is a trendy number!");
        } else {
            System.out.println(number + " is not a trendy number.");
        }

        scanner.close();
    }

    public static boolean isTrendy(int number) {
        if (number < 100 || number > 999) {
            return false;
        }

        int middleDigit = (number / 10) % 10; 
        return middleDigit % 3 == 0; 
    }
}