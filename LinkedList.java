public class LinkedList {
	
   Node head; //head of the list
	
	/*Linked list node. This inner class is made static so that main()
	 * can access it*/
    
    /*
	static class Node { //a separate class for node. 
		
		int data; 
		Node next; 
		
		Node(int d) { //constructor for the class
			data = d; 
			next = null; 
		}
      }
		*/ 
      
   public static void main(String[] args) {
   		
      LinkedList llist = new LinkedList(); //empty list
      llist.head = new Node(1); //instead of saying first, we say head of a linkedlist
      Node second = new Node(2);
      Node third = new Node(3);
   		
      llist.head.next = second; 
      second.next = third; 
   }
		
		
}

