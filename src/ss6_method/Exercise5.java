package ss6_method;

import java.util.Scanner;

/**
 * In n phần tử dãy Fibonacci
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n phần tử: ");
        int n = scanner.nextInt();

        System.out.printf("Có %d phần tử của dãy Fibonacci là: ",n);
        fibonacci(n);

    }
    public static void fibonacci(int n){
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print( f1 + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
