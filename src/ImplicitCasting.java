public class ImplicitCasting {
    public static void main(String[] args) {
        /*Ép kiểu rộng/ Ép kiểu không tường minh
          byte > shrot > int > long > float >double
         */
        int i = 100;
        long l = i; //change integer to long
        float f = l; //change long to float
        double d = l; //change float to double
        System.out.println("Value of int\t"+i);
        System.out.println("Value of long\t"+l);
        System.out.println("Value of float\t"+f);
        System.out.println("Value of double\t"+d);
    }
}
