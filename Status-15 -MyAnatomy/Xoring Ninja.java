import java.io.*;
import java.util.*;

public class Solution{

    
  public static long power(int n){
      long ans=1;
        for(int i=0;i<n;i++){
            ans=(ans*2)%1000000007;
        }return ans;
    }
    
public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int  t = sc.nextInt();
    int n;
    long a, ans, m;
    while(t>0)
        {
        t--;
        ans = 0;
        n = sc.nextInt();
        //m = (long)Math.pow(2,n-1);
        m = power(n-1);

        for(int i=0; i<n; i++)
            {
               ans = (ans | sc.nextLong()); 
        }
        ans = (ans*m)%1000000007;

        System.out.println(""+ans);
    }


}
}