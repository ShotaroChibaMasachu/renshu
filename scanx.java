import java.util.Scanner;

class scanx{

	public static void main(String args[]){
		System.out.println("文字を入力");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for (int i = 0;i < 3;i++){
		String a = scan.next();
		System.out.println(a);
		}
	}
}