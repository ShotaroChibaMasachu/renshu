class ifbun{
	public static void main(String args[]){
		int suugaku,eigo;
		
		suugaku = 90;
		eigo = 75;
		
		System.out.println("数学:" + suugaku + "英語:" + eigo);
		if (suugaku > 80 && eigo > 80){
		System.out.println("合格です");
		}else if(suugaku > 80 || eigo > 80){
		System.out.println("片方合格");
		}else{
		System.out.println("両方ダメです。");
		}
		
		
	}
}
