import java.io.*;
import java.util.*;

public class Solution {
    static int[][] adj;
    static int[][] query;
    static int n;
    static int max = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,r;
        n = sc.nextInt();
        int m = sc.nextInt();
        adj = new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                                    if(i!=j)
                                        adj[i][j]=max;
                                  }
        }
        for(int i=0;i<m;i++){
            a = sc.nextInt();
            b= sc.nextInt();
            r= sc.nextInt();
            adj[a][b]= r;
        }
        
      /*   for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                                    System.out.print(adj[i][j]+" ");
                                  }System.out.println();
        }
        */
        
        int q= sc.nextInt();
        //System.out.println(q);
        query = new int[2][q];
        int x,y;
        for(int i=0;i<q;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            query[0][i]=x;
            query[1][i]=y;
            //System.out.println(x+" "+y);
            //System.out.println(query[0][i]+" "+query[1][i]);
        }
       
       Floyd_warshal_algo();
        
       for(int k = 0; k < q; k++) {
            int ans = adj[query[0][k]][query[1][k]];
            if(ans==max)
                ans = -1;
            System.out.println(ans);
            
        }
      
        
    }
    
    public static void Floyd_warshal_algo(){
        for(int k=1;k<n+1;k++){
            for(int i=1;i<n+1;i++){
                for(int j=1;j<n+1;j++){
                    if(adj[i][j]>adj[i][k]+adj[k][j]){
                        adj[i][j]= adj[i][k]+adj[k][j];
                    }
                   // System.out.print(adj[i][j]+" ");
                }
            }
        }
    }
}