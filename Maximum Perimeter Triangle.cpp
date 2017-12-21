
// ==================================================
// Problem  :   Maximum Perimeter Triangle
// Score    :   20/20
// Language :   C++
// ==================================================



#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isvalid(int a, int b, int c){
    return a+b>c;
}

bool compare(int i,int j){
    return i>j;
}

int main() {
    int n;
cin>>n;
vector<int> v(n);
for(int i = 0; i<n; ++i){
    cin>>v[i];
}
sort(v.begin(), v.end(), compare);
for(int i = 2; i<n; i++){
    if(isvalid(v[i], v[i-1], v[i-2])){
        cout<<v[i]<<" "<<v[i-1]<<" "<<v[i-2]<<endl;
        return 0;
    }
}
cout<<-1<<endl;
return 0;
}
