import java.util.*;

public class Temp {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        int t = sc.nextInt();
        System.out.println("Kelvin = " + (t + 273.15));
        System.out.println("Fahrenheit = " + (t * 1.8 + 32.0));
    } 
}
