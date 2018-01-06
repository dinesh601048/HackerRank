/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    static ArrayList<Integer> a = new ArrayList<Integer>();
    boolean checkBST(Node root) {
        inOrder(root);
        for(int i = 1; i< a.size(); i++){
            if(a.get(i)<=a.get(i-1))
                return false;
        }
        return true;
     }
    
    void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        a.add(root.data);
        inOrder(root.right);
    }