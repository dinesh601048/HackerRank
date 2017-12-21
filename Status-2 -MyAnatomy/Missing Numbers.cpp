// ==================================================
// Problem  :   Missing Numbers
// Score    :   45/45
// Language :   C++
// ==================================================

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector <int> a(n);
    for (int i=0;i<n;i++) 
        cin >> a[i];
    int m;
    cin >> m;
    vector <int> b(m);
    for (int i=0;i<m;i++) 
        cin >> b[i];
    // find min in b[]
    int min_in_b= *min_element(b.begin(),b.end());

    // find freq of b[] and store in bf[]
    vector <int> bf(101); // since Xmax - Xmin < 101
    for (int i=0;i<m;i++) 
        bf[b[i]-min_in_b]++;

    // find freq of a[] and store in af[]
    vector <int> af(101);
    for (int i=0;i<n;i++) 
        af[a[i]-min_in_b]++;

    // compare freq in af[] and bf[], if missing, they are different
    for (int i=0;i<101;i++) 
        if (af[i]!=bf[i]) 
            cout << i+min_in_b << " ";

return 0;
}