import java.util.*;

public class ZigZag_Array {
    public static void zigZag(int a[], int n){
        for(int i = 0; i < n - 1; i++) {
            if(i % 2 == 0) {
                if(a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            } else {
                if(a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }

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

        zigZag(arr, arr.length);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}
