class ifbun{
	public static void main(String args[]){
		int suugaku,eigo;
		
		suugaku = 90;
		eigo = 75;
		
		System.out.println("���w:" + suugaku + "�p��:" + eigo);
		if (suugaku > 80 && eigo > 80){
		System.out.println("���i�ł�");
		}else if(suugaku > 80 || eigo > 80){
		System.out.println("�Е����i");
		}else{
		System.out.println("�����_���ł��B");
		}
		
		
	}
}
