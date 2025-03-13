package ss6_method;

public class Main1 {
    public static void main(String[] args) {
        // tính tổng 2 số a và b sử dụng method
        int a = 1;
        int b = 2;
        int c = 3;

        //cách 1:
        calTotal(a, b);

        //Cách 2:
        int total = calTotal2(a, b);
        total = calTotal2(a, b) + c;
        System.out.println("Total: " + total);
    }

    public static void calTotal(int a, int b) {
        int total = a + b;
        System.out.println("Total: " + total);
    }

    public static int calTotal2(int a, int b) {
        int total = a + b;
        return total;
    }
}
