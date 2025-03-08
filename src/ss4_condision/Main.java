package ss4_condision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i+ " \t ");
        }
    }
}
