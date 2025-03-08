package ss3_java_overview;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biển số xe của bạn: ");
        int i = scanner.nextInt();

        int sum = i % 10; // lấy đc số hàng đơn vị
        i /= 10; // các số còn lại trừ số đã lấy
        //System.out.println(sum + " "+ i);
        sum += i % 10;
        i /= 10;

        sum += i % 10;
        i /= 10;

        sum += i % 10;
        i /= 10;

        sum += i;

        int point = sum % 10;
        System.out.println("Số nút biển số xe bạn là: " + point);
    }
}
