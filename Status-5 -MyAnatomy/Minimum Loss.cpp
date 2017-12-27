#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<bits/stdc++.h>
using namespace std;

class p{
    public:
        long long int value;
        int year;
        p(int year,long long int value){
            this->year=year;
            this->value=value;
        }
};

bool compare(p x, p y)
{
    return x.value < y.value;
}

int min(vector<p> a){
    long long int diff;
    long long int n=a.size();
    long long int min= INT_MAX;
    for(int i=0;i<n-1;i++){
        if(a[i].year>a[i+1].year){
            diff=a[i+1].value-a[i].value;
            if(diff<min)    min=diff;
        }
    }
    return min;
}

int main() {
    long long int n,value;
    cin>>n;
    vector<p> a;
    for(long int i=0;i<n;i++){
        cin>>value;
        int year=i;
        a.push_back(p(year,value));
    }
    sort(a.begin(),a.end(),compare);
    cout<<min(a)<<endl;
    return 0;
}
