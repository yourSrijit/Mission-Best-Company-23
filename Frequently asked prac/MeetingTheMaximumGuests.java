
import java.util.Arrays;

public class MeetingTheMaximumGuests {
    public static int findMaxMeet(int ariv[],int dep[]){
        Arrays.sort(ariv);
        Arrays.sort(dep);
        int i=1,j=0,max=1,cur=1;
        while (i<ariv.length && j<ariv.length){
            if(ariv[i]<=dep[j]){
                cur++; j++;
            }
            else {
                cur--;j++;
            }
            max=Math.max(max,cur);
        }
        return max;
    }
    public static void main(String[] args) {
        int []arrival={900,600,700};
        int []dep={1000,800,730};
        int res=findMaxMeet(arrival,dep);
        System.out.println(" So maximum "+res+" can meet");
    }
}
