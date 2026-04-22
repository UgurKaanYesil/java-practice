import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava kaç derece? "); // println yerine print daha şık durur

        int derece = scanner.nextInt();

        if (derece < 15) {
            System.out.println("Ceketini almayı unutma");
        }
        else if (derece >= 15 && derece <= 25) { // Düzeltilen kısım burası
            System.out.println("Hava harika, bir tişört yeterli");
        }
        else {
            System.out.println("Çok sıcak, bol su iç!");
        }

        scanner.close(); // Kapıyı kapatmayı unutmayalım :)

    }
}