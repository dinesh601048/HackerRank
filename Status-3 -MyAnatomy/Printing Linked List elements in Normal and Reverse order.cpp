// ==================================================
// Problem  :   Print the Elements of a Linked List
// Score    :   5/5
// Language :   C++
// ==================================================



 struct Node
  {
     int data;
     struct Node *next;
  }

void Print(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node *a =head;
    while(a!=NULL){
        cout<<a->data<<endl;
        a = a->next;
    }
}




// ==================================================
// Problem  :   Print in Reverse
// Score    :   5/5
// Language :   C++
// ==================================================


struct Node
  {
     int data;
     struct Node *next;
  }

void ReversePrint(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method.
    if(head==NULL)  return;
  ReversePrint(head->next);
  cout<<head->data<<endl;
}
