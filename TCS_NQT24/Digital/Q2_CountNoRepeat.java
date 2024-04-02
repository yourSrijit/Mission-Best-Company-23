package TCS_NQT24.Digital;

import java.util.*;
public class Q2_CountNoRepeat {
    public static boolean isUnique(int num,Set<Integer> set){
        while (num>0){
            int n=num%10;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            num/=10;
        }
        return  true;
    }

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();


        int count=0;
        for(int i=n1;i<=n2;i++){
            if(isUnique(i,set)){
                count ++;
            }
            set.clear();
        }
        System.out.println(count);

    }
}


/*

Problem Statement:
Given two integers n1 and n2, the task is to find the count of numbers between n1 and n2 (inclusive) such that each digit in the number occurs exactly once.

Example:
Consider n1 = 101 and n2 = 200.

For this example, the count of numbers between 101 and 200 (inclusive) where each digit occurs exactly once is to be found.
Example1:

Input:

11 — Vlaue of n1
15 — value of n2
Output:

4
Example 2:

Input:

101 — value of n1
200 — value of n2
Output:

72

 */