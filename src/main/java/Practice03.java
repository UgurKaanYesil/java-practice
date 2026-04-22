import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt(); // Türkçe karakteri düzelttik

        System.out.print("Sınav notunuzu giriniz: ");
        int sinavNotu = scanner.nextInt();

        if (yas >= 18) {
            // Yaş tutuyorsa notu kontrol et
            if (sinavNotu >= 70) {
                System.out.println("Tebrikler, ehliyet alabilirsiniz!");
            } else {
                System.out.println("Yaşınız uygun ama puanınız düşük.");
            }
        } else {
            // Yaş tutmuyorsa notun ne olduğu önemli değil
            System.out.println("Maalesef yaşınız henüz ehliyet için uygun değil.");
        }

        scanner.close();
    }
}