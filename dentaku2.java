class dentaku2{
	public static void main(String args[]){
		int val1 = 0;
		int val2 = 0;
		String ope;
	
		if (args.length != 3){
			System.out.println("java dentaku ���l ���Z�q ���l");
			System.out.println("���Z�q�� kake waru tasu hiku ��4���");
			System.exit(0);
		}
		
		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[2]);
		ope = args[1];
		
		
		
		boolean errFlag = true;
		
		if (ope.equals("kake") ||
		ope.equals("waru")||
		ope.equals("tasu")||
		ope.equals("hiku")){
		
			errFlag = false;
		}
		if (errFlag == true){
			System.out.println("kake waru tasu hiku ����I��ł��������B");
			System.exit(0);
		}
		System.out.println("���͂��ꂽ���� " + val1 + " " + ope + " " + val2 + " �ł��B");
	}
}