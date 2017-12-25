/*
    Insert Node in a doubly sorted linked list 
    After each insertion, the list should be sorted
   Node is defined as
*/

   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }

Node* SortedInsert(Node *head,int data)
{
    // Complete this function
   // Do not write the main method. 
    Node *temp=head;
    Node *newnode = new Node();
    newnode->data=data;
    newnode->prev=NULL;
    newnode->next=NULL;
    if(temp==NULL){
        temp=newnode;
        head=temp;
        return head;
    }
    while(newnode->data > temp->data && temp->next!=NULL){
            temp=temp->next;
    }
    if(temp->next==NULL && newnode->data > temp->data){
            newnode->prev=temp;
            temp->next=newnode;
            return head;
    }
    newnode->next= temp;
    newnode->prev= temp->prev;
    temp->prev=newnode;
    
    if(newnode->prev!=NULL){
        newnode->prev->next=newnode;
    }
    if(newnode->prev==NULL){
        temp = newnode;
        return temp;
    }
    return head;
}
