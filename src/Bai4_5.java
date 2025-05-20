import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;

class DateException extends Exception {

    public DateException() {
        super();
    }

    public DateException(String message) {
        super(message);
    }

    public DateException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Bai4_5 {
    public static void main(String[] args) {
        System.out.print("Nhap ngay thang nam(dd/MM/yyyy): ");
        String ngaythangnam = new Scanner(System.in).nextLine();
        try{ //Thử kiểm tra ngaythangnam chuyển sang date được không
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(ngaythangnam); //Sau khi nhập xong nếu không đúng mẫu chuyển thì chuyển sang catch
            System.out.println(ngaythangnam);
        }catch (ParseException p){ //Lệnh catch này chạy khi chuyển sang Date không đúng mẫu
            System.out.println(p);
        }
    }
}
