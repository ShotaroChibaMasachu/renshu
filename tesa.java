import java.util.Calendar;

class tesa{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		System.out.println("������" + month + "��" + day + "�ł��B");
	}
	
}
