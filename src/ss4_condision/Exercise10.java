package ss4_condision;

import java.util.Scanner;

/**
 * Kiểm tra số chính phương ?
 */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int x = scanner.nextInt();

        double perfectSquare = Math.sqrt(x);

        if (perfectSquare % 1 == 0) {
            System.out.println(x + " là số chính phương!!");
        } else {
            System.out.println(x + " không phải là số chính phương!!");
        }
    }
}
