import java.io.File;

class fileTest7{
	public static void main(String args[]){
		File newfile = new File("C:\\jsa\\sub\\bf\\mk");
		
			if(newfile.mkdirs()){
				System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
			}else{
				System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
			}
		
	}
}
