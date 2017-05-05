class rrseiseki{
	public static void main(String args[]){
		System.out.println("90点以上が出るまで頑張る");
			for (int i=0;i<90;){
				i=(int)(Math.random()*101);
				if (i < 90){
					System.out.println(i+"点です。");
					hugokaku();
				}else{
					System.out.println(i+"点です。");
					gokaku();
				}
			}
	}
	
	
	
	private static void hugokaku(){
		System.out.println("不合格です。");
		
	}
	
	private static void gokaku(){
		System.out.println("合格です。");
	}
}
