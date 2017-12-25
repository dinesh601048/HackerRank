/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
*/  

  struct Node
  {
     int data;
     struct Node *next;
  }

int GetNode(Node *head,int pos)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node *temp1,*temp2;
    temp1 = head;
    temp2 = head;
    int count =0;
    while(temp1!=NULL){
        temp1 = temp1->next;
        if(count>pos)
            temp2 = temp2->next;
        else
            count++;
    }
    return temp2->data;
}
