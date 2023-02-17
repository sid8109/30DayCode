import java.util.*;

public class Factorial {
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        System.out.println(fact(n));

        // This is a better method
        int ans[] = new int[n];
        ans[0] = 1;

        for(int i = 2; i <= n; i++) {
            ans[i - 1] = i * ans[i - 2];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}