package Basic;

public class ReverseInteger {
    public static void main(String[] args) {
        int ans = reverse(1534236469);
        System.out.println(ans);
    }
    
    public  static int reverse(int x) {
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;

        long temp = 0;
        int rem  = 0;
        while(x != 0){
            rem = x % 10;
            temp = temp * 10 + rem;
            x = x / 10;
        }
        if (temp < min || temp > max) return 0;
        return (int) temp;
    }
}
