#include <bits/stdc++.h>

using namespace std;

int findDigits(int n) {
    int num = n,count=0;
    while(num){
        int r;
        r = num%10;
        if(r!=0 && n%r==0 )      count++;
        num/=10;
    }
    return count;
}

int main() {
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        cin >> n;
        int result = findDigits(n);
        cout << result << endl;
    }
    return 0;
}
