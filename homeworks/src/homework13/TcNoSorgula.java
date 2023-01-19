package homework13;

import java.util.Scanner;

public class TcNoSorgula {

	public static void main(String[] args) {
		TcNoSorgula sorgu = new TcNoSorgula();
		sorgu.tcSorgula();
	}
	
	public void tcSorgula() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 11 haneli TC Kimlik numaranazi giriniz..: ");
		String girilenTc = scan.nextLine();
		System.out.println(girilenTc.length());
		System.out.println(girilenTc.charAt(girilenTc.length()-1));
		
		
			try {
				if (girilenTc.length()!=11) {
		
				throw new IllegalArgumentException("TC No 11 haneli olmalidir..!");
				}
				
				try {	
					if (Integer.valueOf(girilenTc.substring(10, 11))%2!=0){
					throw new IllegalArgumentException("TC No son basamak cift olmalidir..!");
					
					}
				}
				catch(IllegalArgumentException e){
					System.out.println("Tc Kimlik numaranizin son hanesini tek girdiniz, lutfen tekrar giriniz : ");
					}
				}
				
			catch(IllegalArgumentException e){
		
					System.out.println("TC Kimlik numaranazi eksik ya da fazla girdiniz, lutfen tekrar giriniz : ");
			}
		
			finally {
			
					System.out.println("Girilen TC Kimlik numarasi : "+girilenTc);
		
					scan.close();
			}
	}		
	
}			
				

