import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest {
    public static int findKthLargest(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int arr[]={11,51,6,79,27,14,51,22,58,85,96,2,3,14,80,98,12};  //3th larg =85

       int n=4;
       int ans=findKthLargest(arr,n);
        System.out.println(" so the "+n+" th largest element is "+ans);
    }
}
