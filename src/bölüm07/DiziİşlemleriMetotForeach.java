package bölüm07;

import java.util.Arrays;
import java.util.Scanner;

public class DiziİşlemleriMetotForeach {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunluğu = 10;
		int[] dizi = new int[dizininUzunluğu];

			
		
		diziyiRassalSayılarlaDoldur(dizi);
		
		diziyiYazdır(dizi);	
		System.out.println();
		
		dizininToplamınıBul(dizi);

		dizininEnBüyükElemanınıVeİndeksiniBul(dizi);

		diziyiKarıştır(dizi);
		System.out.println();
		
		diziyiYazdır(dizi);
		
		diziyiSolakaydır(dizi);
		System.out.println();
		
		diziyiYazdır(dizi);
	}
	public static void diziyiSolakaydır(int[] dizi) {
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
	}

	public static void diziyiKarıştır(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int rassalİndex = (int) (Math.random() * dizi.length);
			int geçici = dizi[i];
			dizi[i] = dizi[rassalİndex];
			dizi[rassalİndex] = geçici;
		}
	}

	public static void dizininEnBüyükElemanınıVeİndeksiniBul(int[] dizi) {
		int enBüyükEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enBüyükEleman < dizi[i]) {
				enBüyükEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en büyük elemanı : " + enBüyükEleman);
		System.out.println("Dizinin en büyük elemanın indexi : " + index);
	}

	public static void dizininToplamınıBul(int[] dizi) {
		int toplam = 0;
		for (int sayı : dizi) {
			toplam += sayı;
		}
		System.out.println("Dizideki elemanların toplamı : " + toplam);
	}

	public static void diziyiYazdır(int[] dizi) {
		int satırSayacı = 0;
		for (int sayı : dizi) {
			satırSayacı ++;
			System.out.printf("%3d", sayı);
			if (satırSayacı % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static void diziyiRassalSayılarlaDoldur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}

}
