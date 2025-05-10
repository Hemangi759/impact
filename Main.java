import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        while (n-- > 0) set.add(sc.nextInt());
        sc.close();
        System.out.println("Number of distinct elements: " + set.size());
    }
}