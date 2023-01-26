package homework15;

import java.util.Scanner;

public class OtomobilOlustur implements StandartOzellikler {
	
	
	@Override
	public void sunroof(char sec) {
		switch(sec) {
		case 'e':System.out.print("Var"); break;
		case 'h':System.out.print("Yok"); break;
		default :System.out.print("Gecersiz secim..!");
		}
	}
	
	@Override
	public void metalikRenk(char sec) {
		
		switch(sec) {
		case 'e':System.out.print("Var"); break;
		case 'h':System.out.print("Yok"); break;
		default :System.out.print("Gecersiz secim..!");
		}
		
	}

	@Override
	public void bodyKit(char sec) {
		
		switch(sec) {
		case 'e':System.out.print("Var"); break;
		case 'h':System.out.print("Yok"); break;
		default :System.out.print("Gecersiz secim..!");
		}
		
	}

	@Override
	public void celikJant(char sec) {
		
		switch(sec) {
		case 'e':System.out.print("Var"); break;
		case 'h':System.out.print("Yok"); break;
		default :System.out.print("Gecersiz secim..!");
		}
		
	}

	@Override
	public void multimedia(char sec) {

		switch(sec) {
		case 'e':System.out.print("Var\n"); break;
		case 'h':System.out.print("Yok\n"); break;
		default :System.out.print("Gecersiz secim..!");
		}
		
	}
	
	void sedanArac() {
		Scanner scan = new Scanner(System.in);
		
		OtomobilOlustur yeniOto = new OtomobilOlustur();
		
		System.out.println("Otomobilinizin motor secimi ? (elektrik/benzin)");
		char motSecim = scan.next().charAt(0);
		System.out.println("Otomobilinizin sanziman secimi ? (otomatik/manuel)");
		char sanzmnSecim = scan.next().charAt(0);		
		System.out.println("Aracta sunroof secimi ? (evet/hayir)");
		char sunSecim = scan.next().charAt(0);
		System.out.println("Metalik renk secimi ? (evet/hayir)");
		char metSecim = scan.next().charAt(0);
		System.out.println("Aracta bodykit secimi ? (evet/hayir)");
		char bodySecim = scan.next().charAt(0);
		System.out.println("Celik jant secimi ? (evet/hayir)");
		char jantSecim = scan.next().charAt(0);
		System.out.println("Aracta multimedia secimi ? (evet/hayir)");
		char multiSecim = scan.next().charAt(0);
		System.out.println("===== Secilen "+ MainOtomobil.kasa.toUpperCase()+" aracin ozellikleri=====\n");
		System.out.println("Arac Sasi No     : " + MainOtomobil.sasiNo());
		System.out.print("Motor            : ");
		yeniOto.motorSec(motSecim);
		System.out.print("\nSanziman Tipi    : ");
		yeniOto.sanziman(sanzmnSecim);
		System.out.print("\nTekerlek Sayisi  : ");
		yeniOto.tekerlekSayisi();
		System.out.print("\nABS Fren Sistemi : ");
		yeniOto.absFrenSistemi();
		System.out.print("\nKoltuk Dosemesi  : ");
		yeniOto.koltukDoseme();
		System.out.print("\nBagaj Hacmi      : ");
		yeniOto.bagajHacmi();
		System.out.print("\nIklimlendirme    : ");
		yeniOto.iklimlendirme();
		System.out.print("\nSunroof          : ");
		yeniOto.sunroof(sunSecim);
		System.out.print("\nMetalik  Renk    : ");
		yeniOto.metalikRenk(metSecim);
		System.out.print("\nBodyKit          : ");
		yeniOto.bodyKit(bodySecim);
		System.out.print("\nCelik Jant       : ");
		yeniOto.celikJant(jantSecim);
		System.out.print("\nMultimedia       : \n");
		yeniOto.multimedia(multiSecim); 
		
	}
	
	void sporArac() {
		
		OtomobilOlustur yeniOto = new OtomobilOlustur();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Otomobilinizin motor secimi ? (elektrik/benzin)");
		char motSecim = scan.next().charAt(0);
		System.out.println("Otomobilinizin sanziman secimi ? (otomatik/manuel)");
		char sanzmnSecim = scan.next().charAt(0);
		System.out.println("Aracta sunroof secimi ? (evet/hayir)");
		char sunSecim = scan.next().charAt(0);
		System.out.println("Metalik renk secimi ? (evet/hayir)");
		char metSecim = scan.next().charAt(0);
		System.out.println("Aracta bodykit secimi ? (evet/hayir)");
		char bodySecim = scan.next().charAt(0);
		System.out.println("Celik jant secimi ? (evet/hayir)");
		char jantSecim = scan.next().charAt(0);
		System.out.println("Aracta multimedia secimi ? (evet/hayir)");
		char multiSecim = scan.next().charAt(0);
		System.out.println("===== Secilen "+ MainOtomobil.kasa.toUpperCase()+" aracin ozellikleri=====\n");
		System.out.println("Arac Sasi No     : " + MainOtomobil.sasiNo());
		System.out.print("Motor Tipi       : ");
		yeniOto.motorSec(motSecim);
		System.out.print("\nSanziman Tipi    : ");
		yeniOto.sanziman(sanzmnSecim);
		System.out.print("\nTekerlek Sayisi  : ");
		yeniOto.tekerlekSayisi();
		System.out.print("\nABS Fren Sistemi : ");
		yeniOto.absFrenSistemi();
		System.out.print("\nKoltuk Dosemesi  : ");
		yeniOto.koltukDoseme();
		System.out.print("\nBagaj Hacmi      : ");
		yeniOto.bagajHacmi();
		System.out.print("\nIklimlendirme    : ");
		yeniOto.iklimlendirme();
		System.out.print("\nSunroof          : ");
		yeniOto.sunroof(sunSecim);
		System.out.print("\nMetalik  Renk    : ");
		yeniOto.metalikRenk(metSecim);
		System.out.print("\nBodyKit          : ");
		yeniOto.bodyKit(bodySecim);
		System.out.print("\nCelik Jant       : ");
		yeniOto.celikJant(jantSecim);
		System.out.print("\nMultimedia       : ");
		yeniOto.multimedia(multiSecim); 

	}
	
	
	@Override
	public void tekerlekSayisi() {
		System.out.print("4+1");
		
	}
	@Override
	public void absFrenSistemi() {
		System.out.print("Var");
		
	}
	@Override
	public void koltukDoseme() {
		
		System.out.print("Kumas");

	}
	@Override
	public void bagajHacmi() {
		
		System.out.print("200 lt");
		}
		
	@Override
	public void iklimlendirme() {
		System.out.print("Var");
		
	}
	
	public void motorSec(char sec) {
		
		switch(sec) {
		case 'e': System.out.println("Elektrikli "); elektrikMotor(); regulator(); aku();  break;
		case 'b': System.out.println("Benzinli "); motor(); enjeksiyon();yakitDeposu();    break;
		default : System.out.print("Gecersiz secim..!");
		}
	}
	
	public void motor() {
		
		System.out.println("Motor Hacmi      : 1.6 lt ");
	
	}
	
	public void enjeksiyon() {
		System.out.println("Enjeksiyon       : Var");
		
	}
	void yakitDeposu() {
		System.out.print("Yakit deposu     : 65 lt");		
	}
	
	void elektrikMotor() {
		System.out.println("Motor Gucu       : 300 kWh ");
		
	}
	void regulator() {
		System.out.println("Regulator durumu : Var ");
		
	}
	void aku() {
		System.out.print("Elektrik Akusu   : 210 Ah");
	}
	void sanziman(char sec) {
		switch(sec) {
		case 'o': otoSanziman(); otoDiferansiyel(); break;
		case 'm': duzSanziman(); duzDiferansiyel(); break;
		default :System.out.print("Gecersiz secim..!");
		}
		
	}
	
	void otoSanziman() {
		System.out.println("Otomatik vites 7 ileri, ");
		
	}
	void otoDiferansiyel() {
		System.out.print("Diferansiyel     : Onden cekisli");
		
	}
	void duzSanziman() {
		System.out.println("Manuel vites 5 ileri, ");
		
	}
	void duzDiferansiyel() {
		System.out.print("Diferansiyel     : Onden cekisli");
		
	}
}
