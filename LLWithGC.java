//Luong, Monica
class LLWithGC extends LL {
	//attr
	Stack garbage;
	
	//constr
	LLWithGC() {
		head = null;
		garbage = new Stack();
	}
	
	LLWithGC(int k) { head = new Node(k); }
	
	LLWithGC(Node z) { head = z; }
	
	//methods
	public String toString() {
		Node temp = head;
		String str = "\nLL=";
		while (temp != null) {
			str = str + temp + " " ;
			temp = temp.link; 
		}
		str = str + "\nstack=" + garbage;
		return str;
	}
	
	public void insert (int k) {
		Node temp = null;
		if (garbage.head != null) {
			temp = garbage.pop();
			temp.item = k;
		}
		else {
			temp = new Node(k);
		}
		insert(temp);
	}
	
	/*public int searchNode(int i) {
		//search for node abc (find the addr) so that abc.link.item = i
			//node temp = abc.link;
			//abc.link = abc.link.link;
			//temp.link = null;
		Node abc = new Node(i);
		abc.link
		abc.link.item = i;
		while (abc.link.item != i) {
			
		}
		Node temp = abc.link.item;
		abc.link = abc.link.link;
		temp.link = null;
		return temp;  
	}
	
	public void removeNode(int n) {
		//push the removed node (temp) to garbage
			//garbage.push(temp);
		Node temp = searchNode(n); 
		garbage.push(temp);
	}
	*/
}