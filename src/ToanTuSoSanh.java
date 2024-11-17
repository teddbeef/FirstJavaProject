import java.util.Scanner;

public class ToanTuSoSanh {
    public static void main(String[] args) {
        /*
         So sánh giá trị của toán hạng bên trái và toán hạng bên phải có bằng nhau hay không.
         Nếu có thì kết quả trả về true, ngược lại trả về false.
         */

        int num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scan.nextInt();
        System.out.print("Enter second number:");
        num2 = scan.nextInt();

        System.out.println("Ket qua gia tri hai so " + num1 + " va " + num2 + " la bang nhau " + (num1 == num2));
        System.out.println("Ket qua gia tri hai so " + num1 + " va " + num2 + " la khac nhau " + (num1 != num2));
        System.out.println("Ket qua gia tri hai so Number 1 = " + num1 + " lon hon Number 2 = " + num2 + " " + (num1 > num2));
        System.out.println("Ket qua gia tri Number 1 = " + num1 + " lon hon hoac bang Number 2 = " + num2 + " " + (num1 >= num2));
        System.out.println("Ket qua gia tri hai so " + num1 + " nho hon Number 2 = " + num2 + " " + (num1 < num2));
        System.out.println("Ket qua gia tri Number 1 = " + num1 + " nho  hon hoac bang Number 2 = " + num2 + " " + (num1 <= num2));

    }

}
