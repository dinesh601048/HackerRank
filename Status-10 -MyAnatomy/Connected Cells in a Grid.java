import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int n,m,matrix[][];
    public static int cells(int i,int j) {
        if(((i<0 || j<0) || (i>=n || j>=m))  ||  matrix[i][j] == 0 || matrix[i][j] == -1 )
            return 0;
        matrix[i][j] = -1;
        return 1 + cells(i-1,i-1) + cells(i-1,j) + cells(i-1,j+1) + cells(i,j-1) + cells(i,j+1) + cells(i+1,j-1) + cells(i+1,j) + cells(i+1,j+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int result=0;
        matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 1)
                    result = Math.max(result,cells(i,j));
            }
        }
     /*   for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
     */
        System.out.print(result);
        in.close();
    }
}
