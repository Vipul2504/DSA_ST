package Basic;

public class AmstrongNumber {
    public static void main(String[] args) {
        boolean ans = isArmstrong(153);
        System.out.println(ans); // Output should be true
    }

    public static boolean isArmstrong(int n) {
        int count = String.valueOf(n).length();
        int sum = 0;
        int num = n;

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }
        return sum == n;
    }
}
