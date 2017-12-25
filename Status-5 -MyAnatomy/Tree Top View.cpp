//The Top View of a Tree


struct node
{
    int data;
    node* left;
    node* right;
};



void topView(node * root) {
 if(root->left){
     root->left->right= NULL;
     topView(root->left);
 }
 cout<<root->data<<" ";
 if(root->right){
     root->right->left=NULL;
     topView(root->right);
 }
  
}