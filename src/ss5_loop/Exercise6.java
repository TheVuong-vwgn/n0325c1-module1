package ss5_loop;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int distance = 1; // tạo khoảng cách giữa số âm
        int cout = 0; // biến đếm số lần in

        for (int i = 2; i <= n; i += 2) {
            if (cout == distance) {
                System.out.print(-i + "\t ");
                cout = 0;
                distance++;
            } else {
                System.out.print(i + "\t ");
                cout++;
            }
        }
    }
}
