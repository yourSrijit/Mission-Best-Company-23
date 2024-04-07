package TCS_NQT24.Digital;

import  java.util.*;
public class Q7_CharOccurance {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int count=0;
        for(int i=0;i<s2.length();i++){
            count+=map.get(s2.charAt(i));
        }
        System.out.println(count);

    }
}

/*
You have given two string s1 and s2. Your task is to calculate the sum of the character occurrence
of the s2 in the string s1

Example
input:
s1= "helloworld"
s2= "do"
output: 2
 */
