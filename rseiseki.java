class rseiseki{
	public static void main(String args[]){
		int r;
		r = (int)(Math.random()*101);
		int eigo = r;
		r = (int)(Math.random()*101);
		int suugaku = r;
		r = (int)(Math.random()*101);		
		int kokugo = r;
		
		check("英語",eigo);
		check("数学",suugaku);
		check("国語",kokugo);
	}
	
	private static void check(String kyoka,int seiseki){
		System.out.print(kyoka + "の試験結果は");
		if (seiseki > 80){
			System.out.println(seiseki + "点なので合格です。");
		}else{
			System.out.println(seiseki + "点なので不合格です。");
		}
	}
}
