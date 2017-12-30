#include <bits/stdc++.h>

using namespace std;



int totnum(int X,int N,int num){
    if(pow(num,N)<X){
        //cout<<X<<" "<<N<<" "<<num+1<<"        "<<X-pow(num,N)<<" "<<N<<" "<<num+1<<endl;
        return totnum(X,N,num+1)+totnum(X-pow(num,N),N,num+1);
    }
    else if(pow(num,N)==X)
        return 1;
    else
        return 0;
}

int main() {
    int X,N;
    cin>>X>>N;
    cout<<totnum(X,N,1);
    return 0;
}
