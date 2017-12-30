#include <bits/stdc++.h>

using namespace std;

long theGreatXor(long x){
    long result = 0;
    int pos = 0;
    while(x) {
        if((x&1) == 0) {
            result += (1L<<pos);
        }
        pos++;
        x >>= 1;
    }
    return result;
}

int main() {
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        long x;
        cin >> x;
        long result = theGreatXor(x);
        cout << result << endl;
    }
    return 0;
}
