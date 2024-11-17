import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhDienTichVaTheTichHinhCau {
    /*
    Thể tích = (4/3) * PI * r3.
    Diện tích bề mặt = 4 * PI * r2.
     */
    public static final float PI = 3.14f;

    public static void main(String[] args) {
        // Khai báo lớp DecimalFormat dùng để định dạng số
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = scan.nextFloat();

        //Tính Diện tích bề mặt hình cầu
        float area = 4 * PI * radius * radius;
        System.out.println("Diện tích bề mặt cầu = " + decimalFormat.format(area));

        /*
         *  Tính thể tích hình cầu
         *  Lưu ý phải ép kiểu kết quả của 4/3 về số thực nếu không sẽ dẫn đến sai kết quả
         */
        //Tính Thể tích hình cầu
        float vol = (float)4/3 * PI * radius * radius * radius;
        System.out.println("Thể tích hình cầu = " + decimalFormat.format(vol));

    }
}
