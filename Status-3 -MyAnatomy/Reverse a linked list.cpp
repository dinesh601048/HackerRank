// ==================================================
// Problem  :   Reverse a linked list
// Score    :   5/5
// Language :   C++
// ==================================================

struct Node
  {
     int data;
     struct Node *next;
  }

Node* Reverse(Node *head)
{
  Node *prev,*curr,*nex;
  curr = head;
  prev =NULL;
  while(curr!=NULL){
      nex = curr->next;
      curr->next = prev;
      prev=curr;
      curr=nex;
  }  
  head = prev;
    return head;
}