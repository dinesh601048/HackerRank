// ==================================================
// Problem  :   Fraudulent Activity Notifications
// Score    :   40/40
// Language :   C++
// ==================================================

#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, d;
    cin >> n >> d;
    vector<int> nums (n,0);
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }
    
    deque<int> win(nums.begin(), nums.begin()+d);
    sort (win.begin(), win.end());
    int alerts = 0;
    
    for (int i=d; i < n; i++) {
        double median;
        if (d%2!=0) {
            median = win[win.size()/2];
        } else {
            median = (win[(win.size()/2)-1] + win[win.size()/2])/2.0f;
        }
        if (nums[i] >= 2.0f*median) {
            alerts++;
        }
        auto old = lower_bound (win.begin(), win.end(), nums[i-d]);
        win.erase(old);
        auto cur = upper_bound (win.begin(), win.end(), nums[i]);
        win.insert (cur, nums[i]);
    }
    
    cout << alerts << endl;
    
    return 0;
}