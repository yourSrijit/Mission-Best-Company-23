package TCS_NQT24.Digital;

import java.util.Scanner;

public class Q6_2DProblem {
    public  static int findMaxOne(int [][]arr,int n,int m){
        int max=Integer.MIN_VALUE,index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
               if(arr[i][j]==1){
                   count++;
                }
            }

            if(max<count){
                max=count;
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(findMaxOne(arr,n,m)+" Answer");

    }
}

/*
Given a 2D array of n*m, consisting of 1's and 0's.Your mission is to find the row number with consisting the maximum number of
1's
Example:
N=4,M=4
arr[][]={{0,1,1,1},
         {0,1,0,1},
         {0,0,0,0},
         {1,1,1,1}
}
 */
