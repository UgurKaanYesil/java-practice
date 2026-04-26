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
    }
}