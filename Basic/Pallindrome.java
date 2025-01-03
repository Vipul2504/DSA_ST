package Basic;

public class Pallindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(1234321);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        long temp = x;
        long rev = 0;

        while(temp != 0){
            int digit = (int) (temp % 10);
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return (rev == x);
    }
}
