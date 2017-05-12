class Syarokopi{
	public static void main(String args[]){
		try
        {
		System.out.println("シャローコピーのテスト");
		Sya a = new Sya();
		
		
		a.sets("abc");
		a.disp();
		
		
		Sya b = (Sya)a.clone();
		
		
		b.disp();
		
		b.tasu("de");
		
		a.disp();
		b.disp();
		
		}
        catch( CloneNotSupportedException e )
        {
            e.printStackTrace();
        }
		
	}
}




class Sya implements Cloneable{
	String mozi;
	
	void sets(String newmozi){
		mozi = newmozi;
	}
	void disp(){
		System.out.println("moziは " + mozi);
	}
	
	void tasu(String pmozi){
		mozi = mozi + pmozi;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}