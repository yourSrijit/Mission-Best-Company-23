#include <bits/stdc++.h>
using namespace std;

vector <int> findOccurance(string &str,char ch){
	int st=-1;
	int en=-1;
	for(int i=0;i<str.size();i++){
		if(str[i]==ch && st==-1){
			st=i;
		}
		if(str[i]==ch){
			en=i;
		}
		
	}
	vector<int> ans;
	ans.push_back(st);
	ans.push_back(en);
	return ans;
}

int main()
{
	string s;
	cin>>s;
	char a;;
	cin>>a;
	vector<int> ans=findOccurance(s,a);
	cout<<ans[0] <<" "<<ans[1]<<endl;
}