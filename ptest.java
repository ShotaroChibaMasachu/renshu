class ptest{
	public static void main(String args[]){
		terebi tva = new terebi();
		
		tva.cha = 1;
	}
}

class terebi{
	int cha;
	
	void setcha(int ncha){
		cha = ncha;
		System.out.println("V‚µ‚¢cha" + cha);
	}
}
