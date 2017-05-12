class Ttest{
	public static void main(String args[]){
		
		int tes[];
		tes = new int[2];
		try{
		tes[2] = 1;
		}
		catch(Exception e) {
		System.out.println("—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("”z—ñ‚Ì”ÍˆÍ‚ğ’´‚¦‚Ä‚¢‚Ü‚·");
		}
	}
	
}