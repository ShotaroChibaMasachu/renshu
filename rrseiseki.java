class rrseiseki{
	public static void main(String args[]){
		System.out.println("90�_�ȏオ�o��܂Ŋ撣��");
			for (int i=0;i<90;){
				i=(int)(Math.random()*101);
				if (i < 90){
					System.out.println(i+"�_�ł��B");
					hugokaku();
				}else{
					System.out.println(i+"�_�ł��B");
					gokaku();
				}
			}
	}
	
	
	
	private static void hugokaku(){
		System.out.println("�s���i�ł��B");
		
	}
	
	private static void gokaku(){
		System.out.println("���i�ł��B");
	}
}
