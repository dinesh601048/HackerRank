
// ==================================================
// Problem  :   Making Anagrams
// Score    :   30/30
// Language :   C++
// ==================================================



#include <bits/stdc++.h>

using namespace std;

int makingAnagrams(string s1, string s2){
    int s[26]={0};
    int sum=0;
    for(int i=0;i<s1.length();i++){
       s[s1[i]-'a']++; 
    }
    for(int i=0;i<s2.length();i++){
        s[s2[i]-'a']--;
    }
    for(int i=0;i<26;i++){
        sum += abs(s[i]);
    }
    return sum;// Complete this function
}

int main() {
    string s1;
    cin >> s1;
    string s2;
    cin >> s2;
    int result = makingAnagrams(s1, s2);
    cout << result << endl;
    return 0;
=======
// ==================================================
// Problem  :   Making Anagrams
// Score    :   15 /15
// Language :   C++
// ==================================================



#include <bits/stdc++.h>

using namespace std;

int makingAnagrams(string s1, string s2){
    int s[26]={0};
    int sum=0;
    for(int i=0;i<s1.length();i++){
       s[s1[i]-'a']++; 
    }
    for(int i=0;i<s2.length();i++){
        s[s2[i]-'a']--;
    }
    for(int i=0;i<26;i++){
        sum += abs(s[i]);
    }
    return sum;// Complete this function
}

int main() {
    string s1;
    cin >> s1;
    string s2;
    cin >> s2;
    int result = makingAnagrams(s1, s2);
    cout << result << endl;
    return 0;
>>>>>>> 9b7f3666ea92aebc19451542136c918b931974c3
}