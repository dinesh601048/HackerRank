// ==================================================
// Problem  :   Insert a node at a specific position in a linked list
// Score    :   5/5
// Language :   C++
// ==================================================

 struct Node
  {
     int data;
     struct Node *next;
  }

Node* InsertNth(Node *head, int data, int position)
{
  Node *a = new Node;
  a->data= data;
  if(position==0){
      a->next= head;
      head = a;
  }
  else{
      Node *c = head;
      int count=1;
      while(position!= count){
          c = c->next;
          count++;
      }
      a->next = c->next;
      c->next = a;
  }
  return head;
}
