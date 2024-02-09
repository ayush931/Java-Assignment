import java.util.Scanner;

public class A21_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_name = sc.next();
        String last_name = sc.next();
        int Roll_number = sc.nextInt();
        String Field_of_Interest = sc.next();

        System.out.println("Name " + first_name + " " + last_name);
        System.out.println("Roll Number: " + Roll_number);
        System.out.println("Field of Interest: " + Field_of_Interest);
    }
}
