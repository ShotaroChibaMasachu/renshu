class fff{
	public static void main(String args[]){
		disp(1);
		disp(2);
		disp(3);
	}
	
	private static void disp(int no){
		int n[] = {18,29,36};
		
		try{
			System.out.println(n[no]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�z��͈̔͂𒴂��Ă��܂�");
			return;
		}
		finally{
			System.out.println("�v�f�̏o�͂��I�����܂��B");
		}
	}
}