package homework11;

public class Muhasebe extends Personel{
	
	public int saatlikUcret;
	public String statu;
	public int maas;
	
	public Muhasebe () {
		
		super();
	}
	
	public Muhasebe(int id, String isim, String soyIsim, String adres, String telefon, int saatlikUcret, String statu, int maas) {
		super(id, isim, soyIsim, adres, telefon);
		this.saatlikUcret = saatlikUcret;
		this.statu = statu;
		this.maas = maas;
	}



	public int maasHesapla() {
		
		int aylik = (saatlikUcret*8)*30;
		return aylik;
	}
}

