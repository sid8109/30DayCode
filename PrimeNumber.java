import java.util.*;

public class PrimeNumber {
    public static boolean checkPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        
        if(checkPrime(n)) 
            System.out.println("Prime");
        else 
            System.out.println("Not Prime");
    } 
}
