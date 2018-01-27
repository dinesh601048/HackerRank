import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int k = 0; k < q; k++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int x = 1; // indicate number of pieces horizontally
            int y = 1;  // indicate number of pieces vertically
            
            ArrayList<Long> cy = new ArrayList<Long>();
            for(int i = 0; i < m - 1; i++) {
                cy.add(sc.nextLong());
            }
            
            ArrayList<Long> cx = new ArrayList<Long>();
            for(int i = 0; i < n - 1; i++) {
                cx.add(sc.nextLong());
            }

            Collections.sort(cy, Collections.reverseOrder());
            Collections.sort(cx, Collections.reverseOrder());

            // cut: most expensive = cut first
            int index_x = 0;
            int index_y = 0;
            long totalCost = 0;

            while(!(x == n && y == m)) {
                if(x < n && y < m) {
                    // compare cost to decide whether cut horizontally or vertically
                    if(cy.get(index_y) >= cx.get(index_x)) {
                        totalCost += cy.get(index_y) * x;
                        y++;
                        index_y++;
                    } else if(cy.get(index_y) < cx.get(index_x)) {
                        totalCost += cx.get(index_x) * y;
                        x++;
                        index_x++;   
                    }
                } else if(x == n && y < m) {
                    totalCost += cy.get(index_y) * x;
                    index_y++;
                    y++;
                } else if(x < n && y == m) {
                    totalCost += cx.get(index_x) * y;
                    index_x++;
                    x++;
                }
            }

            totalCost = totalCost % (1000000007);
            System.out.println(totalCost );
        }
    }

}