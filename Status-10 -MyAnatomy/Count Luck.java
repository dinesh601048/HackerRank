#include <bits/stdc++.h>

using namespace std;

#include<bits/stdc++.h>
using namespace std;
char a[100][100];
int t,n,m,k,mx,my,v;
bool solve(int x,int y){
	if(a[x][y]=='*'){
      //cout<<"1*"<<" ";
	  return true;
    }
	if(a[x][y]=='X' || x==-1 || y==-1 || x==n || y==m)
    { 
        //cout<<"2*"<<" ";
        return false;
    }
	a[x][y]='X';
	bool s=(a[x-1][y]=='.')+(a[x+1][y]=='.')+(a[x][y-1]=='.')+(a[x][y+1]=='.')+(a[x-1][y]=='*')+(a[x+1][y]=='*')+
           (a[x][y-1]=='*')+(a[x][y+1]=='*')>1;
    //cout<<"s="<<s<<endl;
	bool r=solve(x-1,y)||solve(x+1,y)||
           solve(x,y-1)||solve(x,y+1);
	r && s ? v++ : v+=0;
    //cout<<"s="<<s<<" ";
    //cout<<"r="<<r<<endl;
    //cout<<v<<endl;
    
	return r;
}
int main(){
	cin>>t;
	while(t--){
	 v=0;
	 cin>>n>>m;
	 for(int i=0;i<n;i++)
	  for(int j=0;j<m;j++){
		cin>>a[i][j];
		if(a[i][j]=='M'){
		 mx=i;my=j;
		}
	}
	 cin>>k;
	 solve(mx,my);
	 v==k ? cout<<"Impressed"<<endl : cout<<"Oops!"<<endl;
	}
	return 0;
}
