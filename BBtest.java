import java.math.BigDecimal;

class BBtest{
	public static void main(String args[]){
		BigDecimal one = new BigDecimal("1.10");
		BigDecimal two = new BigDecimal("2.20");
		BigDecimal thr = new BigDecimal("3.30");
		
		//足し算
		BigDecimal tasu = one.add(two);
		//引き算
		BigDecimal hiku = two.subtract(one);
		//掛け算
		BigDecimal kake = one.multiply(two);
		//割り算 1/3で小数第三位で四捨五入
		BigDecimal waru = one.divide(thr,2,BigDecimal.ROUND_HALF_UP);
		
		System.out.println(tasu + "\n" + hiku +  "\n" + kake +  "\n" + waru);
		
		//出力テスト
		System.out.println(one);
		one = one.add(two);
		System.out.println(one);
		one = one.subtract(two);
		System.out.println(one);
		
		//丸め方法試し
		int p = 2;
		BigDecimal a = new BigDecimal("12.3450");
		BigDecimal b = a.setScale(p,BigDecimal.ROUND_CEILING);
		BigDecimal c = a.setScale(p,BigDecimal.ROUND_DOWN);
		BigDecimal d = a.setScale(p,BigDecimal.ROUND_FLOOR);
		BigDecimal f = a.setScale(p,BigDecimal.ROUND_HALF_DOWN);
		BigDecimal g = a.setScale(p,BigDecimal.ROUND_HALF_UP);
		BigDecimal h = a.setScale(p,BigDecimal.ROUND_UP);
		BigDecimal i = a.setScale(p,BigDecimal.ROUND_HALF_EVEN);
		
		System.out.println("精度" + p + "の場合");
		System.out.println(a + "\n_CEILING" + b + "\n_DOWN" + c + "\n_FLOOR" + d + "\n_HALF_DOWN" + f + "\n_HALF_UP" + g + "\n_UP" + h+"\n_HALF_EVEN"+i);
		
		
		//
	}
}
