#include<bits/stdc++.h>
using namespace std;


int main() {
    int t;
    cin>>t;
    while(t--){
    int n;
        cin>>n;
        n=n%7;
        if(n==0 || n==1)
            cout<<"Second\n";
        else cout<<"First\n";
        }
    return 0;
}