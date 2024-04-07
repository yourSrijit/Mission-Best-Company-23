package TCS_NQT24.Ninja;
import  java.util.*;

public class Ex8_PairCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%2==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}

/*
Write a program to calculate the pairs count in the given array such that the sum of the pairs is divisible by 2
input:
A[]= {2,2,1,7,5,3}
output: 7
 */
