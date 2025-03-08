package ss4_condision;

import java.util.Scanner;

/**
 * Đổi chữ hoa thành chữ thường và ngược lại ?
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự chữ cái: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if (character >= 'a') {
                character -= 32;
            } else {
                character += 32;
            }
            System.out.println("Ký tự sau khi đổi là: " + character);
        } else {
            System.out.println("Nhập sai, hãy nhập ký tự chữ cái");
        }
    }
}
