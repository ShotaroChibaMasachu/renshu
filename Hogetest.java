class Hogetest{
	public static void main(String args[]){
		String hoge = null;
		System.out.println(hoge);
		if (hoge == null){
		System.out.println("ok");
		}
		if (hoge == ""){
		System.out.println("ok2");
		}
		
		if (hoge == null || hoge.equals("")){
		System.out.println("ok3");
		}
		
		if (hoge == "abc" && hoge.equals("")){
		System.out.println("ok4");
		}
		
		System.out.println("�����܂ł͎����Ŏ��̍s�ŃG���[���ł�");
		if (hoge.equals("")){
		}
	}
}