You are given a number N, your task is to check whether the number is GOOGLY or NOT GOOGLY. A number is GOOGLY if the sum of digits of th

Input Format:

The input consists of a single line:

⚫ The first line contains an integer N.

Input will be read from the STDIN by the candidate

Output Format:

Print the string denoting whether the number is GOOGLY or NOT GOOGLY

The output will be matched to the candidate's output printed on the STDOUT

Constraints:

1≤NS 109

Example:

Input:

21

Output:

GOOGLY


#include <stdio.h>

int getDigitSum(int num) {
    // Helper function to calculate the sum of digits
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

char* isGooglyNumber(int N) {
    while (N >= 10) {
        N = getDigitSum(N);
    }

    return (N == 1 || N == 3 || N == 9) ? "GOOGLY" : "NOT GOOGLY";
}

int main() {
    int N;
    printf("Enter the number: ");
    scanf("%d", &N);

    char* result = isGooglyNumber(N);
    printf("%s\n", result);

    return 0;
}




