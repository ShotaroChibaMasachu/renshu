class dentaku{
	public static void main(String args[]){
		int val1 = 0;
		int val2 = 0;
		String ope;
		int kekka=0;
	
		if (args.length != 3){
			System.out.println("java dentaku 数値 演算子 数値");
			System.out.println("演算子は kake waru tasu hiku の4種類");
			System.exit(0);
		}
		
		try{
		
		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[2]);
		}catch(NumberFormatException e){
			System.out.println("数値ではない何かが入力されています。");
			System.exit(0);
		}
		
		ope = args[1];
		
		
		
		boolean errFlag = true;
		
		if (ope.equals("kake") ||
		ope.equals("waru")||
		ope.equals("tasu")||
		ope.equals("hiku")){
		
			errFlag = false;
		}
		if (errFlag == true){
			System.out.println("kake waru tasu hiku から選んでください。");
			System.exit(0);
		}
		
		if (ope.equals("kake")){
		kekka = val1 * val2;
		}else if(ope.equals("tasu")){
		kekka = val1 + val2;
		}else if(ope.equals("hiku")){
		kekka = val1 - val2;
		}else if(ope.equals("waru")){
			if (val2 == 0){
			System.out.println("0で割ろうとしています。");
			System.exit(0);
			}
		kekka = val1 / val2;
		}
		
		System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です。");
		System.out.println("計算結果は " + kekka + " です。");
	}
}