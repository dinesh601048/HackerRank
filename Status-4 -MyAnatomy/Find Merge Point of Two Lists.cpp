/*
   Find merge point of two linked lists
   Node is defined as
*/


   struct Node
   {
       int data;
       Node* next;
   }

int FindMergeNode(Node *headA, Node *headB)
{
    // Complete this function
    // Do not write the main method. 
    Node *temp1=headA;
    Node *temp2=headB;
    while(temp1!=temp2){
        if(temp1->next==NULL) temp1=headB;
        else    temp1 = temp1->next;
        if(temp2->next==NULL) temp2=headA;
        else    temp2 = temp2->next;
    }
    return temp2->data;
}
