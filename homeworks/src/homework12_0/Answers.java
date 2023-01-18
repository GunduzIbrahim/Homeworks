package homework12_0;

	// Answers
	
	
	/*
	 * 1) public class test01'de bulunan getDetails methodu int donuslu oldugundan int yerine void yazilmali,
	 * daha sonra return silinmeli. Console'da : Derived class GFG yazacaktir.
	 * 
	 * 
	 * 2) public class test02'de bulunan getDetails methodu protected olarak tanimlandigi icin override olabilmesi
	 * icin public olarak degistirilmeli. Console'da : Test class yazacaktir.
	 * 
	 * 
	 * 3) Console'da ilk satirda Test class, ikinci satirda super()'den dolayi Console'da : Derived class yazar.
	 * 
	 * 
	 * 4) Derived04 classíndaki getDetails() methodu override olabilmesi icin final olarak tanimlanamaz. o yuzden final
	 *  kaldirilmali. Console'da : Derived class yazacaktir.
	 *  
	 *  
	 * 5) Student class'inin constructor'u referans alinarak Person class'indan olusturulan p objesi Student class'indaki
	 *  methodu cagirir ve Console'da : Second Program yazar.
	 *  
	 *  
	 * 6) Console'da : ilk satirda C class'inin icindeki create() methodu ile kucuk c harfi, ikinci satirda D class'inin
	 *  icinde bulunan update medhodu U class'indaki update() methodu private oldugundan override olmadan direkt olarak 
	 *  kendi icinde update() methodu oldugu icin buyuk U harfi, ucuncu satirda R class'inin icindeki read() methodu
	 *  sayesinde buyuk R harfi, son satirda ise D class'inin icinde bulunan delete() methodu calisarak buyuk D
	 *  harfi ekrana yazar.
	 *  
	 *  
	 * 7) Console'da : ilk olarak Super class'indan sooper objesi ile yine Super class'da bulunan getLength() methodu
	 * cagirilarak ekrana 4 yazar ve araya ',' koyar, son olarak da Test07 class'indan olusturulan sub objesi ile
	 * yine Test07 class'inda override edilen getLength() methodu ile ekrana 5 yazar. Console : 4, 5
	 * 
	 * 
	 * 8) ilk olarak Y class'indan olusturulan y objesi ile Y class'indaki m2() methodu cagirilarak 
	 *  ekrana "m2, Y class" yazar, ikinci olarak X class'indan olusturulan x objesi ile X class'indaki m1() methodu
	 *  cagirilarak ekrana "m1, X class" yazar, ucuncu olarak y objesi ile override edilen Y class'inaki m1() methodu
	 *  cagirilarak ekrana ""m1, Y class" yazar, son olarak da x=y atamasindan dolayi x objesine y objesinin degeri 
	 *  atandigindan, referansi zaten override edilen m1() methodu calisacagindan ekrana "m1, Y class" yazar.
	 * 
	 *    
	 * 9) Computer class'indan mouse objesi olusturulmus ancak Laptop class'i referans alindigindan, ekrana yazdirma 
	 * komutunda cagirian getValue() methodu icin once Laptop class'ina bakilir Laptop class'i Computer class'ina
	 * extends edildiginden burada ayni method olsa bile Computer class'i da NoteBook class'ina extends edildiginden
	 * buraya da bakilir yine ayni method olsa da en son override islemi kendi classínda oldugundan kendi class'indaki
	 * getValue() methodu cagirilir ve ekrana 200-100, 100 yazar.
	 * 
	 *  
	 * 10)ilk olarak M class'indan olusturulan m objesi kendi class'indan referans alinarak olusturuldugu icin kendi
	 * class'indaki methodu cagirarak ekrana 3*3 yani; {3, 9}~ yazar, sonra yine M class'indan olusturulan n objesi yine kendi 
	 * class'i refereans alindigi icin kendi class'indaki override edilen methodu cagirarak ekrana 3+3 yani; {3, 6}~ yazar, son olarak
	 * O class'indan olusturulan oo objesi kendi class'i referans gosterildigi icin kendi class'indaki override edilen
	 * methodu cagirarak 3*2 yani; {3, 6}~ yazar. 
	 */


