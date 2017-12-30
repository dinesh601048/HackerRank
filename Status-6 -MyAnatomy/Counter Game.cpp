#include <bits/stdc++.h>

using namespace std;

#include<bits/stdc++.h>
using namespace std;
typedef unsigned long long ll;

int main()
{
    ll t;
    cin >> t;
    for(int i = 0;i<t;i++)
    {
        ll N,count = 0;
        cin >> N;
        N--;
        while(N!=0)
        {
            if(N%2)     count++; //cout<<N<<" ";
            N>>=1;
            //cout<<count<<" "<<N<<endl;
        }
        if(count%2)cout << "Louise" << endl;
        else cout << "Richard" << endl;
    }
    return 0;
}