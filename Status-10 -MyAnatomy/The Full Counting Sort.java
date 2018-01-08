import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder [] arr = new StringBuilder[100];
        for(int i=0;i<100;i++){
            arr[i]=new StringBuilder();
        }
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            String s = in.next();
            if(i<n/2)    s="- ";
            else    s= s+ " ";
            arr[x]=arr[x].append(s);
        }
        for(int i=0;i<100;i++){
            System.out.print(arr[i]);
        }
        in.close();
    }
}
