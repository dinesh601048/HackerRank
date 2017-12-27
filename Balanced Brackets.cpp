#include <bits/stdc++.h>

using namespace std;

string isBalanced(string s) {
    stack<char> check;
    for(auto c:s){
        switch(c){
            case '{':
            case '[':
            case '(':
                check.push(c);
                break;
            case ')':
                if(check.empty() || (check.top()!='('))         return "NO";          
                check.pop();
                break;
            case ']':
                if(check.empty() || (check.top()!='['))         return "NO";
                check.pop();
                break;
            case '}':
                if(check.empty() || (check.top()!='{'))         return "NO";
                check.pop();
                break;
        }
    }
    return check.empty()?"YES":"NO";
}

int main() {
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        string s;
        cin >> s;
        string result = isBalanced(s);
        cout << result << endl;
    }
    return 0;
}
