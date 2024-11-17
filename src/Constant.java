public class Constant {
    /* Khai báo hằng số
    - [Phạm vi truy cập] static final [kiểu dữ liệu] [tên hằng số] = [giá trị];
    - Khai báo hằng số là VIẾT HOA và là giá trị không đổi
    - Khai báo ở ngoài hàm main
     */
    public static final int HOUR_OF_DAY = 24;
    public static final String FULL_NAME = "Tedd Nguyen";

    public static void main(String[] args) {
        System.out.println("Total time of a day is:\t" + HOUR_OF_DAY);
        System.out.println("My full name is:\t" + FULL_NAME);

    }
}
