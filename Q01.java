import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Maximum = " + a);
        else
            System.out.println("Maximum = " + b);
    }
}