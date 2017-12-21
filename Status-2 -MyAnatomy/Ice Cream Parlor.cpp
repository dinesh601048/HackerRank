// ==================================================
// Problem  :   Ice Cream Parlor
// Score    :   30/30
// Language :   C++
// ==================================================


#include <bits/stdc++.h>
using namespace std;
int main() {
  int t;
  cin>>t;
  for(int z=1;z<=t;z++)
        {
            int sum=0;
            int n;
            cin>>sum>>n;
            vector<int> a(n);
            for(int i=0;i<n;i++)
            {
               cin>>a[i];
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=i;j<n-1;j++)
                {
                    if(a[i]+a[j+1]==sum)
                    {
                        cout<<i+1<<" "<<j+2<<endl;
                    }
                }
            }
  }
    return 0;
}