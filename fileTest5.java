import java.io.File;

class fileTest5{
	public static void main(String args[]){
		File newfile = new File("C:\\jsa\\sub");
		
			if(newfile.mkdir()){
				System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
			}else{
				System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
			}
		
	}
}
