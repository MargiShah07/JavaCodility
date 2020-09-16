import java.util.*;

public class LinkedListSingle {
	Node head;
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) { data = d; next = null; } 
    } 
    void deleteList() 
    { 
        head = null; 
    } 
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList(); 
		list.push(20);
		list.push(50);
		list.push(80);
		list.push(2);
		
		System.out.println("Contents of Linkedlist:" +list);
		System.out.println("Deleting the list"); 
        list.deleteList(); 
	}

}
