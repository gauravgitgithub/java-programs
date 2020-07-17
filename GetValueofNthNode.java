import java.util.*;

public class GetValueofNthNode {

	Node head;

	class Node {
		int data;
		Node next;
		Node(int a){
			data = a;
			next = null;
		}
	}

	//Using approach of main pointer and reference pointer for main pointer
 	public void getValueFromEnd(int x){
		Node mainPtr = head;
		Node refPtr = head;

		int count = 0; 

		if(head == null){
			System.out.println("Empty List");
			return;
		}
        
        while (count < x) { 
            if (refPtr == null) { 
                System.out.println(x + " is greater than the length of the list"); 
                return; 
            } 
            refPtr = refPtr.next; 
            count++; 
        } 
        while (refPtr != null) { 
            mainPtr = mainPtr.next; 
            refPtr = refPtr.next; 
        } 
        System.out.println("Value at node " + x + " : " + mainPtr.data); 
	}

    public void push(int new_data) 
    { 
    	//Creating a new node with given value and updating head
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inp,val;
		GetValueofNthNode list = new GetValueofNthNode(); 
        while(true){
	        System.out.println("\nEnter key to perform operation : \n 1. Push a new node \n 2. Get value of node at given index  \n Any key to exit. \n");
        	inp = in.nextInt();
        	switch(inp){
        		case 1:
        			System.out.println("Enter value : ");
        			val = in.nextInt();
        			list.push(val);
        			break;
        		case 2:
        			System.out.println("Enter index : ");
        			val = in.nextInt();
					list.getValueFromEnd(val);
        			break;
        		default:
        			System.exit(0);
        	}
        }
	}
}