package Deloitte;
//Arnab has given me a challenge. I have to calculate the number of numbers which are less than a certain value
//        n, and have exactly k set bits in its binary form. He want help to write a code that will take input for n and k and
//        give the expected output.
//        Constraints :
//        1<=n<=10000
//        1<=k<=10
//        Input Format: First line containing n and k space separated
//        Output Format: Number of numbers present in a single line
//        Sample Input:
//        72
//        Sample Output: 3
//        Explanation:
//        11,110,101 > These three numbers.
import java.util.Scanner;

public class Bit_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<k;i++){
            int bit=Integer.bitCount(i);
            if(bit==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
