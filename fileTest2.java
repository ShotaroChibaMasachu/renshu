import java.io.File;

class fileTest2{
	public static void main(String args[]){
		File cdirectory = new File("c:\\");
		
		File filelist[] = cdirectory.listFiles();
		for (int i = 0 ; i < filelist.length ; i++){
			if (filelist[i].isFile()){
				System.out.println("[F]" + filelist[i].getName());
			}else if(filelist[i].isDirectory()){
				System.out.println("[D]" + filelist[i].getName());
			}else{
				System.out.println("[�H]" + filelist[i].getName());
			}
			
		}
	}
}