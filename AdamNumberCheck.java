
import java.util.Scanner;

public class AdamNumberCheck {

    
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

  
    public static boolean isAdamNumber(int num) {
        int squareOriginal = num * num;
        int reverse = reverseNumber(num);
        int squareReverse = reverse * reverse;
        int reverseSquareReverse = reverseNumber(squareReverse);

        return squareOriginal == reverseSquareReverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        if (isAdamNumber(num)) {
            System.out.println(num + " is an Adam number.");
        } else {
            System.out.println(num + " is not an Adam number.");
        }

        scanner.close(); 
    }
}