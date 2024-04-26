package TCS_NQT24.Digital;

import java.util.*;

public class Q27_notPrasentSubtring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < s1.length(); i++) {
            if (!set.contains(s1.charAt(i))) {
                ans.append(s1.charAt(i));
            }
        }

        System.out.println(ans);

    }
}
