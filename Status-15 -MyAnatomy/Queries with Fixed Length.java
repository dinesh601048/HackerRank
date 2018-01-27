#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<deque>
#include<queue>
using namespace std;


int main() {
   int n,q,i,k;
    cin>>n>>q;
    int a[n];
    for(i=0;i<n;i++)cin>>a[i];
    while(q--)
    {
        deque <int> s;
        cin>>k;
        int min=10000000;
        for(i=0;i<k;i++)
        {
            while(!s.empty()&&a[i]>a[s.back()])
                s.pop_back();
            s.push_back(i);
        }
        for(;i<n;i++)
        {
            if(min>a[s.front()])min=a[s.front()];
            while(!s.empty()&&s.front()<=i-k)
                s.pop_front();
             while(!s.empty()&&a[i]>a[s.back()])
                s.pop_back();
            s.push_back(i);
        }
        if(min>a[s.front()])min=a[s.front()];
        cout<<min<<"\n";
} /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
