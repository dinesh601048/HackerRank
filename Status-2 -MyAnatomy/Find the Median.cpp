
// ==================================================
// Problem  :   Find the Median
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
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int num;
    cin>>num;
    vector<int> a(num);
    for(int i=0;i<num;i++){
        cin>>a[i];
    }
    sort(a.begin(),a.end());
    cout<<a[num/2];
    return 0;
}
