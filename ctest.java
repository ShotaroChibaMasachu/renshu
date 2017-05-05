class ctest{
	public static void main(String args[]){
		tele tv = new tele();
		
		tv.setPlace("‹ŠÔ");
		
		tv.setChannel(3);
		
		tv.dispChannel();
	}
}

class tele{
	int channelNo;
	String place;
	
	void setChannel(int newChannelNo){
		channelNo = newChannelNo;
	}
	
	void setPlace(String newPlace){
		place = newPlace;
	}
	
	void dispChannel(){
		System.out.println(place + "‚É‚ ‚éƒ`ƒƒƒ“ƒlƒ‹" + channelNo);
	}
}
