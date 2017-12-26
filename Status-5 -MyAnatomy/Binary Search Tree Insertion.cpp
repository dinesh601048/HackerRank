//Binary Search Tree Insertion

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;


node * insert(node * root, int value) {
   
    if(root==NULL){
        node* temp =new node();
        temp->data = value;
        temp->left = NULL;
        temp->right = NULL;
        root = temp;
        return root;
    }
    if(root->data>value)
        root->left = insert(root->left,value);
    else
        root->right = insert(root->right,value);
   return root;
}
