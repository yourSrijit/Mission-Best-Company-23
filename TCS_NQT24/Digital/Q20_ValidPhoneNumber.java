package TCS_NQT24.Digital;


import java.util.*;

public class Q20_ValidPhoneNumber {
    public static boolean isValid(String num) {
        if (num.length() != 10) {
            return false;
        }
        char[] arr = num.toCharArray();
        if (arr[0] == '0') {
            return false;
        }
        for (char n : arr) {
            if (!Character.isDigit(n)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        while (true) {
            String cur = sc.nextLine();
            if (cur.equals("q") || cur.equals("Q")) {
                break;
            }
            l.add(cur);
        }
        if (l.size() != 5) {
            System.out.println("INPUT LIMIT IS 5");
            System.exit(0);
        }
        int count = 0;
        for (String num : l) {
            if (!isValid(num)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
A string or character array containing mobile numbers.Verify these five mobile numbers and identify valid as well as invalid numbers.Any
Number id grater than 10 digit or any character is considered as invalid.
Write a code to find how many numbers are invalid and simply print this.
Directly accept the mobile numbers as input and enter "q" or "Q" to stop as taking input.

Input:
1236547890
123654789s
gh12365478
0123456987
4569871235
q

Output:3
 */