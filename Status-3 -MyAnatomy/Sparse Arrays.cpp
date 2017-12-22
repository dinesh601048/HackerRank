// ==================================================
// Problem  :   Sparse Arrays
// Score    :   25/25
// Language :   C++
// ==================================================


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;


int main() {
    
    int n;
    cin>>n;
    map<string,int> a;
    string str;
    for(int i=0;i<n;i++){
        cin>>str;
        a[str]++;
    }
    int q;
    cin>>q;
    for(int i=0;i<q;i++){
        cin>>str;
        cout<<a[str]<<endl;
    }
    return 0;
}
