import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int minNumber = firstNumber; //gán giá trị firstnumber cho minNumber

        /*
         * So sánh firstNumber với secondNumber
         * Nếu firstNumber lớn hơn secondNumber thì sẽ gán giá trị của secondNumber cho minNumber
         * Còn không thì không làm gì cả và kết thúc câu lệnh điều khiển.
         */
        if (firstNumber > secondNumber)
            minNumber = secondNumber;
        System.out.println("Between 2 numbers " + firstNumber + " and " + secondNumber +
                ". The smallest number is " + minNumber);
    }
}
