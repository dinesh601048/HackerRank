// ==================================================
// Problem  :   Super-Reduced String
// Score    :   10 /10
// Language :   C++
// ==================================================

#include <bits/stdc++.h>

using namespace std;

string super_reduced_string(string s){
    for(int i=1;i<s.length();i++){
        if(s[i]==s[i-1]){
            s = s.substr(0,i-1)+s.substr(i+1);
            i=0;
        }
    }
    if(s.length()==0){
        return "Empty String";
    }
    else{
        return s;
    }// Complete this function
    
}

int main() {
    string s;
    cin >> s;
    string result = super_reduced_string(s);
    cout << result << endl;
    return 0;
}
