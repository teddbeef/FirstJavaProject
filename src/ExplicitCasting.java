public class ExplicitCasting {
    public static void main(String[] args) {
        /*
            Ép kiểu hẹp / từ giá trị lớn xuống nhỏ
            double > float > long > int > short > byte
         */
        double d = 100.004;
        float f = (float) d;
        long l = (long) f;
        int i = (int) f;
        System.out.println("Gia tri cua double\t" + d);
        System.out.println("Gia tri cua float\t" + f);
        System.out.println("Gia tri cua long\t" + l);
        System.out.println("Gia tri cua integer\t" + i);
    }
}
