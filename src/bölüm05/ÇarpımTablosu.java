package b�l�m05;

public class �arp�mTablosu {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t�arp�m tablosu");
		for (int i = 1; i < 10; i++) {
			System.out.print("\t " + i);
			
		}
		System.out.println("\n---------------------------------------------------------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("\t%2d", i * j);//Sa�a dayamak i�in yaz�ld� ama tam anlamad�m.
			}
			System.out.println();
			
		}
         
	}

}
