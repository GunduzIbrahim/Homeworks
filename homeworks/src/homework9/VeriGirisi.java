package homework9;


import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class VeriGirisi {

	public static void main(String[] args) throws ParseException {

		/*
		 * 1.	Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin 
		 * bilet satis programina bir ek program yazmaniz istendi. 
		 * Kalkis Tokyo ve inis Kahire sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati istenecek, 
		 * Tokyo saatiyle kalkis saati ve tarihi, Kahire saatiyle inis saati ve tarihi verilecek. 
		 * (Kullanicidan istenilen bilgileri “VeriGirisi” adiyla olusturulmus class’ tan alinip 
		 * “Sonuc” adiyla olusturulmus class icinde olusturacaginiz static bir method’ tan kullaniciya sunulacaktir.)
		 */
		
		Scanner scan = new Scanner (System.in);
		String girilenTarih, girilenSaat;
		LocalTime time = null;
		LocalDate date = null;
		
//		System.out.println("Lutfen seyahat tarihinizi ve sonra saatinizi belirtilen formatta giriniz.(yyyy-mm-dd hh:mm) :");
//		girilenTarih = scan.nextLine();
//		girilenSaat = scan.nextLine();
//		System.out.println(girilenTarih+ " " +girilenSaat);
		
		LocalDateTime thisCity = LocalDateTime.now();
		System.out.println(thisCity);
		Sonuc.sonuc();
		
	}
}

class Sonuc {
	
	public static void sonuc(){
		
		LocalTime time = null;
		
		
		LocalDate tokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		LocalDate kahire = LocalDate.now(ZoneId.of("Africa/Cairo"));
		System.out.println("\nTokyo saati ile kalkis saati : "+tokyo +" "+ time.now(ZoneId.of("Asia/Tokyo"))+"\n");
		System.out.println("Kahire saatiyle inis saati : "+kahire +" "+ time.now(ZoneId.of("Africa/Cairo")));
//		System.out.println(time.now(ZoneId.of("Asia/Tokyo")));
//		System.out.println(time.now(ZoneId.of("Africa/Cairo")));
		
		
	}
}

	
