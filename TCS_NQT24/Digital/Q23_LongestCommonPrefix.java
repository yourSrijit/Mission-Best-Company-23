package TCS_NQT24.Digital;

import java.util.*;

public class Q23_LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) != arr[arr.length - 1].charAt(i)) {
                break;
            }
            ans.append(arr[0].charAt(i));
        }

        System.out.println(ans);
    }
}
