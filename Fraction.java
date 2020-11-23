//Luong, Monica

public class Fraction {
	//attributes
	int num;
	int den;

	Fraction(int top, int bot){
		int gcd = Utility.findGCD(top, bot);
		num = top/gcd;
		den = bot/gcd;
	} 
	
	Fraction(int n) {
		num = n;
		den = 1;
	}
	
	Fraction(String s) {
		int whole = 0; 
		int blank = s.indexOf(" ");
		if (blank > -1) {
			String[] dataB = s.split("\\s+");
			whole = Integer.parseInt(dataB[0]);
			s = dataB[1];
		}
		int slash = s.indexOf("/");
		if (slash > -1) {
			String [] data = s.split("/");
			den = Integer.parseInt(data[1].trim());
			num = (whole * den) + Integer.parseInt(data[0].trim());
			int gcd = Utility.findGCD(num, den);
			num = num/gcd;
			den = den/gcd;
		}
		else {
			num = Integer.parseInt(s.trim());
			den = 1;
		}
	}
	
	//output method
	public String toString(){
		if (den != 1){
			if (num >= den) return (num/den + " " + num%den + '/' + den);
			else return (num + "" + "/" + den );
		}
		return (num+"/" + den);
	}
	
	//program 1: subBy
	void subBy(Fraction g) {
		int top = (g.den * this.num) - (g.num * this.den);
		int bot = this.den * g.den;
		int gcd = Utility.findGCD(top, bot);
		this.num = top/gcd;
		this.den = bot/gcd;
	}
	
	//fraction comparison
	//if g < f, returns true
	boolean lessThan(Fraction g) {
			return (this.num * g.den < this.den * g.num);
	}
	
	//program 1: div fraction
	static Fraction[] divFraction(Fraction f, Fraction g) {
		int num_divide = f.num * g.den;
		int den_divide = f.den * g.num;
		int gcd = Utility.findGCD(num_divide, den_divide);
		num_divide /= gcd;
		den_divide /= gcd;
		//assign f to new values
		f.num = num_divide;
		f.den = den_divide;
		int quotient = num_divide / den_divide;
		int remainder = num_divide % den_divide;
		//assign new fraction values
		Fraction [] newValue = {new Fraction(quotient), new Fraction(remainder)};
		return newValue;
	}
	
}