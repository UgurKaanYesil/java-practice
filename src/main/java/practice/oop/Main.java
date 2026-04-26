package practice.oop;

public class Main {
    public static void main(String[] args) {
        person p1 = new person("Kaan", 25, "kaan@gmail.com");
        person p2 = new person("Ayşe", 30, "ayse@gmail.com");
        person p3 = new person("Mehmet", 22, "mehmet@gmail.com");

        p1.introduce();
        p2.introduce();
        p3.introduce();

        p1.setEmail("kaan.yesil@gmail.com");
        System.out.println(p1);

        // BankAccount test
        BankAccount account = new BankAccount("TR123456", "Kaan Yeşil", 0.0);

        account.deposit(1000);
        System.out.println("After deposit 1000: " + account.getBalance());

        account.withdraw(300);
        System.out.println("After withdraw 300: " + account.getBalance());

        account.withdraw(5000);

        System.out.println("Final balance: " + account.getBalance());
        System.out.println(account);

        // Rectangle test
        Rectangle r1 = new Rectangle(4.0, 6.0);
        Rectangle r2 = new Rectangle(5.0, 5.0);
        Rectangle r3 = new Rectangle(3.0, 8.0);
        Rectangle r4 = new Rectangle(7.0, 7.0);

        Rectangle[] rectangles = {r1, r2, r3, r4};
        for (Rectangle r : rectangles) {
            System.out.println(r + " | Area: " + r.calculateArea()
                    + " | Perimeter: " + r.calculatePerimeter()
                    + " | Square: " + r.isSquare());
        }
    }
}