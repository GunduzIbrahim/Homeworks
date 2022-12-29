package homework4;

public class Question1 {

	public static void main(String[] args) {

		/*
		 * Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” string
		 * ifadesini “Java ogrenmek cok guzel.” sekline getirin.
		 * 
		 * 
		 */
		
		/*
		 	s bosluk (
			\\S bosluk disindaki tum karakterler
			\\w harfler ve rakamlar (a z A Z, 0 9
			\\W harfler ve rakamlar disindaki tum karakterler
			\\d rakamlar 0 9
			\\D rakamlar disindaki tum karakterler
		 
		 */

		String metin = " Java ogrenmek123 Cok guzel@ ";
		metin = metin.trim();
		metin = metin.replaceAll("\\d","");
		metin = metin.replace("C", "c");
		metin = metin.replace("@", ".");
		metin = metin.substring(0, 23);

		System.out.println(metin);
	}

}