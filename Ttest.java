class Ttest{
	public static void main(String args[]){
		
		int tes[];
		tes = new int[2];
		try{
		tes[2] = 1;
		}
		catch(Exception e) {
		System.out.println("例外が発生しました");
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("配列の範囲を超えています");
		}
	}
	
}