//Luong, Monica
class TestT {
	public static void main (String[] args){
		Tree t1 = new Tree();
		String s="24 15 1 7 9";
		String[] aS = s.split(" ");
		int iS[] = new int[aS.length];
		for (int i=0; i<aS.length; i++) {
			iS[i] = Integer.parseInt(aS[i]);
			t1.insert(iS[i]);
		}
		System.out.println(t1);
	}
}