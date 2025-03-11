package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số chẳn 2 -> n có giá trị âm dương xen kẻ cách 2 số thì đến số âm 2,4,-6,...
 */

public class Exercise4Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int distance = 3; // tạo khoảng cách cố định
        int count = 0;

        for (int i = 2; i <= n; i += 2) {

            count++; // tăng cout lên 1 đơn vị

            if (count == distance) {
                // nếu count = distance = 3 thì in giá trị âm và đặt cout về 0
                System.out.print(-i + "\t");
                count = 0;
            } else
                System.out.print(i + "\t");
        }
    }
}
