import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap x: ");

        try { //Thử nhập x y tu bàn phím xem có chạy hay lỗi
            int x = scanner.nextInt();
            System.out.print("Nhap y: ");
            int y = scanner.nextInt();
            if (2 * x + 7 * y == 0) {
                throw new ArithmeticException("Loi mau = 0");  //chúng ta cho throw vào để kiểm tra mẫu = 0 hay không nếu không thì sẽ hiện thị dòng này
            }
            double t = Math.sqrt((double) (5 * x - y) / (2 * x + 7 * y));
            System.out.println("KQ: " + t);
        } catch (InputMismatchException e) { // catch này sẽ chạy khi nhập x y không phải là số nguyên
            System.out.println("Lỗi nhap sai (yêu cầu nhập số nguyên)");
        }
    }
}