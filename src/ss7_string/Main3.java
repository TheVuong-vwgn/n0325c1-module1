package ss7_string;

public class Main3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30}; // địa chỉ: oxabc1234 giá trị: oxabc2345

        changeData(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t"); // 10 99 30
        }
    }

    static void changeData(int[] arr) {
        arr[1] = 99; // địa chỉ: oxabc1234 giá trị: oxabc2345
        arr = new int[] {9, 9, 9}; // địa chỉ: oxabc7891 giá trị: oxabc8910
        arr[1] = 100; //  địa chỉ: oxabc7891 giá trị: oxabc8910
    }
}
