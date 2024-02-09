import java.util.Scanner;

public class A32_Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("First number after swap: " + x);
        System.out.println("Second number after swap: " + y);
    }
}
