public class ImplicitAndExplicitCasting {
    public static void main(String[] args) {
        int money = 1000;
        double weight = 65.5;

        //Implicit Casting
        double dMoney = money;
        System.out.println("Gia tri cua money:100 sau khi doi sang double\t" + dMoney);

        //Explicit Casting
        int iWeight = (int) weight;
        System.out.println("Gia tri cua weight: 65.5 sau khi doi sang int\t" + iWeight);
    }
}
