// ==================================================
// Problem  :   Closet Numbers
// Score    :   35/35
// Language :   C++
// ==================================================

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool ascen(int i,int j){
    return i<j;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int> a(n);
    vector<int> b(n-1);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a.begin(),a.end(),ascen);
   // cout<<"\n";
    for(int i=0;i<n-1;i++){
        b[i]=a[i+1]-a[i];
        //cout<<b[i]<<" ";
    }
    int smallest = b[0];
    int index=0;
    for (int i = 0; i < n-1; i++) {
    if (b[i] < smallest) {
        smallest = b[i];
        index=i;
    }
}
    for(int i=0;i<n-1;i++){
        if(b[i]==smallest){
            cout<<a[i]<<" "<<a[i+1]<<" ";
        }
    }
    
    return 0;
}
