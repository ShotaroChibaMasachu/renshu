class bbb{
	public static void main(String args[]){
		int a = 0;
		int b = 0;
		try{
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			System.out.println("”’l‚Å‚Í‚È‚¢‰½‚©‚ª“ü—Í‚³‚ê‚Ä‚¢‚Ü‚·B");
			System.exit(0);
		}
		
		tasu(a,b);
		a = bai(a);
		b = bai(b);
		System.out.println(a);
		System.out.println(b);
		
		sosu sosua = new sosu();
		sosua.disp();
		sosua.ryoo(a);
		sosua.tyoo(b);
		sosua.disp();
	}


	private static void tasu(int a, int b){
	System.out.println("‚½‚·‚Æ");
	System.out.println(a+b);
		return;
	}
	
	private static int bai(int a){
	System.out.println("”{‚É‚µ‚Ü‚·");
	return a * 2;
	}
}

class sosu{
	int tyo = 0;
	int ryo = 0;
	void tyoo(int brr){
		tyo = brr * 3;
	}
	
	void ryoo(int crr){
		ryo = crr * 5;
	}
	
	void disp(){
		System.out.println("ryo = " + ryo);
		System.out.println("tyo = " + tyo);
	}
}

	