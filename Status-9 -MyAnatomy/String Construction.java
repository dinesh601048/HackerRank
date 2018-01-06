import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s) {
        int c=0;
        int[] a=new int[26];
        for(int i=0;i<s.length();i++)
            {
            ++a[s.charAt(i)-'a'];
        }
        for(int j=0;j<26;j++)
            {
            if(a[j]!=0)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
