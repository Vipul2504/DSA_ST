package Basic;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                evenSum += digit;

            } else {
                oddSum += digit;
            }
            n = n / 10;
        }
        sc.close();
    }
}
