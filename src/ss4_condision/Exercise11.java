package ss4_condision;

import java.util.Scanner;

/**
 * Kiểm tra và tìm ngày kế tiếp, ngày trước đó ?
 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ!!");
            return; // Kết thúc phương thức main => dừng chương trình
        }

        System.out.print("Nhập tháng(1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ!!");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ!!");
                return;
            }
        }

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        //năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ!!");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ!!");
                    return;
                }
            }
        }

        System.out.println("Ngày hợp lệ!!");

        //Tìm ngày kế tiếp
        int nextDay; // tạo biến tạm để không ảnh hưởng đến ngày gốc
        nextDay = day;
        int nextMonth;
        nextMonth = month;
        int nextYear;
        nextYear = year;

        //Ngày kế tiếp
        nextDay++;

        //Trường hợp qua tháng mới
        if (nextDay > 31 // tháng 31 ngày
                || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) // tháng 2
                || (month == 4 || month == 6 || month == 9 || month == 11) // tháng 30 ngày
        ) {
            nextDay = 1;
            nextMonth++;
        }

        //Trường hợp qua năm mới
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Ngày kế tiếp Ngày %d Tháng %d Năm %d là: Ngày %d Tháng %d Năm %d"
                , day, month, year, nextDay, nextMonth, nextYear);

        //Tìm ngày kế tiếp
        int previousDay; // tạo biến tạm để không ảnh hưởng đến ngày gốc
        previousDay = day;
        int previousMonth;
        previousMonth = month;
        int previousYear;
        previousYear = year;

        //Ngày kế tiếp
        previousDay--;

        //Trường hợp quay lại tháng trước đó
        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) { //Trường hợp quay lại năm trước đó
                previousMonth = 12;
                previousYear--;
            }

            //Trường hợp quay lại tháng có 30 ngày
            if (previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11) {
                previousDay = 30;
            } else if (previousMonth == 2) { // //Trường hợp quay lại vào tháng 2
                if (isLeapYear) {
                    previousDay = 29;
                } else {
                    previousDay = 28;
                }
            } else { // Trường hợp quay lại tháng có 31 ngày
                previousDay = 31;
            }
        }
        System.out.println();
        System.out.printf("Ngày trước Ngày %d Tháng %d Năm %d là: Ngày %d Tháng %d Năm %d"
                , day, month, year, previousDay, previousMonth, previousYear);
    }
}
