#include <bits/stdc++.h>

using namespace std;


int main() {
    string s;
    cin >> s;
    int len = s.size();
    int row= round(sqrt(len));
    //cout<<row<<endl;
    int column = (row>=sqrt(len))? row : row+1;
    //cout<<column<<endl;
    for(int i=0;i<column;i++){
        for(int j=i;j<len;j+=column)       cout<<s[j];
        cout<<" ";
    }
    return 0;
}
