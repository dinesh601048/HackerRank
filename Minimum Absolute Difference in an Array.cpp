// ==================================================
// Problem  :   Minimum Absolute Difference in an Array
// Score    :   15/15
// Language :   C++
// ==================================================

#include <bits/stdc++.h>

using namespace std;

int minimumAbsoluteDifference(int n, vector <int> arr) {
    vector<int> a(n-1);
    sort(arr.begin(),arr.end());
    for(int i=0;i<arr.size()-1;i++){
        a[i]= abs(arr[i]-arr[i+1]);
    }
    return *min_element(a.begin(),a.end());
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0; arr_i < n; arr_i++){
       cin >> arr[arr_i];
    }
    int result = minimumAbsoluteDifference(n, arr);
    cout << result << endl;
    return 0;
}
