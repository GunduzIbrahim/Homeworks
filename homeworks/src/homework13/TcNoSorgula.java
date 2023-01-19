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
//		System.out.println(girilenTc.length());
//		System.out.println(girilenTc.charAt(girilenTc.length()-1));
		
		
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
					System.out.println("\nTC Kimlik numaranizin son hanesini tek sayi girdiniz, lutfen tekrar giriniz : ");
					e.printStackTrace();
					}
				}
				
			catch(IllegalArgumentException e){
		
					System.out.println("\nTC Kimlik numaranazi eksik ya da fazla girdiniz, lutfen tekrar giriniz : ");
					e.printStackTrace();
			}
		
			finally {
			
					System.out.println("\nGirilen TC Kimlik numarasi : "+girilenTc);
		
					scan.close();
			}
	}		
	
}			
				

