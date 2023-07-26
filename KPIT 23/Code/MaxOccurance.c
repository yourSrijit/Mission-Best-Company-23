You are given an array arr of size n and an integer k. Find and print the element of array arr which has the maximum occurrence of digit k

Note:

Print -1 if the array is empty.

Print 0 if there is no occurrence of digit k in the array.

. Only one number has the maximum occurrence of digit k

Input Format:

Each test case consists of three lines:

⚫ The first line contains an integer, L.e. k

. The second line contains an integer, l.e. n.

⚫The third line contains n integers separated by space, i.e. elements of arr

Input will be read from the STDIN by the candidate

Output Format:

The output contains a single integer, I.e. the element which has the maximum occurrence of digit k. The output will be matched to the candidate's output printed on the STDOUT
In c language 



#include <stdio.h>

int countOccurrences(int num, int k) {
    // Helper function to count occurrences of digit k in num
    int count = 0;
    while (num != 0) {
        if (num % 10 == k) {
            count++;
        }
        num /= 10;
    }
    return count;
}

int maxOccurrenceElement(int arr[], int n, int k) {
    if (n == 0) {
        return -1; // Array is empty
    }

    int maxOccurrence = 0;
    int maxOccurrenceElement = 0;

    for (int i = 0; i < n; i++) {
        int occurrence = countOccurrences(arr[i], k);
        if (occurrence > maxOccurrence) {
            maxOccurrence = occurrence;
            maxOccurrenceElement = arr[i];
        }
    }

    return (maxOccurrence > 0) ? maxOccurrenceElement : 0;
}

int main() {
    int k, n;
    printf("Enter the digit k: ");
    scanf("%d", &k);

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter the array elements separated by space: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int result = maxOccurrenceElement(arr, n, k);
    printf("%d\n", result);

    return 0;
}
