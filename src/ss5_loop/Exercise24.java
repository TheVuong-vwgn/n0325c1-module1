package ss5_loop;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền khách thanh toán: ");
        int payment = scanner.nextInt();

        System.out.print("Nhập số giá sản phẩm: ");
        int price = scanner.nextInt();

        if (payment < price) {
            System.out.println("Số tiền khách đưa không đủ để thanh toán.");
            return;
        }

        int change = payment - price;
        int denomination;

        for (int i = 2; i >= 0; i--) {
            int coefficient = (int) Math.pow(10, i);

            denomination = 5000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d tờ %d\n", change / denomination, denomination);
                change %= denomination;
            }

            denomination = 2000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d tờ %d\n", change / denomination, denomination);
                change %= denomination;
            }

            denomination = 1000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d tờ %d\n", change / denomination, denomination);
                change %= denomination;
            }
        }
        System.out.println("Số tiền thối lại: " + change);
    }
}
