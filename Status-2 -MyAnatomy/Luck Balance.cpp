// ==================================================
// Problem  :   Luck Balance
// Score    :   20/20
// Language :   C++
// ==================================================


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


struct lena
{
    int L;
    int T;
};
bool compensate(lena a,lena b)
{
    return a.L>b.L ;
}
int main() { 
  
    int N,k;
    cin>>N>>k;
    lena arr[N];
    int count=0;
    for(int i=0;i<N;i++)
    {
        int temp1,temp2;
        cin>>temp1>>temp2;
        arr[i].L=temp1;
        arr[i].T=temp2;
    }
    sort(arr,arr+N,compensate);
    int luck=0;
    int index = -1;
    for(int i=0;i<N;i++){
        if(arr[i].T == 1 &&  k!=0)
        {
            luck+=arr[i].L;
            index =i;
            k=k-1;
        }else if(arr[i].T == 0){
            luck+=arr[i].L;
        }
    }
   for(int i=index+1;i<N;i++){
        if(arr[i].T == 1){
            luck-=arr[i].L;
        }
    }
    cout<<luck<<endl;
    return 0;
}
