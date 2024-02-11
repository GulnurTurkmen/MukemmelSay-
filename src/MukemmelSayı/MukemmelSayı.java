package MukemmelSayı;
import java.util.Scanner;
public class MukemmelSayı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Mükemmel sayı olup olmadığını kontrol etme
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Sonucu yazdırma
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}