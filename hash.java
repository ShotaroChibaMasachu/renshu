import java.util.HashMap;

class hash{
	public static void main(String args[]){
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("りんご","アップル");
		map.put("バナナ","バナナマン");
		
		if (map.containsKey("りんご")){
			System.out.println(map.get("りんご"));
		}else{
			System.out.println("指定したキーが存在しません");
		}
	}
}