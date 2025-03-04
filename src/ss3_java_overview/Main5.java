package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 2;
        // System.in: tieu chuan de nhap du lieu nhap tu ban phim
        Scanner scanner = new Scanner(System.in);
        // nếu nhập tuổi trước vidu nhập 18 enter để xuống dòng nó sẽ lưu vào biến age
        // sau đó xuống nhập chuổi nextline nó sẽ kiểm tra xem có dưx liệu không (enter)
        // nên sẽ không nhập được tên khi nhập tuổi trước
        // khắc phục dùng scanner.nextline xóa toàn bộ dulieu trong boọ nhớ đệm
        // dùng hết nextline
        System.out.print("Nhập vào tên của bạn:");
        String name = scanner.nextLine();

        System.out.print("Nhập vào tuổi của bạn: ");
        //Integer.parseInt(scanner.nextLine()) ép kiểu nextline sang int
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);

    }
}
