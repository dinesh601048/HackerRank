// ==================================================
// Problem  :   Counting Sort 1
// Score    :   30/30
// Language :   C++
// ==================================================

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int num;
    cin>>num;
    int* a=new int[100]();
    for(int i=0;i<num;i++){
        int element=0;
        cin>>element;
        a[element]++;
    }/* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    for(int j=0;j<100;j++){
        cout<<a[j]<<" ";
    }
    return 0;
}
