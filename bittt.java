class bittt{
	public static void main(String args[]){
		byte b;
		
		b = 8 << 3;
		System.out.print("8 << 3\n");
		System.out.println(b);
		
		b = -10 << 2;
		System.out.print("-10 << 2\n");
		System.out.println(b);
		
		b = 0xA3 >>> 2;
		System.out.print("0xA3 >>> 2\n");
		System.out.println(b);
		
		b = 0xA3 >>> 3;
		System.out.print("0xA3 >>> 3\n");
		System.out.println(b);
		

	}
}
