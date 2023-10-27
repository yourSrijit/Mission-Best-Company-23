package Deloitte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D_3 {
    public static int findSum(int num){
        ArrayList<Integer> arr=new ArrayList<>();
        while(num>0){
            int n=num%10;
            num/=10;
            arr.add(n);
        }
        Collections.sort(arr);
        int sum=0;
        for(int i=1;i<arr.size()-1;i++){
            sum+=arr.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += findSum(arr[i]);
        }
        System.out.println(sum);
    }
}
