package ss5_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            int n = 5;
//            for (int i = 1; i <= n; i++){// vòng lặp cha
//                // ứng với 1 bước lặp của cha => toàn bộ bước lặp của con
//                // i = 1 => 5 lần hello
//                // i = 2 => 5 lần hello
//                // i = 3 => 5 lần hello
//                // i = 4 => 5 lần hello
//                // i = 5 => 5 lần hello
//                for (int j = 1; j <= n; j++){// vòng lặp con
//                    System.out.println("Hello");
//                }
//            }
        Scanner scanner = new Scanner(System.in);

        int age;
        boolean isValidAge;
        do {
            System.out.println("Nhập tuổi của bạn: ");
            age = scanner.nextInt();
            isValidAge = age < 0 || age > 120;
            System.out.println("Giá trị của bạn nhập không hợp lệ, vui lòng nhập lại!!!");
         } while (isValidAge);
    }
}
