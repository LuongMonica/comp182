//Luong, Monica
class NodeT {
	NodeT left;
	int item;
	NodeT right;
	
	NodeT (int input) {
		left = null;
		item=input;
		right=null;
	}
	
	public String toString() {
		return (""+item);
	}
}