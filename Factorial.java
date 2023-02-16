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
    }
}