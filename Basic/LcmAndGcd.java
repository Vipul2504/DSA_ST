package Basic;

import java.lang.reflect.Array;

public class LcmAndGcd {
    public static void main(String[] args) {
        int[] ans = lcmAndGcd(10, 14);
        System.out.println(ans);

    }
 public static int Gcd(int x, int y){
        if(y==0) return x;
        
        else{
            return Gcd(y, x%y);
        }
    }

    public static int[] lcmAndGcd(int a, int b) {
        // parimal codes...
        int gcd = Gcd(a, b);

        int lcm = Math.abs(a * b) / gcd;

        int solution[] = { lcm, gcd };

        return solution;
    }

}
