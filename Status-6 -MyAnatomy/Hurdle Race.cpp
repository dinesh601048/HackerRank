#include <bits/stdc++.h>

using namespace std;

int hurdleRace(int k, vector <int> height) {
   
    int count = *max_element(height.begin(),height.end());
    return count;
}

int main() {
    int n;
    int k;
    cin >> n >> k;
    vector<int> height(n);
    for(int i = 0; i < n; i++){
       cin >> height[i];
    }
    int result = hurdleRace(k, height);
    if(result>k)
           cout << (result-k) << endl;
    
    else        cout<<"0"<<endl;
    return 0;
}
