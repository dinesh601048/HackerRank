// ==================================================
// Problem  :   Grid Challenge
// Score    :   20/20
// Language :   C++
// ==================================================

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        vector<string> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
            sort(a[i].begin(),a[i].end());
        }
        int flag=0;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n;j++)
                if(a[i][j]>a[i+1][j])
                    flag=1;
        (flag)?cout<<"NO"<<endl : cout<<"YES"<<endl;
    }
    return 0;
}
