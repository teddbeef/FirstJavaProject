import java.util.Scanner;

public class TinhDienTichVaChuViHinhVuong {
    public static void main(String[] args) {
        float a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        a = scan.nextFloat();

        float dienTich = a * a;
        System.out.println("Dien tich hinh vuong = " + dienTich);

        float chuVi = a * 4;
        System.out.println("Chu vi hinh vuong = " + chuVi);
    }
}
