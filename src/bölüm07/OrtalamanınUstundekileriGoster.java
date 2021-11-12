package bölüm07;

import java.util.Scanner;

public class OrtalamanınUstundekileriGoster {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalama alınması için kaç sayıyı girmek istiyorsunuz");
		
		int dongüSayısı = scan.nextInt();
		double toplam = 0;
		double[] dizi = new double[dongüSayısı];
		
		for (int i = 0; i < dongüSayısı; i++) {
			System.out.println("Lütfen bir sayı giriniz");
			dizi[i] = scan.nextDouble();
			toplam += dizi[i];
		}
		int ortalamadanBüyüklerSayacı = 0;
		double ortalama = (toplam / dongüSayısı);
		for (int i = 0; i < dongüSayısı; i++) {
			if(dizi[i] > ortalama) {
				ortalamadanBüyüklerSayacı ++;
			}
			
		}
		System.out.println(ortalama);
		System.out.println(ortalamadanBüyüklerSayacı + " tane sayı ortalamadan büyüktür");
	}

}
