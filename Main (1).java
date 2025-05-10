import java.util.*;

public class Main 
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter array size: ");
      int n=sc.nextInt();                   
      int arr[] = new int[n];
      System.out.println("enter element: ");
      for (int i=0; i<n; i++) 
      {
        arr[i]=sc.nextInt();         
      }
      int sum=0;
      System.out.println("elements in the array");
      for(int i=0; i<n; i++)
      {
        sum=arr[i];
        System.out.println(arr[i]+" ");
      }
      System.out.println("sum"+sum);
      }
    }