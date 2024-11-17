import java.util.Scanner;

public class ToanTuDieuKien3Ngoi {
    /*
  [Biểu thức điều kiện] ? [Giá trị 1] : [Giá trị 2];
  nếu biểu thức này trả về giá trị đúng thì biểu thức giá trị 1 được tính toán và trở thành giá trị của biểu thức,
  nếu biểu thức điều kiện trả về giá trị sai thì biểu thức giá trị 1 được tính toán và trở thành giá trị của biểu thức.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int number = scan.nextInt();

        String ketQua = (number % 2 == 0) ? "So " + number + " la so chan" : "So " + number + " la so le";
        System.out.println(ketQua);

    }
}
