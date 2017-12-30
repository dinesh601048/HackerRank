#include <bits/stdc++.h>

using namespace std;

long solve(long n) {
    int count=0;
    while(n!=0){
        if(!(n&1))   count++;
        n>>=1;
    }
    return count; 
}

int main() {
    long n;
    cin >> n;
    long result = solve(n);
    cout << (1L<<result) << endl;
    return 0;
}
