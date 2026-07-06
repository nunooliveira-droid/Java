/*
    +	Addition	Adds together two values	x + y	
    -	Subtraction	Subtracts one value from another	x - y	
    *	Multiplication	Multiplies two values	x * y	
    /	Division	Divides one value by another	x / y	
    %	Modulus	Returns the division remainder	x % y	
    ++	Increment	Increases the value of a variable by 1	++x	
    --	Decrement	Decreases the value of a variable by 1 --x
*/

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 14;
        

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        num1++;
        System.out.println("Increment number 1: " + num1);
        num2--;
        System.out.println("Decrement number 2: " + num2);
    }
}