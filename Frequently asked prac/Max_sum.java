// Given an array .Your task is to find the maximum of sum of the arrsy of the subarray and return the maximum sum :)
public class Max_sum {
    public static int findMaxSum(int arr[]){
        int maxsofar=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i< arr.length;i++){
            cur+=arr[i];
            maxsofar=Math.max(maxsofar,cur);
            if(cur<0){
                cur=0;
            }
        }
        return maxsofar;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,-5,6,4,-3,-4,2};
        System.out.println("Max sum is "+findMaxSum(arr));
    }
}


*Leetcode*
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int curSum = nums[0];
//         int maxSum = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             curSum = Math.max(nums[i], curSum + nums[i]);
//             maxSum = Math.max(maxSum, curSum);
//         }

//         return maxSum;
//     }
// }
