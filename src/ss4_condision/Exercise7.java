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

        int baseSalary = 650000;
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

        double salary = coefficient * baseSalary;
        System.out.printf("Lương của nhân viên dựa theo thâm niên " + seniority + " tháng là: " + salary);
    }
}
