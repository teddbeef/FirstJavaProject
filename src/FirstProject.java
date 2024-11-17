import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        String name;
        System.out.print("Enter your Name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        //Print string name
        System.out.print("Good luck to you " + name + " ^_^");
    }
}
