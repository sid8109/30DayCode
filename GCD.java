import java.util.*;

public class GCD {
    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("GCD of the two numbers is : " + gcd(a, b));
    }  
}
