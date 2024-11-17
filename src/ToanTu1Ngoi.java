public class ToanTu1Ngoi {
    public static void main(String[] args) {
        /*
            Prefix (tiền tố) ++a --a và Postfix (hậu tố) a++ a--

            Postfix: chuyển giá trị hiện tại của i cho hàm và sau đó tăng nó.
            Prefix : tăng giá trị hiện tại và sau đó chuyển nó vào hàm.
         */

        int firstPrefix = 5;
        int secondPostfix = 7;

        int result = firstPrefix++ + ++secondPostfix -8;

        System.out.println("FRIST Prefix:\t" + firstPrefix);
        System.out.println("SECOND Postfix:\t" + secondPostfix);
        System.out.println("RESULT:\t" + result);

        /*
            Bước 1: Ưu tiên xử lý Prefix trước.
            Bước 2: Xử lý các phép toán còn lại.
            Bước 3: Gán giá trị cho toán hạng nằm bên trái dấu bằng trước.
            Bước 4: Xử lý Postfix.
         */
    }
}
