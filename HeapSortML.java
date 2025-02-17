//Luong, Monica

public class HeapSortML {
	//attributes
	static String sML;
	static Fraction[] aML;	 
	
	//constructor: create Fraction[] from String
	HeapSortML (String s) {
		this.sML= Utility.clean(s);
		String[] sArr=sML.split(",");
		//for heap: add 1 bc we use aML[0]
		aML = new Fraction[sArr.length+1]; 
		aML[0] = new Fraction("-99/100"); //fake
		for (int i=1;i < aML.length; i++) {
			aML[i] = new Fraction(sArr[i-1]);
		}
		
	}	
	
	//heap sort-percolate
	public void percolate(int iPerc, int barrier) {
		aML[0] = aML[iPerc];
		int i = iPerc;
		
		//diff w/ reheap: <= barrier
		while (2*i <= barrier) {
			int child = 2 * i;
			if (child+1 <= barrier)
				if (aML[child].lessThan(aML[child+1])) child++;
			if (aML[i].lessThan(aML[child])) { //i should be 0
				//swap i and child
				Fraction temp = aML[i];
				aML[i] = aML[child];
				aML[child] = temp;
				i = child;
			}
			else break;
		}
	}
	
	//heap sort-reheap after swapping
	public void reheap(int iReheap, int barrier) {
		aML[0] = aML[iReheap];
		int i = iReheap;
		
		//diff w/ percolate: < barrier
		while (2*i < barrier) {
			int child = 2 * i;
			if (child+1 < barrier)
				if (aML[child].lessThan(aML[child+1])) child++;
			if (aML[i].lessThan(aML[child])) { //i should be 0
				//swap i and child
				Fraction temp = aML[i];
				aML[i] = aML[child];
				aML[child] = temp;
				i = child;
			}
			else break;
		}
	}
	
	public void heapSortML() {
		//buildHeap
		//start= last parent
		int start = (aML.length - 1)/2;
		for (int i = start; i>=1 ; i --) {
			percolate(i, aML.length - 1);
		}
		//swapRoot
		int j = 1;
		int barrier = aML.length-1;
		while (j <= barrier) { 
			Fraction temp = aML[j];
			aML[j] = aML[barrier];
			aML[barrier] = temp;
			reheap(j, barrier);
			barrier--;
		}
	}
	
	//output
	public String toString() {
		String rtn = "";
		for (int i =1; i< aML.length; i++) {
			if (i < aML.length - 1)  rtn = rtn + aML[i] + ",";
			else rtn = rtn+aML[i];
		}
		return (rtn);
	}	   

}