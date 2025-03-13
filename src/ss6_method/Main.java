package ss6_method;

public class Main {
    public static void main(String[] args) {
        hello("vuong");
        hello("Hai");
        hello("Hai");
    }

    public static void  hello(String name) { // truyền tham số
        System.out.printf("hello %s!!!\n", name);
    }
}
