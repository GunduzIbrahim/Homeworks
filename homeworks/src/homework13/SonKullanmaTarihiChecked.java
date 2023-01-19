package homework13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SonKullanmaTarihiChecked {

	public static void main(String[] args) throws UrunKontrolCheckedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urunun son kullanma tarihini gg/aa/yyyy seklinde girin : ");
		String girilenTarih = scan.nextLine();
		urunSonKulTar(girilenTarih);
		scan.close();
	}
	
	public static void urunSonKulTar(String tarih) throws UrunKontrolCheckedException {
		DateTimeFormatter duzenliTarih = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate bugun = LocalDate.now();
		System.out.println(duzenliTarih.format(bugun));
		LocalDate stringTarih = LocalDate.parse(tarih, duzenliTarih);
		
		if ((stringTarih.isAfter(bugun))||(stringTarih.isEqual(bugun))) {
			
			
			 Period zamanFarki = Period.between(bugun, stringTarih);
			 System.out.println("Urunun son kullanma tarihine "
					 		+zamanFarki.getYears()+" yil,"+zamanFarki.getMonths()+" ay ve "
					 			+zamanFarki.getDays()+" gun vardir");
		}
		else {
			throw new UrunKontrolCheckedException("!!!Urunun son kullanma tarihi gecmis..!!!");
		}
	}
}
