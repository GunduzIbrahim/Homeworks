package homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question3 {
	/*
	 * 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz … 
	 * (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
	 * Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
	 * output: [23,40]  (Iterator kullanilacak)

	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
		Iterator<Integer> itList = list.iterator();
		System.out.println(list);
		int index = 0;
		while (itList.hasNext()) {
			index = itList.next();
			if (index<=20 || index>40) {
				itList.remove();
			}
		}
		System.out.println(list);
		
	 }

}
