
//Maximizing XOR Bit Manipulation


#include <bits/stdc++.h>

using namespace std;


int main() {
    int l;
    cin >> l;
    int r;
    cin >>r;
    int k=0;
    int result;
    for(int i=l;i<=r;i++){
        for(int j=i;j<=r;j++){
            k=i^j;
            result= k>result?k:result;
            
        }
    }
    cout << result << endl;
    return 0;
}
