package Basic;

public class CountDigit {
    public static void main(String[] args) {
        int n = 12345;
        int ans = evenlyDivides(n);
        System.out.println(ans);
    }

    public static int evenlyDivides(int n) {
        int temp = n; int count = 0;
        while(temp != 0){
            int rem = temp % 10;
            temp = temp / 10;
            if( rem > 0 && n % rem == 0){
                count++;
            }
        }
        return count;
    }
}
