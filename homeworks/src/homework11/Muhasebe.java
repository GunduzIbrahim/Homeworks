package homework11;

public class Muhasebe extends Personel{
	
	public int saatlikUcret;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		
		int aylik = (saatlikUcret*8)*30;
		return aylik;
	}
}

