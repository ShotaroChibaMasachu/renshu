class dentaku{
	public static void main(String args[]){
		int val1 = 0;
		int val2 = 0;
		String ope;
		int kekka=0;
	
		if (args.length != 3){
			System.out.println("java dentaku ���l ���Z�q ���l");
			System.out.println("���Z�q�� kake waru tasu hiku ��4���");
			System.exit(0);
		}
		
		try{
		
		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[2]);
		}catch(NumberFormatException e){
			System.out.println("���l�ł͂Ȃ����������͂���Ă��܂��B");
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
			System.out.println("kake waru tasu hiku ����I��ł��������B");
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
			System.out.println("0�Ŋ��낤�Ƃ��Ă��܂��B");
			System.exit(0);
			}
		kekka = val1 / val2;
		}
		
		System.out.println("���͂��ꂽ���� " + val1 + " " + ope + " " + val2 + " �ł��B");
		System.out.println("�v�Z���ʂ� " + kekka + " �ł��B");
	}
}