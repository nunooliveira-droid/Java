/*
When a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.

Order of Operations
    () - Parentheses
    *, /, % - Multiplication, Division, Modulus
    +, - - Addition, Subtraction
    >, <, >=, <= - Comparison
    ==, != - Equality
    && - Logical AND
    || - Logical OR
    = - Assignment
 */

public class Precedence{
    public static void main(String[] args) {
        int x = ( 2 + 2 ) * 2;
        System.out.println("Result: " + x);
    }
}