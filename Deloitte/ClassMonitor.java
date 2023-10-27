package Deloitte;

import java.util.Scanner;

//After JEE Mains, some students got admission into an engineering college. Now there is a class consisting of
//        such n students, and the HOD came to say it is time to select the class monitor. But He never gets all of them a
//        one time. So he brought a register, every time he gets someone with less rank than the previous time he cut the
//        name and wrote the name of the student and the rank.
//        For a given number of ranks he gets each time, you have to predict how many names are cut in the list.4
//        Constraints:
//        Number of Visiting<=10^9
//        ranks <=10000
public class ClassMonitor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int max=Integer.MAX_VALUE,ans=-1;
        for(long i=0;i<n;i++){
            int rank=sc.nextInt();
            if(rank<max){
                max=rank;
                ans++;
            }
        }
        System.out.println(ans);

    }
}
