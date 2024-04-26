package TCS_NQT24.AdvancedMATRIX;

import java.util.*;

public class Q1_PeekElement {
    public static boolean isLucky(int[][] arr, int i, int j, int cur) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) {
            return true;
        }
        if (cur > arr[i][j]) {
            return true;
        } else if (cur <= arr[i][j]) {
            return false;
        }
        return isLucky(arr, i - 1, j, cur) && isLucky(arr, i + 1, j, cur) && isLucky(arr, i, j + 1, cur) && isLucky(arr, i, j - 1, cur);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isLucky(arr, i, j, arr[i][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}
/*
Given a 2D Array/Matrix the task is to find peak element
An element is a peak element if it is a greater than or equal to its four neighbour left right top and bottom
A peak element is not necessarily the maximum element
More than one such element can exists
 */
