package ss5_loop;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int distance = 1;
        int count = 0;

        for (int i = 2; i <= n; i += 2) {
            if ( count == distance) {
                System.out.println(-i + "\t");
                count = 0;
                distance++;
            } else {
                System.out.println(i + "\t");
                count++;
            }
        }
    }
}
