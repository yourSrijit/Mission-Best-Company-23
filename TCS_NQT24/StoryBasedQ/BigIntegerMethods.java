package TCS_NQT24.StoryBasedQ;

import java.math.*;

public class BigIntegerMethods {
    public static void main(String[] args) {
        int n = 100;
        BigInteger A = BigInteger.valueOf(n);
        BigInteger B = BigInteger.valueOf(50);
        //addition
        BigInteger C = A.add(B);  // multiply

        //BigInt to int float
        /*
        int x=A.intValue();
        longValue()
         */
        BigInteger fact = BigInteger.ONE;
        for (int i = 5; i > 0; i--) {
            BigInteger X = BigInteger.valueOf(i);
            fact = fact.multiply(X);
        }
        System.out.println(fact);

    }
}
