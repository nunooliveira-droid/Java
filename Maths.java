import java.util.Scanner;

public class Maths{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the fist number: ");

        int num1 = myObj.nextInt();

        System.out.println("Enter the second number: ");

        int num2 = myObj.nextInt();

        int min = Math.min(num1, num2);

        int max = Math.max(num1, num2);

        double sqrt = Math.sqrt(num1);

        int abs = Math.abs(num1);

        double pow = Math.pow(num1, num2);

        System.out.println("The lowest number is: " + min);

        System.out.println("The higest number is: " + max);

        System.out.println("The square root of the fist number is: " + sqrt);

        System.out.println("The absolute of fist number: " + abs);

        System.out.println(num1 + " powers " + num2 + " = " + pow);

        System.out.println("random number: " + ((int) (Math.random() * 101)));
    }
}