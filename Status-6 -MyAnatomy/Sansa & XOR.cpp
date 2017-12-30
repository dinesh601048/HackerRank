#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,k;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>k;
        int m;
        vector<int> arr(k);
        for(int i=0;i<k;i++) {
           cin>>arr[i];
       }
       if(k%2==0)   m=0;
       else{
          m=arr[0];
          for(int i=2;i<k;i+=2){
              m^=arr[i];
          }
     }
        cout<<m<<endl;
    }
    return 0;
}
