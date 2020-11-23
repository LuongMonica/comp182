 //Luong, Monica

public class Utility {
	
	static int findGCD (int n, int m) {
		if (n<=0) return m;
		while (n != m) {
			if (m > n) m = m - n;
			else n = n - m;
		}
		return m;
	}
	
	//recursive 
	static int findGCDR (int m, int n) {
		if (n>m) return findGCDR(m, n-m);
		else if (n<m) return findGCDR(m-n, n);
		else return m; // case n == m	
	}	
	
	static String clean(String sML) {
		//step 1: delete any leading/trailing whitespace
		sML = sML.trim(); 
		//step 2: delete extra whitespace next to each other 
		sML = sML.replaceAll("\\s+", " ");
		//step 3: delete extra commas next to each other
		sML = sML.replaceAll(",+", ",");
		//step 4: again, delete any leading/trailing whitespace
		sML = sML.trim(); 
		//step 5: delete spaces in front and back of ,
		sML = sML.replaceAll("\\s*,\\s*", ",");
		//step 6: delete trailing commas
		sML = sML.replaceAll(",$", ""); 
		return sML;
	}
	
	static String str = ""; //static var
	
	static NodeT insertR(NodeT h, int key) {
		if(h==null) {h = new NodeT(key); return h;}
		if (key<h.item) h.left =insertR(h.left, key);
		else if (key>h.item) h.right = insertR(h.right, key);
		return h;
	}
	
	static String inOrderR(NodeT tmp) {
		if (tmp != null) {
			inOrderR(tmp.left);
			str = str+" "+tmp;
			inOrderR(tmp.right);
		}
		return str;
	}
	
	static String preOrderR(NodeT tmp) {
		if (tmp != null) {
			str = str+" "+tmp;
			preOrderR(tmp.left);
			preOrderR(tmp.right);
		}
		return str;
	}
	
	static String postOrderR(NodeT tmp) {
		if (tmp != null) {
			postOrderR(tmp.left);
			postOrderR(tmp.right);
			str = str+" "+tmp;
		}
		return str;
	}
	
	/*static void preOrder(NodeT tmp) {
		if (tmp != null) {
			System.out.println(tmp.item+" ");
			preOrder(tmp.left);
			preOrder(tmp.right);
		}
	}
	
	static void inOrder(NodeT tmp) {
		if (tmp != null) {
			inOrder(tmp.left);
			System.out.println(tmp.item+" ");
			inOrder(tmp.right);
		}
	}
	
	static void postOrder(NodeT tmp) {
		if (tmp != null) {
			postOrder(tmp.left);
			postOrder(tmp.right);
			System.out.println(tmp.item+" ");
		}
	}*/
}