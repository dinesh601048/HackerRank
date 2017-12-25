//The tree node has data, left child and right child 

class Node {
    int data;
    Node* left;
    Node* right;
};


int height(Node* root) {
        // Write your code here.
        if(root->left==NULL && root->right==NULL)   
            return 0;
        int l=0,r=0;
        if(root->left)  
            l=height(root->left);
        if(root->right)  
            l=height(root->right);
        return 1+max(l,r);
    }