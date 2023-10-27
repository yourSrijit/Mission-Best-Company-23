package Deloitte;

import java.util.Scanner;

public class D_4_StringToDesimal {
    public static boolean isVowel(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u' ){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        char arr[]=s.toCharArray();
        double ans=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(arr[i])){
                l--;
            }else {
                ans+=Math.pow(2,l-1);
                l--;
            }
        }

        System.out.println((int)ans);
    }
}
