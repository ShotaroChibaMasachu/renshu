class nanmozi{
	public static void main(String args[]){
		String str1 = "あいうえお";
		char c;
			for(int i = 0; i < 5 ; i++){
				c = str1.charAt(i);
				System.out.println(c);
			}
			
		System.out.println("文字数" + str1.length() + "です。");

		}
}