import java.util.ArrayList;

class collect5{
	public static void main(String args[]){
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("���{");
		array.add("�u���W��");
		array.add("abcde");
		
		String country = array.get(2);
		System.out.println(country);
		System.out.println(array.size());
		array.set(2,"�ϊ����܂���");
		country = array.get(2);
		System.out.println(country);
		System.out.println(array.size());
		System.out.println(array.indexOf("�u���W��"));
		array.remove(0);
		System.out.println(array.get(0));
		
	}
}