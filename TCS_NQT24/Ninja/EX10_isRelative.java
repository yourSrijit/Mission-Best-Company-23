package TCS_NQT24.Ninja;

public class EX10_isRelative {
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static boolean isRelative(int num) {
        int sum = 0, temp = num;
        while (num > 0) {
            int n = num % 10;
            sum += factorial(n);
            num /= 10;
        }
        return (sum == temp);
    }


    public static void main(String[] args) {
        System.out.println(isRelative(14));
    }
}