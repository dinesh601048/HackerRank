// Finding the maximum element in a list of items with conditions


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<stack>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    stack<int> list;
    long int n;
    cin>>n;
    while(n--){
        int c=0;
        cin>>c;
        switch(c){
            case 1:
                long int k;
                cin>>k;
                list.push(max(k, list.size()>0?list.top():k));
                break;
            case 2:
                list.pop();
                break;
            case 3:
                cout<<list.top()<<endl;
                break;
            default:
                break;
        }
    }
    return 0;
}
