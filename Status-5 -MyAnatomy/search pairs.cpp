#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;
/* Head ends here */


/* Tail starts here */
int main() {
    int res=0;
    int size,k;
    cin >> size>>k;
    vector<int> a;
    int item;
    for(int i=0; i<size; i++) {
        cin >> item;
        a.push_back(item);
    }
    sort(a.begin(),a.end());
    for(int i=0;i<size;i++){
            if(binary_search(a.begin(),a.end(),a[i]+k))      res++;
    }
    cout << res;
    
    return 0;
}
