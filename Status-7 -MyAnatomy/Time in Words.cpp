#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int h;
    cin >> h;
    int m;
    cin >> m;
    vector<string> nums = {
        "", 
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"
    };
 int sub = 60-m;
 if(sub==60)
 {
     cout << nums[h] << " o' clock";
 }
  if(m==1)
  {
      cout << nums[m] << " minute past " << nums[h];
  }
  if((m>1&&m<20)&&m%15!=0)
  {
      cout << nums[m] << " minutes past " << nums[h];
  }
if(m>=20&&m<30)
  {
      cout << nums[m] << " minutes past " << nums[h];
  }

  if(m==15)
  {
      cout << "quarter past " << nums[h];
  }
   if(m%15==0&&m==30)
  {
      cout << "half past " << nums[h];
  }


  if((sub>1&&sub<=20)&&m%15!=0)
  {

      cout << nums[sub] << " minutes to " << nums[h+1];
  }
  if((sub>20&&m%15!=0)&&m>30)
  {
       cout << nums[sub] << " minutes to " << nums[h+1];
  }
   if(m%15==0&&m==45)
  {
      cout << "quarter to " << nums[h+1];
  }

return 0;
}
   
