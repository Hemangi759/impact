import java.util.Scanner;

public class InsertIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

      
        int pos = scanner.nextInt();
        int element = scanner.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
      
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
