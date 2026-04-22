import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alışveriş tutarınız nedir? ");

        double miktar = scanner.nextDouble(); // Küçük harfli 'double' kullanmak daha yaygındır

        if (miktar >= 500) {
            // %20 indirim uyguluyoruz, yani %80'ini ödetiyoruz.
            miktar = miktar * 0.80;
            System.out.println("Tebrikler! %20 indirim kazandınız.");
            System.out.println("Ödemeniz gereken tutar: " + miktar + " TL");
        }
        else {
            System.out.println("Maalesef indirim kazanamadınız.");
            // Bonus: Ne kadar daha harcaması gerektiğini de hesaplayabilirsin:
            double eksik = 500 - miktar;
            System.out.println(eksik + " TL daha harcarsanız indirim kazanabilirsiniz!");
        }

        scanner.close();
    }
}