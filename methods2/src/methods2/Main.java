package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="BUGUN HAVA COK GÜZEL";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayi =topla(5,7);
		String sehir = sehirVer();
		System.out.println(sayi);
		int toplam= topla2(2,3,4,5,6);
		System.out.println(toplam);
		
	}
	
	// void operasyonlar: bir þeyin yapýlmasý istenildiðinde
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	// return eden operasyonlar
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	//variable arguments
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for (int sayi: sayilar ) {
			toplam=toplam+sayi;
		}
		return toplam;
		
	}
	

}
