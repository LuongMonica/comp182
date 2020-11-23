//Luong, Monica

public class Test {
	public static void main (String[] args) {
		
		CircLLWithGC n = new CircLLWithGC();
		
		n.insert(5);
		System.out.println(n);
		n.insert(10);
		System.out.println(n);
		n.insert(20);
		System.out.println(n);
		n.insert(40);
		System.out.println(n);
		
		n.remove(40);
		System.out.println(n);
		n.remove(20);
		System.out.println(n);	
		n.remove(10);
		System.out.println(n);
		n.remove(5);
		System.out.println(n);
		
		n.insert(200);
		System.out.println(n);
		n.insert(1);
		System.out.println(n);
		n.insert(15);
		System.out.println(n);
		n.insert(25);
		System.out.println(n);
		n.insert(45);
		System.out.println(n);
		
	}
}