import java.util.Scanner;

class scany{

	public static void main(String args[]){
		System.out.println("数値を入力");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for (int i = 0;i < 3;i++){
		int a = scan.nextInt();
		System.out.println(a);
		}
	}
}