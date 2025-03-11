package ss5_loop;

/**
 * Tìm các số thỏa mảng điều kiện tích 2 chữ số bằng 2 lần tổng của 2 chữ số đó
 */

public class Exercise23 {
    public static void main(String[] args) {
        System.out.println("Số thõa mãn điều kiện là : ");

        for (int i = 10; i <= 99; i++) {

            int oneDigit = i % 10;
            int tenDigit = i / 10;

            int sum = oneDigit + tenDigit;
            int product = oneDigit * tenDigit;

            if (sum * 2 == product) {
                System.out.print(i + "\t");
            }
        }
    }
}
