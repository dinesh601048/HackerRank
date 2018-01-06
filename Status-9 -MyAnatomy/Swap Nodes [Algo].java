import java.io.*;
import java.util.*;

public class Solution {

    public static class Node{
        int index;
        Node left;
        Node right;
    } 
    
    public static Node Tree(int[][] nodes, Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        for(int i=0; i<nodes.length; i++){
            Node cur = queue.poll();
            int left = nodes[i][0];
            int right = nodes[i][1];
            
            if(left!=-1){
                Node l = new Node();
                l.index = left;
                cur.left = l;
                queue.offer(l);
            }
            if(right!=-1){
                Node r = new Node();
                r.index = right;
                cur.right = r;
                queue.offer(r);
            }
        }
        return root;
    }
    
    public static void swap(Node root, int k, int level){
        if(root==null)
            return;
        if(level==1){
            Node temp = root.right;
            root.right=root.left;
            root.left=temp;
            level=k;
        }
        else{
            level-- ;
        }
        swap(root.left, k, level);
        swap(root.right, k, level);
    }
    
    private static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.index+" ");
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node root = new Node();
        root.index = 1;
        int[][] nodes = new int[n][2];
        for(int i=0; i<n; i++){
            nodes[i][0] = scan.nextInt();
            nodes[i][1] = scan.nextInt();
        }
        root = Tree(nodes, root);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int k = scan.nextInt();
            swap(root, k, k);
            inorder(root);
            System.out.println();
        }
        scan.close();
    }
}