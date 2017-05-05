import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class stest{
	public static void main(String args[]){
		try{
			File file = new File("stestyou.txt");
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\\r\\n");
			
			int line = 1;
			
			while(scan.hasNext()){
				String str = scan.next();
				System.out.println(line + "：" + str);
				line++;
			}
		}catch(FileNotFoundException e){
			System.out.println(e + "ファイルが見当たらない");
		}
	}
}
