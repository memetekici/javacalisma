package bölüm08;

public class İkiBoyutluDiziİşlemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerlerdeDoldur(ikiBoyutluDizi);
		diziyiYazdır(ikiBoyutluDizi);
		dizininElemanlarınıTopla(ikiBoyutluDizi);
		dizininSütunlarındakiElemanlarınToplamı(ikiBoyutluDizi);
		dizininHangiSatırınınToplamıDahaBüyüktür(ikiBoyutluDizi);
		ikiBoyutluDiziyiKar(ikiBoyutluDizi);
		diziyiYazdır(ikiBoyutluDizi);
	}


	public static void rassalDegerlerdeDoldur(int[][] ikiBoyutluDizi) {
		for (int satır = 0; satır < ikiBoyutluDizi.length; satır++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satır].length; sütun++) {
				ikiBoyutluDizi[satır][sütun] = (int) (Math.random() * 100);
			}
		}
	}

	public static void diziyiYazdır(int[][] ikiBoyutluDizi) {
		for (int satır = 0; satır < ikiBoyutluDizi.length; satır++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satır].length; sütun++) {
				System.out.printf("%3d", ikiBoyutluDizi[satır][sütun]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		for (int[] w : ikiBoyutluDizi) {
			for (int k : w) {
				System.out.printf("%3d", k);
			}
			System.out.println();
		}

	}

	private static void dizininElemanlarınıTopla(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int satır = 0; satır < ikiBoyutluDizi.length; satır++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satır].length; sütun++) {
				toplam += ikiBoyutluDizi[satır][sütun];
			}
		}
		System.out.println("Dizideki elemanların toplamı " + toplam);

		int toplamForEach = 0;

		for (int[] w : ikiBoyutluDizi) {
			for (int k : w) {
				toplamForEach += k;
			}

		}
		System.out.println("Dizideki elemanların toplamı for each ile " + toplamForEach);
	}

	private static void dizininSütunlarındakiElemanlarınToplamı(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int i = 0; i < ikiBoyutluDizi.length; i++) {
			for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
				toplam += ikiBoyutluDizi[j][i];

			}
			System.out.println(i + 1 + ". sutunun toplamı = " + toplam);
			toplam = 0;
		}

	}

	private static void dizininHangiSatırınınToplamıDahaBüyüktür(int[][] ikiBoyutluDizi) {
		int enBüyükToplamSatır = 0;
		int satırToplamı = 0;
		int kaçıncıSatır = 0;
		for (int satır = 0; satır < ikiBoyutluDizi.length; satır++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi.length; sütun++) {
				satırToplamı += ikiBoyutluDizi[satır][sütun];
			}
			if (enBüyükToplamSatır < satırToplamı) {
				enBüyükToplamSatır = satırToplamı;
				kaçıncıSatır = satır + 1;
			}
			satırToplamı = 0;

		}
		System.out.println("Satır toplamlarının en Büyüğü " + kaçıncıSatır + ". satırdır ve toplamı : " + enBüyükToplamSatır);
	}
	
	private static void ikiBoyutluDiziyiKar(int[][] ikiBoyutluDizi) {
		for (int satır = 0; satır < ikiBoyutluDizi.length; satır++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satır].length; sütun++) {
				int rassalSatır = (int)(Math.random() * ikiBoyutluDizi.length);
				int rassalSütun = (int)(Math.random() * ikiBoyutluDizi[satır].length);
				
				int geçici = ikiBoyutluDizi[satır][sütun];
				ikiBoyutluDizi[satır][sütun] = ikiBoyutluDizi[rassalSatır][rassalSütun];
				ikiBoyutluDizi[rassalSatır][rassalSütun] = geçici;
				
				
			}		
		}
		
	}
}
