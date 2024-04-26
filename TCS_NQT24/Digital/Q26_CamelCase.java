package TCS_NQT24.Digital;

import java.util.*;

public class Q26_CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder(" ");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans.append(" ");
            }
            ans.append(Character.toLowerCase(str.charAt(i)));
        }

        System.out.println(ans.toString().trim());
    }
}
