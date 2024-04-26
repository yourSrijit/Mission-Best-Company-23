package TCS_NQT24.Digital;


import java.util.*;

public class Q25_rankOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sorted[] = arr.clone();
        Arrays.sort(sorted);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank);
                rank++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(map.get(arr[i]));
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}