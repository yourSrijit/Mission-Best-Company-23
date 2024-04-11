package TCS_NQT24.Ninja;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class EX11_findMeanMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        Arrays.sort(arr);


        float mean = sum / n;
        float median = 0;
        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {

            median = arr[n / 2] + arr[n / 2 - 1];
        }

        System.out.println("Mean is " + mean + " And median is " + median / 2.0);

    }
}

/*
You have a collection of unique items .Each with its own special number.Your challenge is to calculate two important values
        1.Mean : This is the average value of all the items
        2.Median: When you arrange the numbers in order .the median is the middle number.If there has two middle numbers the
         median will be the average of that two number;

 Example 1:
 Input: [5,2,8,10,3,6,1,7,4,9]
 Output: [5.5,5.5]
  */
