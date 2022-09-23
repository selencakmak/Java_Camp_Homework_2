package methods;

public class Main {

	public static void main(String[] args) {
        sayiBulmaca();
    }

    //camel casing
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayý Mevcut" + aranacak);
        } else {
            System.out.println("Sayý Mevcut Deðildir" + aranacak);
        }
    }

    public static void mesjVer(String mesaj) {
        System.out.println(mesaj);
    }
}
