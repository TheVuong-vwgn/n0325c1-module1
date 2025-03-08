package ss4_condision;

import java.util.Scanner;

/*
    Dịch số thành tiếng anh ?
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhập vào số tự nhiên 1 > 10: ");
        int number = scanner.nextInt();

        if (number <= 0 || number > 10) {
            System.out.println("Hãy nhập số từ 1 đến 10!!!");
        }
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nice");
        } else {
            System.out.println("Ten");
        }
    }
}
