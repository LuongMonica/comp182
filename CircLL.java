// Luong, Monica

class CircLL {
	//attr
	Node head;
	Node tail;
	
	//constructors
	CircLL() {head = null; tail=null;}
	
	// 2 constructors are not right
	//CircLL(int k) { head = new Node(k); head.link = head;}
	
	//CircLL(Node z) { head = z; head.link = head;}
	
	public String toString() {
		Node current = head;
		String str = "";
		if (head == null) {
			System.out.println("empty");
		}
		else {
			do { 
			str = str + " " + current;
			current = current.link;
			}
			while (current != head); 
		}
		return str;
	}
	
	public String display(Node a) {
		Node current = a;
		String str = "";
		if (a == null) {
			System.out.println("empty");
		}
		else {
			do { 
			str = str + " " + current;
			current = current.link;
			}
			while (current != a); 
		}
		return str;
	}
	//methods: someone somewhere in the sky already generated this code
	
	public void insert (int k) {
		Node nNode = new Node(k);
		if (head == null) {
			head = nNode;
			tail = nNode;
			nNode.link = head; //circular
		}
		else {
			Node temp = head;
			nNode.link = temp;
			head = nNode;
			tail.link = head; //circular
		}
	}
	
	public void insert (Node nNode) {
		if (head == null) {
			head = nNode;
			tail = nNode;
			nNode.link = head; //circular
		}
		else {
			Node temp = head;
			nNode.link = temp;
			head = nNode;
			tail.link = head; //circular
		}
	}
	
	//get the item b4 you delete
	//this will become searchNode
	public int getItemInt() {
		int item = 0;
		if (head == null) System.out.println("No more to delete");
		else {
			item = head.item;
			head = head.link;
		}
		return item;
	}
	
	//this will become updateNode
	public String getItem() {
		String rtn = "";
		if (head == null) System.out.println("No more to delete");
		else {
			rtn = " " + head;
			head = head.link;
		}
		return rtn;
	}
	
	//this will become removeNode
	public void deleteHead() {
		if (head == null) System.out.println("No more to delete");
		else {
			Node temp = head;
			head = head.link;
			tail.link = head;
		}
	}
	
}