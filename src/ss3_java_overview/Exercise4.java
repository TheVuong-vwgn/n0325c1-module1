package ss3_java_overview;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập hệ số môn toán: ");
        double math = scanner.nextDouble();

        System.out.print("Nhập điểm môn lý: ");
        double physScore = scanner.nextDouble();

        System.out.print("Nhập hệ số môn lý: ");
        double phys = scanner.nextDouble();

        System.out.print("Nhập điểm môn hóa: ");
        double chemScore = scanner.nextDouble();

        System.out.print("Nhập hệ số môn hóa: ");
        double chem = scanner.nextDouble();

        double gpa = (mathScore * math + physScore * phys + chemScore * chem) / (math + phys + chem);

        System.out.println("Điểm trung bình toán, lý, hóa là:" + gpa);
    }
}
