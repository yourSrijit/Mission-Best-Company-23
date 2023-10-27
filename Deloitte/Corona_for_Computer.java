package Deloitte;

//        Questioh 4: Corona for Computer
//        Every decimal number can be changed into its binary form. Suppose your computer has it's own CoronaVirus,
//        that eats binary digits from the right side of a number. suppose a virus has 6 spikes, it will eat up 6 LSB binary
//        digits in your numbers.
//        You will have a bunch of numbers, and your machine will have a virus with n spikes, you have to calculate wha
//        will be the final situation of the final numbers.
//        Input Format:
//        1+
//        First line, a single Integer N
//        Second line N space separated integers of the bunch of values as array V
//        Third line a single integer n, the number of spikes in Corona for Computer
//        3110
//        Output Format:
//        Single N space separated integers denoting the final situation with the array v.
//        5 digit
//        pon
//        Sample Input:
//        5
//        12345
//        2
//        Output:
//        0 0 0 1 1

import java.util.Scanner;

public class Corona_for_Computer {
//    public static int final(int num,int n){
//        return num >> n;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int ans[]=new int[N];
        for(int i=0;i<N;i++){
            ans[i]=arr[i]>>n;
        }
        for(int num:ans)
        {
            System.out.print(num+" ");
        }

    }
}
