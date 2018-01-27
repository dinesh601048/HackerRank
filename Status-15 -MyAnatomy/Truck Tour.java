#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int a[n],b[n];
    for(int i=0;i<n;i++){
        cin>>a[i]>>b[i];
    }
    int sum = 0,state = 0;
    for(int i=0;i<n;i++){
        if(sum<0){
            state = i;
            sum=0;
        }
        sum = sum + a[i] - b[i];  
    }
    cout<<state;
    return 0;
}