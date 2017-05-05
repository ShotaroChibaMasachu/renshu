class seiseki{
	public static void main(String args[]){
		int seiseki[][] = {
		{10,20,30},
		{90,85,100},
		{99,66,33}
		};
		String kurasu[] = {"頑張るクラス","優秀なクラス","惜しいクラス"};
		
		for (int i = 0;i<3;i++){
			System.out.println(kurasu[i] + "の成績");
			
			for (int j=0;j<3;j++){
				System.out.println(seiseki[i][j]);
			}
		}
		



		}
}