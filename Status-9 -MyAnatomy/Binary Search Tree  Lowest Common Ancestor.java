

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
{
    Node temp = root; // not necessary, just use root, just a leftover from a different attempt.
    
    while (true) {
        if (temp.data > v1 && temp.data > v2) {
            temp = temp.left;
            //System.out.println(temp.data);
        } else if (temp.data < v1 && temp.data < v2) {
            temp = temp.right;
            //System.out.println(temp.data);
        } else {
            //System.out.println(temp.data);
            return temp;
        }
    }
}




