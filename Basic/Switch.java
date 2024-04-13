package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-2): ");
        int ch = scanner.nextInt();
        double[] coll = { 1.5, 2.5 };
        double ans = areaSwitchCase(ch, coll);
        System.out.println(ans);
        scanner.close();
    }

    public static double areaSwitchCase(int ch, double[] a) {
        switch (ch) {
            case 1:
                return Math.PI * a[0] * a[0];
            case 2:
                return a[0] * a[1];
            default:
                return -1;
        }
    }
}
