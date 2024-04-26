package TCS_NQT24.TCS_Asked2024;

public class Q3_Armstrong_Number {
    public static int q(int n) {
        return n * n * n;
    }

    static String armstrongNumber(int n) {
        // code here
        int p = n;
        int ans = 0;
        while (n > 0) {
            int r = n % 10;
            ans += q(r);
            n /= 10;
        }
        if (ans == p) {
            return new String("Yes");
        }
        return new String("No");
    }

    public static void main(String[] args) {


    }
}
