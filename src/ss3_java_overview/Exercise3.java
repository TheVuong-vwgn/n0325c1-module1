package ss3_java_overview;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String product = scanner.nextLine();

        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = scanner.nextInt();

        System.out.print("Nhập đơn giá sản phẩm: ");
        double price = scanner.nextDouble();

        double amount = quantity * price;
        double tax = (amount * 10) / 100;

        System.out.println("Tên sản phảm là: " + product);
        System.out.println("Tổng tiền là: " + amount);
        System.out.println("Thuế phải trả là: " + tax);
    }
}
