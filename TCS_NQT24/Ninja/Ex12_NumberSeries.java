package TCS_NQT24.Ninja;

import java.util.*;

public class Ex12_NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n];
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i < n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 2] + 2;
            } else {
                dp[i] = dp[i - 1] / 2;
            }
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println(dp[n - 1]);
    }
}
/*
0 0 2 1 4 2 6 3 8 4 10 5 12 6 14
This is the number series given.
You have to take input the nth term and print the nth term
 */