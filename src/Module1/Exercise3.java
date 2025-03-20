package Module1;

import java.util.Scanner;

public class Exercise3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi ký tự: ");
        String s = scanner.nextLine();
        isCout(s);

        int  cout = isCout(s);

        if (cout > 0) {
            System.out.println(cout);
        } else {
            System.out.println("Chuỗi không chứa ký tự in hoa");
        }
    }
    static int isCout(String s) {
        int cout = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                cout++;
            }
        }
        return cout;
    }
}
