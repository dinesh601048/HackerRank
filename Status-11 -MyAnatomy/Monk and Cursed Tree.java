    import java.util.*;
    class Tree{
        Tree left;
        Tree right;
        int data;
        Tree(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    
    class TestClass{
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            int n= in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
                }
            int x = in.nextInt();
            int y = in.nextInt();
            
            Tree r =  FormBST(a, n);
            
            int max = Solve(r, x,y);
            System.out.print(max);
        }
        
        static Tree FormBST(int[] a, int n){
            Tree root = new Tree(a[0]);
            for(int i=1;i<n;i++){
                Tree current = root, prev = null;
                while(current!=null){
                     prev = current;
                     if(a[i]<=current.data)
                            current = current.left;
                     else
                            current = current.right;
                }
            
                if(a[i]<= prev.data)
                    prev.left = new Tree(a[i]);
                else
                    prev.right = new Tree(a[i]);
            }
            return root;
        }
        
        static int Solve(Tree root, int x, int y){
        int max;
        while(root!=null){
            if((x <= root.data && y > root.data) || (x > root.data && y<= root.data)){
                // opposite subtrees
                max = root.data;
                int data = x>y?x:y;
                Tree current = root.right;
                while(current != null){
                    if(current.data>max)
                    max = current.data;
                    
                    if(data<=current.data)
                    current = current.left;
                    
                    else if(data>current.data)
                    current = current.right;
                    
                    else
                    break;
                }
                return max;
            }
            else if(x<root.data && y == root.data)
            return root.data;
            else if((x<root.data && y<root.data) || (x>root.data && y>root.data)){
                // same subtrees
                root = x>root.data?root.right:root.left;
            }
        }
        return -1;
        }
    }