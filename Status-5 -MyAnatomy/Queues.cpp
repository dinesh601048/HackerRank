#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    deque<int> a;
    long int n;
    cin>>n;
    while(n--){
        int c=0;
        cin>>c;
        switch(c){
            case 1:
                long int k;
                cin>>k;
                a.push_back(k);
                break;
            case 2:
                a.pop_front();
                break;
            case 3:
                cout<<a[0]<<endl;
                break;
            default:
                break;
        }
    }
    return 0;
}

