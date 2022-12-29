package homework6;

public class Bisiklet {
	
	String marka;
	int id;
	String tipi;
	String renk;
	int tekerCapi;
	int uretimYili;
	double fiyat;
	
	
	
	public Bisiklet(){
		
	}


	public Bisiklet(String bisMarka, int bisId, String bisTipi, String bisRenk, int bisTekerCapi, int bisUretimYili, double bisFiyat) {
		
		this.marka = bisMarka;
		this.id = bisId;
		this.tipi = bisTipi;
		this.renk = bisRenk;
		this.tekerCapi = bisTekerCapi;
		this.uretimYili = bisUretimYili;
		this.fiyat = bisFiyat;
	}
	

}