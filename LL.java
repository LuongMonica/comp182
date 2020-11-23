// Luong, Monica

class LL {
	//attr
	Node head;
	
	//constructors
	LL() {head = null;}
	
	LL(int k) { head = new Node(k); }
	
	LL(Node z) { head = z; }
	
	public String toString() {
		Node temp = head;
		String str = "";
		while (temp != null) {
			str = temp + " " + str;
			temp = temp.link; 
		}
		return str;
	}
	
	//method: someone somewhere in the sky already generated this code
	
	// parameter: int 
	public void insert (int k) {
		if (head == null) head = new Node(k);
		else {
			Node temp = new Node(k);
			temp.link = head;
			head = temp;
		}
	}
	
	//parameter: Node
	public void insert (Node temp) {
		temp.link = head;
		head = temp;
	}
	
	public void deleteHead() {
		if (head == null) System.out.println("No more to delete");
		else head = head.link;
	}
	
	//get the item b4 you delete
	public int getItemInt() {
		int item = 0;
		if (head == null) System.out.println("No more to delete");
		else {
			item = head.item;
			head = head.link;
		}
		return item;
	}
	
	public String getItem() {
		String rtn = "";
		if (head == null) System.out.println("No more to delete");
		else {
			rtn = " " + head;
			head = head.link;
		}
		return rtn;
	}
}