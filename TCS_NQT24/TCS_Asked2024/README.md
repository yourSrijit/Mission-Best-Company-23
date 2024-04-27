# All the code are present here

1. (https://youtu.be/IfOcCTwUqqQ?si=3XuhpM8v9p5WCpMM)
2. (https://youtu.be/kpYMXnf_Qv0?si=MXQ5yP4fzbv7m-WY)

## How to take inputs in c++ and java

```
#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<int> nums;
    int num;
    taking input without knowing the size 
    while(cin >> num){
        nums.push_back(num);
    }
    for(int in:nums){
        cout<<in<<endl;
    }
    
    2. Taking string 
    
    string s;
    getline(cin,s);
    cout<<s<<endl;
    
    3. Taking string and double by space  srijit 10.5
    string s;
    double d;
    cin>>s>>d;
    cout<<s<<" "<<d<<endl;
    
    4. Taking input with coma seperated string srijit,52.5
    string s;
    cin>>s;
    int index=0;
    while(s[index] != ','){
        index++;
    }
    string chars=s.substr(0,index);
    string numb=s.substr(index+1,s.size()-index+1);
    double val=stod(numb);
    
    cout<<chars<<endl;
    cout<<val+1<<endl;
   
}
```

```
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        while(sc.hasNext()){
            l.add(sc.nextInt());
        }
        
         while(sc.hasNextInt()){
            l.add(sc.nextInt());
        }
        
        
        Make 2 digit after decimel
        double d=3.14159*100;
        int v=(int)d;
        double c=v/100.00;
        System.out.print(c);
    }
}
```