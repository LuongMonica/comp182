//Luong, Monica
class Stack extends LL {
	//no attr of its own, inherits head from LL
	
	//constructor
	Stack () {
		super();
	}
	
	Stack (int item) {
		super(item);
	}
	
	//methods 
	void push(Node f) { insert(f); }
	
	Node pop() {
		Node p = head; 
		head = head.link;
		p.link = null;
		return p;
	}
}