class brl{
	public static void main(String args[]){
		int i;
		int j;
		int r;
			saisyo:for (i = 0;i < 2;i++){
				tugi:for (j = 0;j < 2;j++){
				
				r = (int)(5 * Math.random())+1;
			
					switch(r){
					case 1:
					System.out.println("1‚Å‚·B");
					
					break saisyo;
					case 2:
					System.out.println("2‚Å‚·B");
					break tugi;
					default:
					System.out.println(r);
					}
				}
			}

		}
	
}
