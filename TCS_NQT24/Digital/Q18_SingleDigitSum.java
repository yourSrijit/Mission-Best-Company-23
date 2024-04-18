package TCS_NQT24.Digital;

import java.util.*;

public class Q18_SingleDigitSum {
    public static int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int single(int n) {
        while (n > 9) {
            n = Sum(n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        if (R == 0) {
            System.out.println(0);
            return;
        } else {
            int sum = Sum(N);
            int p = sum * R;
            int ans = single(p);
            System.out.println(ans);
        }

    }
}

/*
An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious
method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded
that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also
a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by
repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’.
Example 1:
Input :
99 -> Value of N
3 -> Value of R
Output :
9 -> Possible ways to fill the cistern.
Explanation:
Here, the number N=99
1. Sum of the digits N: 9+9 = 18
2. Repeat step 2 ‘R’ times i.e. 3 times (9+9)+(9+9)+(9+9) = 18+18+18 =54
3. Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.

 */