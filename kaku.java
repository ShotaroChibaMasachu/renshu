import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class kaku{
	public static void main(String args[]){
		try{
			File file = new File("C:\\jsa\\p.txt");
					
			if(checkBeforeWritefile(file)){
				FileWriter filewriter = new FileWriter(file);
				
				filewriter.write("����ɂ���\r\n");
				filewriter.write("�܂Ƃ߂ď�������\r\n���s�e�X�g");
				
				filewriter.close();
			}else{
				System.out.println("�t�@�C���ɏ������߂܂���");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	private static boolean checkBeforeWritefile(File file){
		if (file.exists()){
			if (file.isFile() && file.canWrite()){
				return true;
			}
		}
		
		return false;
	}
	
}
