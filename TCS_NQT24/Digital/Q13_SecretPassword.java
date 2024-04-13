package TCS_NQT24.Digital;

import java.util.Scanner;

public class Q13_SecretPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int sr = (int) Math.sqrt(n);
        int rem = 2 * (n - sr * sr);

    }
}

/*
Take a string from user
Find the length of the string
And make it perfect square or near to perfect square

Output is a matrix made by the String
 */
