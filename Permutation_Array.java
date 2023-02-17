import java.util.*;

public class Permutation_Array {
    public static void buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        buildArray(arr);
    }
}
