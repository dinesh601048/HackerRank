import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int maxRegion = 0;
    
    public static int getMax(int[][] grid, int i, int j) {
        int currentMaxSize = 0;
        if (grid[i][j] == 1) {
            grid[i][j] = 0; 
            currentMaxSize++;
            for (int row=i-1; row<=i+1; row++) {
                for (int column=j-1; column<=j+1; column++) {
                    if (row>=0 && row<grid.length && column>=0 && column<grid[row].length) {
                        currentMaxSize += getMax(grid, row, column);     
                    }
                }
            }
        }
        return currentMaxSize;
    }
    
    public static int getBiggestRegion(int[][] grid) {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                int currentMax = getMax(grid, i, j);
                maxRegion = Math.max(maxRegion, currentMax);
            }
        }
        return maxRegion;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
