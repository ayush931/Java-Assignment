public class A15_Assignment {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        System.out.println("The first number before swap is: " + num1);
        System.out.println("The second number before swap is: " + num2);

        int swap; // To swap two number.

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("The first number after swap is: " + num1);
        System.out.println("The second number after swap is: " + num2);
    }
}
