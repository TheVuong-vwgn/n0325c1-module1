package ss4_condision;

import java.util.Scanner;

/**
 * Tìm giá trị biến c và d ?
 */

public class Exercise1 {
    public static void main(String[] args) {
        boolean a = true && false; // && hai vế điều đúng thì đúng => a = false
        boolean b = (3 > 100) || (25 % 5 == 0); // || một trong hai vế đúng thì đúng => b = true
        boolean c = a && b; // c = false && true => c = false
        boolean d = !a || b; // d = true || true => c = true

        System.out.println("a = " + a + "\t" + "b = " + b + "\t" + "c = " + c + "\t" + "d = " + d);
    }
}
