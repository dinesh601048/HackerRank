import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String gene = scan.next();
        
        int limiter = size/4;
        HashMap contents = new HashMap<Character, Integer>();
        contents.put('G', -1 * limiter);
        contents.put('A', -1 * limiter);
        contents.put('C', -1 * limiter);
        contents.put('T', -1 * limiter);
        //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T'));
        for(int i = 0; i < gene.length(); i++){
            contents.put(gene.charAt(i), (int)contents.get(gene.charAt(i)) + 1);
            //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T'));
            //System.out.println(gene.charAt(i) +" "+ ((int)contents.get(gene.charAt(i)) )+"\n");
        }
        //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T')+"\n");
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while(i < gene.length() && j < gene.length()){
            if(!validity(contents)){
                //System.out.println("j="+j);
                contents.put(gene.charAt(j), (int)contents.get(gene.charAt(j)) - 1);
                //System.out.println(gene.charAt(j) +" whileif "+ ((int)contents.get(gene.charAt(j)) ));
                //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T')+"\n");
                j++;
                
            }
            
            else{
                min = Math.min(min, j-i);
                //System.out.println("min = "+min+" j="+j);
                contents.put(gene.charAt(i), (int)contents.get(gene.charAt(i)) + 1);
                //System.out.println(gene.charAt(i) +" whileelse "+ ((int)contents.get(gene.charAt(i))));
                //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T')+"\n");
                i++;
            }
        }
        System.out.println(min);
    }
    
    public static boolean validity(HashMap contents){
        //System.out.println("G="+(int)contents.get('G')+" "+"A="+(int)contents.get('A')+" "+"C="+(int)contents.get('C')+" "+"T="+(int)contents.get('T'));
        return (int)contents.get('G') <= 0 && (int)contents.get('A') <= 0 && (int)contents.get('C') <= 0 && (int)contents.get('T') <= 0;
    }
}