import java.util.Scanner;

public class HienThiThangTuongUng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scan.nextInt();
        String resultMonth = "";

        switch (month) {
            case 1:
                resultMonth = "January";
                break;
            case 2:
                resultMonth = "February";
                break;
            case 3:
                resultMonth = "March";
                break;
            case 4:
                resultMonth = "April";
                break;
            case 5:
                resultMonth = "May";
                break;
            case 6:
                resultMonth = "June";
                break;
            case 7:
                resultMonth = "July";
                break;
            case 8:
                resultMonth = "August";
                break;
            case 9:
                resultMonth = "September";
                break;
            case 10:
                resultMonth = "October";
                break;
            case 11:
                resultMonth = "November";
                break;
            case 12:
                resultMonth = "December";
                break;
            default:
                System.out.println("Must enter number from 1 - 12");
        }
        System.out.println(resultMonth);
    }
}
