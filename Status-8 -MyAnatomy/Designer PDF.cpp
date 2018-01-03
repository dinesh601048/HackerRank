#include <bits/stdc++.h>

using namespace std;

int designerPdfViewer(vector <int> h, string word) {
    
    int i=0,max=0,temp=0;
    while(word[i]!='\0'){
        temp= h[(int)word[i]-97];
        if(temp>max)    max=temp;
        i++;
    }
    return max*word.length();
}

int main() {
    vector<int> h(26);
    for(int i = 0; i < 26; i++){
       cin >> h[i];
    }
    string word;
    cin >> word;
    int result = designerPdfViewer(h, word);
    cout << result << endl;
    return 0;
}
