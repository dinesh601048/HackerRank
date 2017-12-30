#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    int max=0;
    int m=n;
    map<int,int>a;
    while(m--){
        int q;
        cin>>q;
        a[q]++;
        if(a[q]>max)    max=a[q];
        
    }
    cout<<n-max<<endl;
    return 0;
}
