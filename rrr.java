class rrr{
	public static void main(String args[]){
		int r;
		
		char c;
			for (int i = 0;i < 10;i++){
			r = (int)(3 * Math.random())+1;
			
			switch(r){
				case 1:
				c = '‘«';
				break;
				case 2:
				c = '‘å';
				break;
				default:
				c = '”ò';
			}
			
		System.out.println(c);
		}
	}
}
