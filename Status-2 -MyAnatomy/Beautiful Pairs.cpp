// ==================================================
// Problem  :   Beautiful Pairs
// Score    :   30/30
// Language :   C++
// ==================================================


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin>>n;
    vector<int> a(n),b(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    for(int i=0;i<n;i++)
        cin>>b[i];
    sort(a.begin(),a.end());
    sort(b.begin(),b.end());
    int K=0;
    for(int i=0,j=0;i<n && j<n;)
       {
        if(a[i]==b[j])
            {
                K++;
                i++;
                j++;
        }
        else if(a[i]<b[j])       i++;
        else if(b[j]<a[i])       j++;
        }
     if(K==n)    K--;
     else        K++;
     cout<<K;
     return 0;
}
