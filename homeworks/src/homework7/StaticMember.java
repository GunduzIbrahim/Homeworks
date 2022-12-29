package homework7;


	
	/*
	 * 3) Asagida verilmis olan sayifalardaki kodlari inceleyin, sonuclari tahmin edin, 
	 * daha sonra bu kodlari eclipse’ te yazarak dogru sonucu consol’ a yazdirin. 
	 * Tahmininiz ile gercek sonucu karsilastirin. 
	 * Yalnis tahmin yaptiysaniz sebebini kendi kendinize bulmaya calisin, 
	 * bulamazsaniz grup toplantinizda arkadaslarinizla ve mentorlerinizle birlikte inceleyiniz. 
	 */

public class StaticMember{
	
	static int x;
	int y;
	
	StaticMember(){
		
		x+=2;
		y++;
	}
	static int getSquare() {
		
		return x*x;
	}
	public static void main (String[] args) {
		
		StaticMember sm1 = new StaticMember();
		
		StaticMember sm2 = new StaticMember();
		
		int z = sm1.getSquare();
		
		System.out.print("-x"  + z + "-y" + sm2.y);
	}
}
