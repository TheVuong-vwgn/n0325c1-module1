package ss4_condision;

import java.util.Scanner;

/**
 * Tính ngày trong 1 thangs ?
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng(1-12): ");
        int month = scanner.nextInt();
        if (month < 0 || month > 12) {
            System.out.println("Tháng nhập vào không hợp lệ, xin kiểm tra lại!!!");
            return; // kết thúc phương thức
        }

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        int dayInMonth;

        switch (month) {
            case 4, 6, 9, 11:
                dayInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    dayInMonth = 29; // năm nhuận
                } else {
                    dayInMonth = 28; // năm không nhuận
                }
                break;
            default:
                dayInMonth = 31;
        }

        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày", month, year, dayInMonth);
    }
}
