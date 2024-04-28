package TCS_NQT24.StoryBasedQ;

import java.sql.SQLOutput;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = sc.nextInt();
                if (n >= 1 && n <= 100) {
                    arr[i][j] = n;
                }
            }
        }

        int avg[] = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                avg[j] += arr[i][j];
            }
            avg[j] = avg[j] / 3;
        }
        float max = 0;
        int tavg = 0;
        for (int i = 0; i < 3; i++) {
            if (max < avg[i]) {
                max = avg[i];
            }
            tavg += avg[i];
        }
        tavg = tavg / 3;
        if (tavg < 70) {
            System.out.println("All trainee are unfit");
        } else {
            for (int i = 0; i < 3; i++) {
                if (avg[i] == max) {
                    System.out.println("Trainee Number :" + (i + 1));
                }
            }
        }

    }
}
