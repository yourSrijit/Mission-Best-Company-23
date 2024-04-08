package TCS_NQT24.Digital;

import java.util.*;

public class Q9_findUncommonChar {
    public static void findCommonOccurrence(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        for (Character ch : set2) {
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                set.remove(ch);
            }
        }
        ArrayList<Character> list = new ArrayList<>(set);
        Collections.sort(list);
        for (Character s : list) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        findCommonOccurrence(s1, s2);
    }
}
/*
Given two string S1 and S2 of lowercase alphabets,find the list of
uncommon character for the two string
A CHARACTER IS UNCOMMON IF IT IS ONLY PRESENT IN A ONE STRING.It is either present in S1 or S2, but
not in both

Return the uncommon character in sorted order and can not contain duplicates
Example
S1=digital S2=ninja
dgjlnt
 */
