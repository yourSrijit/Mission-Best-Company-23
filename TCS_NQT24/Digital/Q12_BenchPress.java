package TCS_NQT24.Digital;

public class Q12_BenchPress {
}
/*
C++ Solution
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here

    int t;
    cin>>t;
    while(t--){
        int n,w,r;
        cin>>n>>w>>r;

        vector<int> arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        sort(arr.begin(),arr.end());
        long long total=r;

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                total+= 2*arr[i];
                i++;
            }
        }
        if(total >= w ){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }

    }
}

 */



/*
https://www.codechef.com/problems/BENCHP
 */