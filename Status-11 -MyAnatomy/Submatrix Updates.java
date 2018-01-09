import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuffer sbr = new StringBuffer();
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        int[][] a = new int[n][m];
        int r,c,s,d;
        
        for (int i = 0; i < n; i++) {
             str=new StringTokenizer(br.readLine());
             for (int j = 0; j < m; j++) {
                 a[i][j]= Integer.parseInt(str.nextToken());
             }
        
        }
        
        for (int i = 0; i < k; i++) {
                str=new StringTokenizer(br.readLine());
                r= Integer.parseInt(str.nextToken())-1;
                c= Integer.parseInt(str.nextToken())-1;
                s= Integer.parseInt(str.nextToken())-1;
                d= Integer.parseInt(str.nextToken());
                
                for(int j=r;j<=r+s;j++)
                for(int x=c;x<=c+s;x++)
                {
                    a[j][x]+=d;
                }
                
          }
           for (int i = 0; i < n; i++) {
                for (int j =0; j < m; j++) {
                      sbr.append(a[i][j]+" ");
                }
                 sbr.append("\n");
           }
        
        System.out.println(sbr);
 
    }
}
Language: Java 8