package bölüm03;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90) + 10;//10<=piyangosayısı<100 elde ettik
		
		System.out.println("Lütfen 2 basamaklı tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		int tahmin = klavye.nextInt();
		int tahminBirlerBasamağı = tahmin % 10;
		int tahminOnlarBasamağı = tahmin / 10;
		int piyangoBirlerBasamağı = piyango % 10;
		int piyangoOnlarBasamağı = piyango / 10;
		
		System.out.println("Piyango numarası : " + piyango);
		
		if (tahmin == piyango) {
			System.out.println("Tebriler 10000 tl kazandınız");
		} else if(tahminBirlerBasamağı == piyangoOnlarBasamağı
				&& tahminOnlarBasamağı == piyangoBirlerBasamağı ) {
			System.out.println("tebrikler 3000 tl kazandınız");
		} else if(tahminBirlerBasamağı == piyangoBirlerBasamağı
				|| tahminBirlerBasamağı == piyangoOnlarBasamağı
				|| tahminOnlarBasamağı == piyangoBirlerBasamağı
				|| tahminOnlarBasamağı == piyangoOnlarBasamağı) {
			System.out.println("tebrikler 1000 tl kazandınız");
		} else {
			System.out.println("malaesef kazamadınız :((");
		}
		
	}

}
