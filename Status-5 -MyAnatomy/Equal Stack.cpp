#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

unsigned long long int max(unsigned long long int a,unsigned long long int b,unsigned long long int c){
    if(a>=b && a>=c)  return a;
    else if(b>=a && b>=c)  return b;
    else if(c>=a && c>=b)  return c;
    else    return 0;
}

int main(){
    long int n1, n2, n3;
    cin >> n1 >> n2 >> n3;
    vector<int> h1(n1);
    vector<int> h2(n2);
    vector<int> h3(n3);
    unsigned long long int sum1=0,sum2=0,sum3=0;
    for(long int h1_i = 0;h1_i < n1;h1_i++){
       cin >> h1[h1_i];
       sum1+=h1[h1_i];
    }
    for(long int h2_i = 0;h2_i < n2;h2_i++){
       cin >> h2[h2_i];
       sum2+=h2[h2_i];
    }
    for(long int h3_i = 0;h3_i < n3;h3_i++){
       cin >> h3[h3_i];
       sum3+=h3[h3_i];
    }
    long int top1=0,top2=0,top3=0;
    while(sum1!=sum2 || sum1!=sum3){
        if(max(sum1,sum2,sum3)==sum1){
            sum1-=h1[top1];
            top1++;
            if(top1>n1)     {cout<<0; return 0;}
        }
        else if(max(sum1,sum2,sum3)==sum2){
            sum2-=h2[top2];
            top2++;
            if(top2>n2)     {cout<<0; return 0;}
        }
        else{
            sum3-=h3[top3];
            top3++;
            if(top3>n3)     {cout<<0; return 0;}
        }
    }
    cout<<sum1;
    return 0;
}
