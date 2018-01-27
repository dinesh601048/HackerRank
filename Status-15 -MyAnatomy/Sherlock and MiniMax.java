import java.io.*;
import java.util.*;

public class Solution {

    private static int minVal(int[] A, int N, int P, int Q)
	{
		List<Integer> list = new ArrayList<Integer>();
		/*
        while(P<=Q){
            list.add(P++);
        }
        */
		for(int i = 0; i + 1 < N; i++)
		{
			if((A[i] + A[i+1]) % 2 == 0)
				list.add((A[i] + A[i+1]) / 2);
			else
			{
				list.add((A[i] + A[i+1]) / 2);
				list.add((A[i] + A[i+1]) / 2 + 1);
			}
		}
		list.add(P);
		list.add(Q);
		
		Collections.sort(list);
		long diff = -1;
		int M = -1;
		
		for(int i : list)
                if(i >= P && i <= Q){
			         long min = Long.MAX_VALUE;
				     for(int j : A)
					       min = Math.min(min, Math.abs(i - j));
				     if(min > diff)
				        {
					       diff = min;
					       M = i; 
				        }
			
                }
		return M;
	}
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = in.nextInt();
		int P = in.nextInt();
		int Q = in.nextInt();
		in.close();
		
		Arrays.sort(A);
		System.out.println(minVal(A, N, P, Q));
    }
}