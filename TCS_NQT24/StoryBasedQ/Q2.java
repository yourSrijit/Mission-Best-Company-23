package TCS_NQT24.StoryBasedQ;

import java.text.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int ex = sc.nextInt();
        float a[] = new float[in];
        float b[] = new float[ex];
        for (int i = 0; i < in; i++) {
            a[i] = sc.nextFloat();
        }
        for (int i = 0; i < ex; i++) {
            b[i] = sc.nextFloat();
        }
        float ans = 0.0F;

        for (int i = 0; i < in; i++) {
            if (a[i] != 0) {
                ans += (a[i] * 18);
            }
        }
        for (int i = 0; i < ex; i++) {
            if (b[i] != 0) {
                ans += (b[i] * 12);
            }
        }

        System.out.println("Total estimated Cost:" + d.format(ans) + " INR");
    }
}
