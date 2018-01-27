import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
		while(q-->0){
			int n, m;
			n = in.nextInt();
			m = in.nextInt();
			HashMap<Integer, HashSet<Integer>> g = new HashMap<>(n);
			for(int i=0; i<n; i++){
				g.put(i,  new HashSet<Integer>());
			}
			for(int i=0; i<m; i++){
				int p = in.nextInt()-1;
				int r = in.nextInt()-1;
				g.get(p).add(r);
				g.get(r).add(p);
				
			}
			
			int s = in.nextInt()-1;
			Queue<Integer> queue = new LinkedList<>();
			long[] dist = new long[n];
			Arrays.fill(dist, -1);
			dist[s]=0;
			queue.add(s);
			boolean[] mark = new boolean[n];
			mark[s]=true;
			
			while(!queue.isEmpty()){
				int u = queue.poll();
				
				for(int v: g.get(u)){
					if (!mark[v]){
						mark[v]=true;
						queue.add(v);
						dist[v]=dist[u]+1;
					}
				}
			}
			
			for(int i=0; i<n; i++){
				if (i==s) continue;
				System.out.print((mark[i]?6*dist[i]:-1)+" ");
			}
			System.out.println();
			
		}
    }

}