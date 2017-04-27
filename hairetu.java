class hairetu{
	public static void main(String args[]){
		int i;
		
		int r;
		
		int result[] = new int[5];
			for (i = 0;i < 5;i++){
				
				r = (int)(5 * Math.random())+1;
			
					switch(r){
					case 1:
					result[i] = r;
					
					break;
					case 2:
					result[i] = r + 10;
					break;
					default:
					result[i] = r + 1000;
					}
				
			}

		for (int j = 0;j < 5; j++){
		System.out.println(result[j]);
		}

		}
	
}
