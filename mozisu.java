class mozisu{
	public static void main(String args[]){
		System.out.println(args[0].length());
		System.out.println(args[0].substring(1,3));
		System.out.println(args[0].trim());
		String[] ttt = args[0].split("p",-1);
			for (int i = 0; i < ttt.length;i++){
				System.out.println(ttt[i]);
			}
			
		int eee;
		eee = Math.pow(2,3);
		System.out.println(eee);
	}
}