import java.util.*;
import java.io.*;
     
class Node{
    int value;
    int position;
    public Node(int v,int p){
    		value = v;
    		position = p;
    	}
    }
     
class Solution {
    public static void main(String args[] ) throws Exception {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int x = s.nextInt();
       Queue<Node> qu = new LinkedList<>();
       Queue<Node> qu1 = new LinkedList<>();
        	
       for(int i=0; i<n;i++){
        		Node temp = new Node(s.nextInt(),i+1);
        		qu.add(temp);
        	}
        	
       for(int i=0;i<x;i++){
        		Node max = null;
        		
        		for(int j=0;j<x;j++)
    			{
        			if(qu.isEmpty())    break;
        			Node temp = qu.remove();
    	            if( max == null || temp.value>max.value )
    				{
    					max = temp;
    				}
    			    qu1.add(temp);
    			}
    		
        		while(!qu1.isEmpty())
        		{
        			Node current = qu1.remove();
        			if(current!=max)
        			{
        				if(current.value!=0)
        					current.value--;
        				qu.add(current);
        			}
        		}

        		
        		System.out.print(max.position+" ");
        	}
        }
    }
