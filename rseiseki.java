class rseiseki{
	public static void main(String args[]){
		int r;
		r = (int)(Math.random()*101);
		int eigo = r;
		r = (int)(Math.random()*101);
		int suugaku = r;
		r = (int)(Math.random()*101);		
		int kokugo = r;
		
		check("�p��",eigo);
		check("���w",suugaku);
		check("����",kokugo);
	}
	
	private static void check(String kyoka,int seiseki){
		System.out.print(kyoka + "�̎������ʂ�");
		if (seiseki > 80){
			System.out.println(seiseki + "�_�Ȃ̂ō��i�ł��B");
		}else{
			System.out.println(seiseki + "�_�Ȃ̂ŕs���i�ł��B");
		}
	}
}
