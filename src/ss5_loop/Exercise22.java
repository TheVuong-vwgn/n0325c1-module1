package ss5_loop;

import java.util.Scanner;

/**
 *  Đếm và tính tổng các số đối xứng, chính phương, nguyên tố trong đoạn [a, b]
 */

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        do {
            System.out.print("Nhập số nguyên dương a: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (a > 0), vui lòng nhập lại!!!");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập số nguyên dương b: ");
            b = scanner.nextInt();

            if (b <= 0 || b < a) {
                System.out.println("Bạn hãy nhập số nguyên dương (b > 0 && b > a), vui lòng nhập lại!!!");
            }
        } while (b <= 0 || b < a);

        int soLuongSoDoiXung = 0;
        int tongSoDoiXung = 0;

        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soLuongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;

        for (int n = a; n <= b; n++) {

            String s = Integer.toString(n);
            boolean flag = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                soLuongSoDoiXung++;
                tongSoDoiXung += n;
            }

            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }

            if (n < 2) {
                flag = false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                soLuongSoNguyenTo++;
                tongSoNguyenTo += n;
            }
        }

        System.out.printf("Số lượng số đối xứng trong đoạn [%d , %d] là %d\n", a, b, soLuongSoDoiXung);
        System.out.printf("Tổng số đối xứng trong đoạn [%d , %d] là %d\n", a, b, tongSoDoiXung);
        System.out.printf("Số lượng số chính phương trong đoạn [%d , %d] là %d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tổng số chính phương trong đoạn [%d , %d] là %d\n", a, b, tongSoChinhPhuong);
        System.out.printf("Số lượng số nguyên tố trong đoạn [%d , %d] là %d\n", a, b, soLuongSoNguyenTo);
        System.out.printf("Tổng số nguyên tố trong đoạn [%d , %d] là %d\n", a, b, tongSoNguyenTo);
    }
}
