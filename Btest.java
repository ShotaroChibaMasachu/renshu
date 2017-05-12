import java.math.BigDecimal;

class Btest{
	public static void main(String args[]){
		double a = 1.10;
		double b = 2.20;
		double c = a+b;
		System.out.print(c);
		BigDecimal aa = new BigDecimal("1.1");
		BigDecimal bb = new BigDecimal("2.2");
		BigDecimal cc = aa + bb;
		System.out.print(cc);
	}
}
	