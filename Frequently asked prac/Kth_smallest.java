import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_smallest {
    public static int findKthLargest(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int arr[]={11,51,6,79,27,14,51,22,58,85,96,2,3,14,80,98,12};  //4th small =11

        int n=4;
        int ans=findKthLargest(arr,n);
        System.out.println(" so the "+n+" th smallest element is "+ans);
    }
}

