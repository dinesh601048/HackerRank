// ==================================================
// Problem  :   Caesar Cipher
// Score    :   15 /15
// Language :   C++
// ==================================================

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int l,shift;
    string s;
    char a;
    cin>>l;
    cin>>s;
    cin>>shift;
    for(int i=0;i<l;i++){
        if(isalpha(s[i])){
           a = isupper(s[i])? 'A': 'a';
           s[i] = a + (s[i]-a +shift)%26;
        }
    }
    cout<<s;
    return 0;
}
