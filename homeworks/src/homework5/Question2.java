package homework5;

public class Question2 {

	public static void main(String[] args) {
		
		/*
		 * 2) ”InfotechAcademy1234…!’^.+” String ifadesinde,
		 * a.	kac harf
		 * b.	kac rakam
		 * c.	kac ozel karakter oldugunu ekrana yazdıran karakterSay() metodunu yazınız.
		 */
		
		karakterSay();

	}
	public static void karakterSay() {
		
		String metin = "InfotechAcademy1234…!’^.+";
		char [] karakterler = metin.toCharArray();
		int harfSayisi=0, rakamSayisi=0, ozelkarakterSayisi=0;
		
		for (int i=0; i<metin.length();i++) {
			
			if (Character.isLetter(karakterler[i])) {
				harfSayisi++;
			}
			else if (Character.isDigit(karakterler[i])) {
				rakamSayisi++;
			}
			else 
				ozelkarakterSayisi++;
		
		}
		
		System.out.println("Yukaridaki ifadede bulunan harf sayisi..: " + harfSayisi);
		System.out.println("Yukaridaki ifadede bulunan rakam sayisi..: " + rakamSayisi);
		System.out.println("Yukaridaki ifadede bulunan ozel karakter sayisi..: " + ozelkarakterSayisi);
	}

}