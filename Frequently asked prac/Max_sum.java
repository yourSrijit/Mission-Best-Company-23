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
