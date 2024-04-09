package TCS_NQT24.Ninja;

public class EX11 {

    public static void main(String[] args) {
        int arr[] = {4, 5, 0, 1, 9, 0, 5, 0};
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
            j++;
        }


        int z = arr.length - i;
        while (z > 0) {
            arr[i] = 0;
            i++;
            z--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}

/*
Send all the zeros at the end of the array
 */