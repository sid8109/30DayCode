import java.util.*;

public class ZigZag_Array {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = new int[n];
        int k = 0;
        for(int i = 0; i <= n / 2; i++) {
            ans[k++] = arr[i];
            ans[k++] = arr[n - i - 1];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }   
}
