package TCS_NQT24.Ninja;
import  java.util.*;

public class Ex8_PairCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<>();

        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%2==0){
                    if(!map.containsKey(arr[i])){
                        map.put(arr[i],arr[j]);
                    }

                }
            }
        }
        System.out.print(count);
    }
}
/*
CPP Solution ✅✅✅✅✅✅✅
#include <bits/stdc++.h>
using namespace std;
void countPair(int arr[],int n){
    int count=0;
    map<pair<int,int>,bool> map;
    for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                pair<int,int> p=make_pair(arr[i],arr[j]);
                if((arr[i]+arr[j])%2==0 && map[p]!=true){
                   count++;
                   map[p]=true;
                }
            }
        }
        cout<<count;
}
int main()
{

    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    countPair(arr,n);
    return 0;
}

 */

/*
Write a program to calculate the pairs count in the given array such that the sum of the pairs is divisible by 2
input:
A[]= {2,2,1,7,5,3}
output: 7
 */
