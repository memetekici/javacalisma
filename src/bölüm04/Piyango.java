package bölüm04;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		String piyango = "" +(int)((Math.random() * 90) + 10);//String elde ettik
		
		System.out.println("Lütfen 2 basamaklı tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		String tahmin = klavye.next();
		
		char piyangoBirlerBasamağı = piyango.charAt(1);
		char piyangoOnlarBasamağı = piyango.charAt(0);
		
		char tahminBirlerBasamağı = tahmin.charAt(1);
		char tahminOnlarBasamağı = tahmin.charAt(0);
		
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
