package TCS_NQT24.Digital;

import java.util.Scanner;

public class Q1_RotateArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []temp=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();


        //Solution
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered.

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30
 */