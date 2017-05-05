class mozihikaku{
	public static void main(String args[]){
		String str1 = "‚ ‚¢‚¤";
		String str2 = "‚ ‚¢‚¤";
		String str3 = "‚ ‚¢";
		str3 = str3 + "‚¤";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 == str2");
		
		if (str1 == str2){
			System.out.println("“™‚µ‚¢");
		}else{
			System.out.println("“™‚µ‚­‚È‚¢");
		}
		System.out.println("str1 == str3");
		
		if (str1 == str3){
			System.out.println("“™‚µ‚¢");
		}else{
			System.out.println("“™‚µ‚­‚È‚¢");
		}
		
		System.out.println("str1.equals(str3)");
		
		if (str1.equals(str3)){
			System.out.println("“™‚µ‚¢");
		}else{
			System.out.println("“™‚µ‚­‚È‚¢");
		}


		}
}