package homework16;

import java.util.TreeMap;

public class Question1 {
	
	/*
	 * Soru1. TreeMap classini kullanarak nesne uretiniz. Asagidaki hazir metotlarin ne is yaptigini gosteriniz. 
	 * 
	 * 1) ceilingEntry(key); 
	 * 2) descendingKeySet();
	 * 3) firstEntry(); 
	 * 4) floorEntry(key); 
	 * 5) headMap(key);
	 * 6) headMap(key,true); 
	 * 7) tailMap(key); 
	 * 8) tailMap(key,false); 
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer,String> population = new TreeMap<Integer,String>();
		
		population.put(1, "Amsterdam : 905.234");
		population.put(4, "Utrecht   : 361.924");
		population.put(2, "Rotterdam : 656.050");
		population.put(5, "Eindhoven : 238.478");
		population.put(3, "The Hague : 552.995");
		
		System.out.println("===City population of The Netherlands===");
		System.out.println(population);
		
		
		//ceilingEntry(key);
		
		System.out.println("\n//ceilingEntry(key);");		
		System.out.println("===City population of The Netherlands===\n");
		int i = 1;
		while (i<=population.size()) {
			System.out.println(population.ceilingEntry(i));
			i++;
		}
		
		
		//descendingKeySet();
		
		System.out.println("\n//descendingKeySet();");
		System.out.println(population.descendingKeySet());
		
		 
		//firstEntry();
		
		System.out.println("\n//firstEntry();");
		System.out.println(population.firstEntry());
		
		
		//floorEntry(key);
		
		System.out.println("\n//floorEntry(key);");
		System.out.println(population.floorEntry(5));
		
		
		//headMap(key);
		
		System.out.println("\n//headMap(key);");
		System.out.println(population.headMap(4));
		
		
		//headMap(key,true);
		
		System.out.println("\n//headMap(key,true);");
		System.out.println(population.headMap(2, true));
		
		
		//tailMap(key);
		
		System.out.println("\n//tailMap(key);");
		System.out.println(population.tailMap(4));
		
		
		//tailMap(key,false);
		
		System.out.println("\n//tailMap(key,false);");
		System.out.println(population.tailMap(2, false));

	}

}
