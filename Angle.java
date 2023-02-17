import java.util.*;

public class Angle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int hrs, mins;
        System.out.println("Enter hrs and mins : ");
        hrs = sc.nextInt();
        mins = sc.nextInt();

        float ah = 30 * hrs + (30 * mins / 60);
        float mh = 6 * mins;
        System.out.println(ah - mh);
    }
} 