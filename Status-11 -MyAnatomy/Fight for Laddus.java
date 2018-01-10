 
    #include<bits/stdc++.h>
    using namespace std;
     
    int main()
    {
        int t;
        cin>>t;
        while(t--)
        {
            int n;
            cin>>n;
            int arr[n],hash[100001]={0};
            for(int i=0;i<n;i++)
            {
                cin>>arr[i];
                hash[arr[i]]++;
            }
            stack<int> st;
            st.push(0);
            int ans[n];
            for(int i=1;i<n;i++)
            {
                while(!st.empty()&&hash[arr[i]]>hash[arr[st.top()]])
                {
                    ans[st.top()]=arr[i];
                    st.pop();
                }
                st.push(i);
            }
            while(!st.empty())
            {
                ans[st.top()]=-1;
                st.pop();
            }
            for(int i=0;i<n;i++)
                cout<<ans[i]<<" ";
            cout<<endl;
        }
    }
 
Language: C++14