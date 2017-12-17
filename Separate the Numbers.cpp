// ==================================================
// Problem  :   Separate the Numbers
// Score    :   15 /15
// Language :   C++
// ==================================================


#include <bits/stdc++.h>

using namespace std;

int main(){
    int q;
    cin >> q;
    for(int a0 = 0; a0 < q; a0++){
        string s;
        cin >> s;
        string x;
        string test;
        long z=0;
        long w;
        bool result =false;
        for(int i=1;i<=s.length()/2;i++){
            string x = s.substr(0,i);    //cout<<x<<endl;
            stringstream y(x);
            y>>z;
            w=z;
            test = x;
            //cout<<z<<endl;
            while(test.length()<s.length()){
               
                test = test + to_string(++w);
            }
            if(s.compare(test)==0){
              result = true;
                break;
            }
             //cout<<test;
            
        // your code goes here
        }
        //cout<<z;
        if(result){
            cout<<"YES "<<z<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
      
    }
    return 0;
}
