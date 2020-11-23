//Luong, Monica
class Tree {
	NodeT head;
	
	Tree(){
		head = null;
	}
	
	void insert(int key) {
		head = Utility.insertR(head,key);
	}
	
	//string
	public String toString(){
		String str="";
		return Utility.postOrderR(head);
	}
	
}