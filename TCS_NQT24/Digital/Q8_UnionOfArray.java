package TCS_NQT24.Digital;

import java.util.*;

public class Q8_UnionOfArray {
    public static int[] createUnion(int arr1[],int arr2[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int ans[]=new int[set.size()];
        int j=0;
        for(int num:set){
            ans[j]=num;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i]=sc.nextInt();
        }

        int ans[]=createUnion(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

/*
Given two sorted arrays arr1 and arr2 of size n and m.Find the union of two sorted arrays.
The union of the array should be in ascending order.
Example
input:
arr1=[1,2,3,4,6]
arr2=[2,3,5]

output: [1,2,3,4,5,6]
 */