package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp năm sinh của bạn: ");
        int year = scanner.nextInt();
          int age = Year.now().getValue() - year;
          // int age = 2025 - year;

        System.out.println("Tuổi của bạn là: " + age);
    }   // How to .... in java
}
