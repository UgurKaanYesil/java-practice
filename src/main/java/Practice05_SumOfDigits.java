import java.util.Scanner;

public class Practice05_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int orjinalSayi = sayi;
        int toplam = 0;

        while (sayi > 0) {
            int rakam = sayi % 10;
            toplam += rakam;
            sayi = sayi / 10;
        }

        System.out.println(orjinalSayi + " sayısının rakamları toplamı: " + toplam);

        scanner.close();
    }
}