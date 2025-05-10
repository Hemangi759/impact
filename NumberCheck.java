import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 2-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            if (number < 20) {
                System.out.println("The number is less than 20.");
            } else {
                if (number % 2 == 0) {
                    System.out.println("The number is even and greater than or equal to 20.");
                } else {
                    System.out.println("The number is odd and greater than or equal to 20.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a 2-digit number.");
        }

        scanner.close();
    }
}