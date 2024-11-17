import java.util.Scanner;

public class ToanTuLuanLyDieuKien {
    /*
       Độ ưu tiên giữa các toán tử
       1. toán tử 1 ngôi: +, -, ++, --
       2. toán tử số học: *, /, +, -
       3. các toán tử: >, <, >=, <=, ==, !=
       4. Các toán tử luận lý điều kiện: &&, ||, ?:
       5. Các toán tử gán: =, *=, /=, +=, -=
     */
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = scan.nextInt();

        //Su dung toan tu luan ly dieu kien
        System.out.println("First number < 10 && Second number > 10 " + ((firstNumber < 10)&&(secondNumber > 10)));
        System.out.println("First number < 10 || Second number > 10 " + ((firstNumber < 10)||(secondNumber > 10)));
    }
}
