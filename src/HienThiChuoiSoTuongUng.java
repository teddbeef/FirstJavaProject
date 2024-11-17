import java.util.Scanner;

public class HienThiChuoiSoTuongUng {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scan.nextInt();

        switch (number) {
            case 0:
                System.out.println("So 0");
                break;
            case 1:
            case 2:
                System.out.println("So Nho");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("So Trung Binh");
                break;
            default:
                System.out.println("So Lon");
        }
    }
}
