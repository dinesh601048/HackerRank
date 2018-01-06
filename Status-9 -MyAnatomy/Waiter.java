import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();     
        //int[] primes = getNPrimes(q); //Geerate q primes
        int[] primes = new int[q];
		BigInteger num = BigInteger.valueOf(0);
		for (int i =1;i<=q;i++) {
			num = num.nextProbablePrime();
			primes[i-1] = num.intValue();
		}
        
        Stack<Integer> A = new Stack<Integer>();        
        for(int i = 0; i < n; i++)
            A.push(in.nextInt());
        for(int i = 0; i < q; i++) {
            Stack<Integer> An = new Stack<Integer>();
            Stack<Integer> Bn = new Stack<Integer>();
            while(!A.isEmpty()) {
                int num1 = A.pop();
                if(num1 % primes[i] == 0) 
                    Bn.push(num1);
                else 
                    An.push(num1);
            }
            A = An;
            while(!Bn.isEmpty())
                System.out.println(Bn.pop());       
        }
        while(!A.isEmpty()) 
            System.out.println(A.pop());
    }

}
