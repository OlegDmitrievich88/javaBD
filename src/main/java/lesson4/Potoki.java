package lesson4;

public class Potoki {
    public static void main(String[] args){
        Potoki p = new Potoki(); // объект синхронизации
    }

    private static void c() {
        System.out.println("C");
    }

    private static void b() {
        System.out.println("B");
    }

    private static void a() {
        System.out.println("A");
    }
}
