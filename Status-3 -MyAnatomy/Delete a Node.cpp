// ==================================================
// Problem  :   Delete a Node
// Score    :   5/5
// Language :   C++
// ==================================================

  struct Node
  {
     int data;
     struct Node *next;
  }

Node* Delete(Node *head, int position)
{
  Node *temp1 = head;
  //int count=1;
  if(position==0){
      head = temp1->next;
      free(temp1);
      return head;
  }
    Node *temp2;
    while(position>1){
          temp1 = temp1->next;
          position--;
      }      
      temp2= temp1->next;
      temp1->next = temp2->next;
      free(temp2);

    return head;
}
