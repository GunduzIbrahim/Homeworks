package homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Question4 {
	
	/*
	 * 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin. 
	 * (ListIterator kullanilacak)
	 */

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
		
		ListIterator<Integer> itList = list.listIterator();
		
		while (itList.hasNext()) {
			itList.next();
		}
		
		while(itList.hasPrevious()) {
			int index = itList.previous();
			System.out.print(index+" ");
		}

	}

}
