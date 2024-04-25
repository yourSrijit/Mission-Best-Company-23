package TCS_NQT24.Digital;


import java.util.*;

public class Q10_LongestSubstringWithoutRepeatingChar {
    public static int findMaxChar(String s) {
        String max = "", cur = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                cur = "";
            }
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            cur += s.charAt(i);
            if (max.length() < cur.length()) {
//                max = cur;
            }
        }
        return max.length();
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