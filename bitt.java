class bitt{
	public static void main(String args[]){
		byte b;
		
		b = 0x55 & 0x0F;
		System.out.print("0x55 & 0x0F = ");
		System.out.printf("0x%02x\n",b);
		
		b = 0x55 | 0x0F;
		System.out.print("0x55 | 0x0F = ");
		System.out.printf("0x%02x\n",b);
		
		b = 0x55 ^ 0x0F;
		System.out.print("0x55 ^ 0x0F = ");
		System.out.printf("0x%02x\n",b);
		
		b = ~0x55;
		System.out.print("~0x55 = ");
		System.out.printf("0x%02x\n",b);
		

	}
}
