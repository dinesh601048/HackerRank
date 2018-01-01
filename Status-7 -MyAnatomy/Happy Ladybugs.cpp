#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,ch=1;
        string s;
        cin>>n>>s;
        int a[27]={0};
        for(int i=0;i<n;i++)
        {
            if(s[i]=='_')
                a[26]++;
            else
                a[s[i]-65]++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>0 && a[i]<2)
                ch=0;
            else if(a[26]==0 && s[0]!=s[1])
                ch=0;
        }
        if(ch==0)
            cout<<"NO"<<endl;
        if(ch==1)
            cout<<"YES"<<endl;
    }
    return 0;
}