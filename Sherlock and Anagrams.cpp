// ==================================================
// Problem  :   Sherlock and Anagrams
// Score    :   30/30
// Language :   C++
// ==================================================



#include <bits/stdc++.h>

using namespace std;


int check_anagram(string a, string b)
{
   int first[26] = {0};

   if(a.length() != b.length() )
        return 0;
    int c=0;
    while (a[c] != '\0') {
        first[a[c]-'a']++;
        first[b[c]-'a']--;
        c++;
    }
    for (c = 0; c < 26; c++) {
       if (first[c]!=0)
          return 0;
    }
    return 1;
    
}

int main() {
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        string s;
        cin >> s;
        int count=0;
        for(int i=1;i<=s.length();i++){ 
            vector <string> str;
            for(int j=0;j+i<=s.length();j++){                
                str.push_back(s.substr(j,i));// pushing the sub string of length i  
            }
          
            for(int p=0;p<str.size();p++){
                for(int q=p+1;q<str.size();q++){
                    if(check_anagram(str[p],str[q]))  count++;
                }
            }
        }
       cout << count << endl;
    }
    return 0;
}





