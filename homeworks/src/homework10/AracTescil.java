package homework10;

public class AracTescil {
	
	public AracTescil() {
		
	}
	
	public AracTescil(String plaka, int ruhsatTarihi, String ruhsatSahibi, String aracMarkasi, String aracTipi,
			String aracRengi, String aracTescilDurumu, String aracTescilYeri) {
		
		this.plaka = plaka;
		this.ruhsatTarihi = ruhsatTarihi;
		this.ruhsatSahibi = ruhsatSahibi;
		this.aracMarkasi = aracMarkasi;
		this.aracTipi = aracTipi;
		this.aracRengi = aracRengi;
		this.aracTescilDurumu = aracTescilDurumu;
		this.aracTescilYeri = aracTescilYeri;
	}
	
	
	private String plaka;
	private int ruhsatTarihi;
	private String ruhsatSahibi;
	private String aracMarkasi;
	private String aracTipi;
	private String aracRengi;
	private String aracTescilDurumu;
	private String aracTescilYeri;
	
	
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public int getRuhsatTarihi() {
		return ruhsatTarihi;
	}
	public void setRuhsatTarihi(int ruhsatTarihi) {
		this.ruhsatTarihi = ruhsatTarihi;
	}
	public String getRuhsatSahibi() {
		return ruhsatSahibi;
	}
	public void setRuhsatSahibi(String ruhsatSahibi) {
		this.ruhsatSahibi = ruhsatSahibi;
	}
	public String getAracMarkasi() {
		return aracMarkasi;
	}
	public void setAracMarkasi(String aracMarkasi) {
		this.aracMarkasi = aracMarkasi;
	}
	public String getAracTipi() {
		return aracTipi;
	}
	public void setAracTipi(String aracTipi) {
		this.aracTipi = aracTipi;
	}
	public String getAracRengi() {
		return aracRengi;
	}
	public void setAracRengi(String aracRengi) {
		this.aracRengi = aracRengi;
	}
	public String getAracTescilDurumu() {
		return aracTescilDurumu;
	}
	public void setAracTescilDurumu(String aracTescilDurumu) {
		this.aracTescilDurumu = aracTescilDurumu;
	}
	public String getAracTescilYeri() {
		return aracTescilYeri;
	}
	public void setAracTescilYeri(String aracTescilYeri) {
		this.aracTescilYeri = aracTescilYeri;
	}

}
