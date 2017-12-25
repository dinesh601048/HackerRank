/*
   Reverse a doubly linked list, input list may also be empty
   Node is defined as
*/


   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }

Node* Reverse(Node *head)
{
  Node *prev,*curr,*nex;
  curr = head;
  prev =NULL;
  while(curr!=NULL){
      nex = curr->next;
      curr->prev=nex;
      curr->next = prev;
      prev=curr;
      curr=nex;
  }  
  head = prev;
  return head;
}
