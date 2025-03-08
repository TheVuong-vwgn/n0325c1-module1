package ss4_condision;

import java.util.Scanner;

/*
    Dịch số thành tiếng anh ?
 */

public class Exercise2Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhập vào số tự nhiên 1 > 10: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("One"); // -> = : và break
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nice");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Hãy nhập số từ 1 đến 10!!!");
        }
    }
}
