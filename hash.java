import java.util.HashMap;

class hash{
	public static void main(String args[]){
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("���","�A�b�v��");
		map.put("�o�i�i","�o�i�i�}��");
		
		if (map.containsKey("���")){
			System.out.println(map.get("���"));
		}else{
			System.out.println("�w�肵���L�[�����݂��܂���");
		}
	}
}