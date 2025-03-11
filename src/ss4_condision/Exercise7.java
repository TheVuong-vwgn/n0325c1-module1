package ss4_condision;

import java.util.Scanner;

/**
 * Tính lương nhân viên theo thâm niên công tác
 */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập thâm niên công tác: ");
        int seniority = scanner.nextInt();

        // final là hằng số không thây đổi
        // Quy tắc đặt tên cho hằng là viết hoa tất cả chử cái đầu BaseSalary
        final int BaseSalary = 650000;
        double coefficient;

        if (seniority < 12) {
            coefficient = 1.92;
        } else if (seniority < 32) {
            coefficient = 2.34;
        } else if (seniority < 60) {
            coefficient = 3;
        } else {
            coefficient = 4.5;
        }

        double salary = coefficient * BaseSalary;
        System.out.printf("Lương của nhân viên dựa theo thâm niên " + seniority + " tháng là: " + salary);
    }
}
