import java.util.Scanner;

public class A23_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);

        int total_Marks = marks1 + marks2 + marks3;

        System.out.println("Total marks: " + total_Marks);

        int percentage = (total_Marks) / 3;

        System.out.println("Percentage marks: " + percentage + "%");
    }
}
