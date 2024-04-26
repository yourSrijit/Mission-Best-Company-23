package TCS_NQT24.Day1_Slot1;

import java.util.*;

public class Q2 {
    public static int noOfWay(int[][] arr, int i, int j) {
        if (i >= arr.length || j >= arr[0].length) {
            return 0;
        }
        if (arr[i][j] == 1) {
            return 0;
        }
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return 1;
        }
        return noOfWay(arr, i + 1, j) + noOfWay(arr, i, j + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int p = sc.nextInt();
        int q = sc.nextInt();
        arr[p][q] = 1;
        System.out.println(noOfWay(arr, 0, 0));

    }
}
