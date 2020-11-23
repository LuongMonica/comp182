//Luong, Monica
class CircLLWithGC extends CircLL {
	Stack garbage;
	
	CircLLWithGC() {head = null; tail=null; garbage = new Stack();}
	
	public String toString() {
		Node current = head;
		String str = "\nCircLLWithGC=";
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
		str = str + "\nstack=" + garbage;
		return str;
	}
	
	public void insert (int k) {
		Node nNode;
		if (head == null) {
			if (garbage.head == null) nNode = new Node(k);
			else {nNode = garbage.pop(); nNode.item = k;}
			
			head = nNode;
			tail = nNode;
			nNode.link = head; 
		}
		else {
			if (garbage.head == null) nNode = new Node(k);
			else {nNode = garbage.pop(); nNode.item = k;}
			
			Node temp = head;
			nNode.link = temp;
			head = nNode;
			tail.link = head; 
		}
	}
	
	public Node searchNode (int k) {
		// prevNode == Node b4 the one we're searching for
		// preNode.link = the actual Node we're searching for
		// sNode same as preNode.link 
		Node prevNode = head;
		do {
			if (prevNode == head && prevNode.item == k) {
				prevNode = prevNode.link;
				return tail;
			}
			else if (prevNode.link.item != k) {
				prevNode = prevNode.link;
			}
			else if (prevNode.link.item == k) {
				return prevNode;
			}
		}
		while (prevNode != head); 
		System.out.println("Error! Node doesn't exist!");
		System.exit(0);
		return prevNode;
	}
	
	public void remove (int k) {
		if (head == null) System.out.println("No more to delete");
		else {
			// case 1: sNode is the head	
				//Node temp = head;
				//head = head.link;
				//tail.link = head;
				//garbage.push(temp);
			// case 2: sNode is the tail 
				// prevNode = (new) tail
				// tail.link = head
				// garbage.push(sNode)
			// case 3: sNode is random Node in the middle of the chain
				// prevNode.link = prevNode.link.link
				// tail.link = head
				// garbage.push(sNode)
			// case 4: CLL is only 1 element [do this 2nd]
				// how you know it --> head == head.link
				// garbage.push(head)
				// then set head & tail to be null
				
			Node temp = searchNode(k);
			Node a = temp.link; 
			// case 4: 1 element
			if (head == head.link){
				garbage.push(head);
				head = null;
				tail = null;
			}
			// case 1: sNode is head
			else if (temp == tail) {
				tail = a; 
				temp.link = temp.link.link; a.link = null;
				head = temp;
				tail.link = head;
				garbage.push(a);
			}
			// case 2: sNode is tail
			else if (temp == head) {
				tail = a; 
				temp.link = temp.link.link; a.link = null;
				head = temp;
				tail.link = head;
				garbage.push(a);
			}
			// case 3: sNode is random
			else {
				temp.link = temp.link.link;
				garbage.push(a);
			}			
		}
	}
	
}