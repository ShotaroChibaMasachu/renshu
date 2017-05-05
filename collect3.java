import java.util.ArrayList;

class collect3{
	public static void main(String args[]){
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("“ú–{");
		array.add("ƒuƒ‰ƒWƒ‹");
		array.add("abcde");
		
		String country = array.get(2);
		System.out.println(country);
		System.out.println(array.size());
		array.set(2,"•ÏŠ·‚µ‚Ü‚µ‚½");
		country = array.get(2);
		System.out.println(country);
		System.out.println(array.size());
	}
}