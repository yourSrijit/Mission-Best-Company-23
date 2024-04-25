package TCS_NQT24.Digital;


import java.util.*;

public class Q10_LongestSubstringWithoutRepeatingChar {
    public static int findMaxChar(String s) {
        int left = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = findMaxChar(str);
        System.out.println(ans);

    }
}


/*
Longest Substring Without Repeating Character
Given a string s,Find the length of the longest substring without repeating character.

Example 1
input : s="abcabcbb"
output=3
Explanation: The answer is 'abc' with the length of 3
 */


/*
#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    map<char,int> map;
    int i=0,j=0;
    int ans=INT_MIN;

    while(j < s.size())
    {
        map[s[j]]++;

        if(map.size()==j-i+1){
            ans=max(ans,j-i+1);
        }
        else if(map.size() < j-i+1){
            while(map.size() < j-i+1){
                map[s[i]]--;
                if(map[s[i]] ==0){
                    map.erase(s[i]);
                }
                i++;
            }
        }
        j++;
    }

    cout<<ans<<endl;

    return 0;
}

 */