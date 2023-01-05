package homework9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Question2 {
	
	static String dTarihi;
	
	public static void main(String[] args) throws ParseException {
		
		/*
		 * 2.	Kullanicidan dogum tarihini isteyin ve yasini; 
		 * 	a)Gun, ay, yil olarak yasHesapla() static void metodu’ nda, 
		 * 	b)Sade ay olarak ay() non-static void metodu’ nda,
		 *	c)Sadece gun olarak gun() non-static String donuslu method’ unda,
		 * 	hesaplayiniz.
		 */

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen dogum tarihinizi sirasiyla gun-ay-yil olarak giriniz..:(gg-aa-yyyy)");
		dTarihi=scan.next();
		yasHesapla();
		Question2 ay = new Question2();
		Question2 gun = new Question2();
		ay.ay();
		gun.gun();

	}
	public static void yasHesapla() throws ParseException {
		
		SimpleDateFormat tarihFormati = new SimpleDateFormat("dd-MM-yyyy");
		Date tarih = tarihFormati.parse(Question2.dTarihi);
		
		Instant instant = tarih.toInstant(); // tarih toinstant methodu ile instant sinifindan instant objesine atandi
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault()); 
		LocalDate girilenTarih = zone.toLocalDate(); // tarih objesi girilenTarih objesine donusturulmus oldu.
		
		Period period = Period.between(girilenTarih, LocalDate.now()); // girilenTarih ile simdiki tarih araligi alindi ve period'a atandi
		
		System.out.println("yasiniz "+period.getDays()+ " gun " + period.getMonths()+" ay ve " + period.getYears()+" yildir ");
	
	}
	
	public void ay() throws ParseException {
		
		SimpleDateFormat tarihFormati = new SimpleDateFormat("dd-MM-yyyy");
		Date tarih = tarihFormati.parse(Question2.dTarihi);
		
		Instant instant = tarih.toInstant();  
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault()); 
		LocalDate girilenTarih = zone.toLocalDate(); // tarih objesi girilenTarih objesine donusturulmus oldu.
		
		long aylar = ChronoUnit.MONTHS.between(girilenTarih, LocalDate.now()); // girilenTarih ile simdiki tarih araligi alindi ve aylar'a atandi
		
		System.out.println("yasiniz "+aylar+ " aydir ");
		
	}
	
	public String gun () throws ParseException {
		
		SimpleDateFormat tarihFormati = new SimpleDateFormat("dd-MM-yyyy");
		Date tarih = tarihFormati.parse(Question2.dTarihi);
		
		Instant instant = tarih.toInstant(); 
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault()); 
		LocalDate girilenTarih = zone.toLocalDate(); // tarih objesi girilenTarih objesine donusturulmus oldu.
		
		long gunSayisi = ChronoUnit.DAYS.between(girilenTarih, LocalDate.now()); // girilenTarih ile simdiki tarih araligi alindi ve gunler'e atandi
		String gunler = Long.toString(gunSayisi);
		System.out.println("yasiniz "+gunler+ " gundur ");
		
		
		return gunler;
	}
	
	
	
}
