package com.deitel.datastructures;

class ListNode<T>{
	
	T data;
	ListNode<T> nextNode;
	
	ListNode(T object) 
	{ 
	this(object, null); 
	} 
	
	ListNode(T object, ListNode<T> node){
	data = object; 
	nextNode = node; 
	} 

	// return reference to data in node
	T getData() { 
	return data;
	}

	// return reference to next node in list
	ListNode<T> getNext(){ 
	return nextNode; 
	}  
}
	public class List<T>{
	
		private ListNode<T> firstNode;
		private ListNode<T> lastNode;
		private String name; // string like "list" used in printing
		// constructor creates empty List with "list" as the name
		public List(){ 
		this("list"); 
		} 
	
		// constructor creates an empty List with a name
		public List(String listName){
			name = listName;
			firstNode = lastNode = null;
			}

		public void insertAtFront(T insertItem){
			if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = new ListNode<T>(insertItem);
			else // firstNode refers to new nodr
			firstNode = new ListNode<T>(insertItem, firstNode);
			} 
		
		public void insertAtBack(T insertItem){
			if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = new ListNode<T>(insertItem);
			else // lastNode's nextNode refers to new node
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
			} 
			
		public T removeFromFront() throws EmptyListException{
			if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

			T removedItem = firstNode.data; // retrieve data being removed

			// update references firstNode and lastNode 
			if (firstNode == lastNode)
			firstNode = lastNode = null;
			else
			firstNode = firstNode.nextNode;

			return removedItem; // return removed node data
			}
		
		public T removeFromBack() throws EmptyListException{
			if (isEmpty()) // throw exception if List is empty
		 throw new EmptyListException(name);

		 T removedItem = lastNode.data; // retrieve data being removed

		 // update references firstNode and lastNode
		 if (firstNode == lastNode)
		 firstNode = lastNode = null;
		 else // locate new last node
		 { 
		 ListNode<T> current = firstNode;

		 // loop while current node does not refer to lastNode
		 while (current.nextNode != lastNode)
		 current = current.nextNode;
		 
		 lastNode = current; // current is new lastNode
		 current.nextNode = null;
		 }

		 return removedItem; // return removed node data
		 }
		 
		public boolean isEmpty(){
			return firstNode == null; 
		}
		
		public void print(){
	
			if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
			}

			System.out.printf("The %s is: ", name);
			ListNode<T> current = firstNode;

			// while not at end of list, output current node's data
			while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
			} 

			System.out.println();
		} 
}	