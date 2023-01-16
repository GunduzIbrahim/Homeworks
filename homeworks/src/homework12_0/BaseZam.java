package homework12_0;

import java.util.Scanner;

public class BaseZam {
	public double zamHesapla (double maas) {
		double zamliMaas = maas + (maas * 0.10);
		return zamliMaas;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen zammi hesaplanacak maas miktarini giriniz..: ");
		double girilenMaas = scan.nextDouble();
		
		System.out.println("Lutfen zamli maasi hesaplanacak personel unvanini kucuk harflerle giriniz  :");
		String unvan = scan.next();
		for(;;) {
		switch (unvan) {
		case "personel": BaseZam zamliPersMaas = new PersonelZamliMaas();
						System.out.println("\nPersonele zamli odenecek maas : "+zamliPersMaas.zamHesapla(girilenMaas)+" TL'dir");
						break;
		case "ustabasi": BaseZam zamliUstaMaas = new UstaBasiZamliMaas();
						System.out.println("\nUstabasina zamli odenecek maas : "+zamliUstaMaas.zamHesapla(girilenMaas)+" TL'dir");
						break;
		case "isci"	   : BaseZam zamliIsciMaas = new IsciZamliMaas();
						System.out.println("\nIsciye zamli odenecek maas : "+zamliIsciMaas.zamHesapla(girilenMaas)+" TL'dir");
						break;
						
		
		
		default :			System.out.println("Gecersiz bir giris yaptiniz.");
		
						System.out.println("\nLutfen tekrar zamli maasi hesaplanacak personel "
														+ "unvanini kucuk harflerle giriniz  :");
						unvan = scan.next();
						continue;
		} break;
		}
	
	}

}
class PersonelZamliMaas extends BaseZam {
	public double zamHesapla (double maas) {
		double zamliMaas = maas + (maas * 0.20);
		return zamliMaas;
	}
}
class UstaBasiZamliMaas extends BaseZam {
	public double zamHesapla (double maas) {
		double zamliMaas = maas + (maas * 0.18);
		return zamliMaas;
	}
}
class IsciZamliMaas extends BaseZam {
	public double zamHesapla (double maas) {
		double zamliMaas = maas + (maas * 0.15);
		return zamliMaas;
	}
}

