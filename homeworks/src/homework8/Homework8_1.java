package homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Homework8_1 {
	
	public static void elemanCarp () {
		
		int dizi[][] = {{1,2,3}, {4,5,6}};
		int carpim=1;
		
		for (int i = 0; i<dizi.length;i++) {
			
			for (int j = 0;j<dizi[i].length;j++) {
				
				carpim*=dizi[i][j];
				
			}
		}
		System.out.println("dizi elemanlarinin carpimi : "+carpim);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		/*
		 * Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini 
		 * ekrana yazdiran bir method yaziniz.
		 *  { {1,2,3}, {4,5,6} }
		 */
		System.out.println();
		System.out.println("Soru1)");
		System.out.println();
		
		elemanCarp();
		
		
		/*
		 * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin 
		 * carpimini ekrana yazdiran bir program yaziniz. { {1,2,3}, {4,5}, {6} }
		 */
		System.out.println();
		System.out.println("Soru2)");
		System.out.println();
		int duzensizDizi [][]= { {1,2,3}, {4,5}, {6} };
		int duzensizCarpim=1;
		
		for (int i=0;i<duzensizDizi.length;i++) {
				
			duzensizCarpim*=duzensizDizi[i][duzensizDizi[i].length-1];
		}
		
		System.out.println("duzensizDizi dizisinin indekslerinin son elemanlari carpimi : "+duzensizCarpim);
		
		
		/*
		 * Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde 
		 * ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz.
		 * arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		 */
		System.out.println();
		System.out.println("Soru3)");
		System.out.println();
		int [][] arr1 = { {1,2}, {3,4,5}, {6} } , arr2 = { {7,8,9}, {10,11}, {12} };
		
		for(int i=0; i<3;i++) {
			if (arr1[i].length==arr2[i].length) {
				int arr1IndeksTop[]=arr1[i];
				int arr2IndeksTop[]=arr2[i];
				int arr1_2_IndeksTop=0;
					for(int sayac:arr1IndeksTop) {
						arr1_2_IndeksTop+=sayac;
					}
					for(int sayac:arr2IndeksTop) {
						arr1_2_IndeksTop+=sayac;
					}
				System.out.println("arr1 ve arr2 dizilerinin "+i+". indeks elemanlari esit ve toplamlari..: "+arr1_2_IndeksTop);
			}
			else
				System.out.println("arr1 ve arr2 dizilerinin "+i+". indeks elemanlari esit degil");
		}
		
		//Grup toplantisinda soruyu yanlis anladigim degerlendirilip tarafimca tekrar cozumlendi.
		System.out.println();
		System.out.println("Soru3)(tekrar yapilan kisim)");
		System.out.println();
		//int [][] arr1 = { {1,2}, {3,4,5}, {6} } , arr2 = { {7,8,9}, {10,11}, {12} };

		int toplam;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					for (int l = 0; l < arr2[k].length; l++) {

						if ((i == k) && (j == l)) {

							toplam = arr1[i][j] + arr2[k][l];
							System.out.println("" + arr1[i][j] + " + " + arr2[k][l] + " = " + toplam);
						}
					}
				}

			}
		}
		
		/*
		 * Soru4) Asagidaki multidimensional array’in ic array’lerindeki 
		 * tum elemanlarin toplamini birer birer bulan ve herbir sonucu 
		 * yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir program yaziniz.
		 * Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}
		 */
		System.out.println();
		System.out.println("Soru4)");
		System.out.println();
		int array[][] = {{1,2,3},{4,5},{6,7}}, yeniArray[]=new int[3];
		
		int arrayIndeksTop=0;
		for(int i=0;i<3;i++) {
			int arrayIndeks[]=array[i];
			for(int sayac:arrayIndeks) {
				arrayIndeksTop+=sayac;
				yeniArray[i]=arrayIndeksTop;
			}
			arrayIndeksTop=0;
		}
		System.out.println("{{1,2,3},{4,5},{6,7}} dizisinin indeksleri toplanmis hali: "+Arrays.toString(yeniArray));
		
		/*
		 * Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
		 */
		System.out.println();
		System.out.println("Soru5)");
		System.out.println();
		
		String cumle;
		System.out.println("Lutfen bir cumle yazip enter'a basin..: ");
		cumle = scan.nextLine();
		
			String kelimeDizisi[]=cumle.split(" ");	
				System.out.println("Girdiginiz cumledeki kelimeler : "+Arrays.toString(kelimeDizisi));
				int kelimeSayisi=kelimeDizisi.length;
				System.out.println("Girdiginiz cumledeki kelimelerin adedi : "+kelimeSayisi);
		
	}	
}
