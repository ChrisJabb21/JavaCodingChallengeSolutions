// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.


 /* refer to 
 class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
 }  */
 // write a method to Insert a node at the front of a linked list 
 // Linked List 1 -> 2, head = 1
// insertAtHead(head, 2) ==> 2->1->2

//First attempt
public ListNode insertAtHead(ListNode head, int data) {
    
    
    //Create a new ListNode object and set that as the head of the list
    //create new node and pass the int data from parameter.
    ListNode newNode = new ListNode(data);
    
    //check if head is equal to null which will check if list is empty.
    if(head == null){
        return newNode;
    } 
    else {
        newNode.next = head;
        return newNode;
    }
    
	
	
    
    //return the head of the modified list



}