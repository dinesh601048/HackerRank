//Tree Level Order Traversal


struct node
{
    int data; 
    node* left;
    node* right;
}

void levelOrder(node * root) {
  queue<node *> q;
  node *temp=root;
    int c=0,c1=0;
  if(root!= NULL)
  {
    q.push(root);
  }
    while(!q.empty())
    {
       temp= q.front();
   	   q.pop();
       cout<<temp->data<<" ";
        if(temp->left)
        {
            q.push(temp->left);
            //cout<<++c<<" ";
        }
        if(temp->right)
        {
            q.push(temp->right);
              //cout<<++c1<<" ";
        }   
       // cout<<"\n";
    }
}