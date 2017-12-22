// ==================================================
// Problem  :   Left Rotation
// Score    :   20/20
// Language :   C++
// ==================================================


#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    int d;
    cin >> n >> d;
    vector<int> a(n);
    for(int i = 0; i < n; i++){
       cin >> a[i];
    }
    for(int i=0;i<n;i++){
        cout<<a[(i+n+d)%n]<<" ";
    }

    return 0;
}
