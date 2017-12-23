// ==================================================
// Problem  :   Insert a node at the head of a linked list
// Score    :   5/5
// Language :   C++
// ==================================================


  struct Node
  {
     int data;
     struct Node *next;
  }

Node* Insert(Node *head,int data)
{
    Node *a = new Node;
    a->data = data;
    a->next = head;
    if(head == NULL){
        head = a;
    }
   else{
       head =a;
   }
    return head;
}



// ==================================================
// Problem  :   Insert a node at the tail of a linked list
// Score    :   5/5
// Language :   C++
// ==================================================

 struct Node
  {
     int data;
     struct Node *next;
  }

Node* Insert(Node *head,int data)
{
    Node *a = new Node;
    a->data = data;
    a->next = NULL;
    if(head == NULL){
        head = a;
    }
   else{
       Node *temp = new Node;
       temp = head;
       while(temp->next!=NULL){
           temp = temp->next;
       }
       temp->next = a;
   }
    return head;
}