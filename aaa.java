class aaa{
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
		
	}


	private static void tasu(int a, int b){
	System.out.println("‚½‚·‚Æ");
	System.out.print(a+b);
		return;
	}
	
	private static int bai(int a){
	System.out.println("”{‚É‚µ‚Ü‚·");
	return a * 2;
	}
}


	