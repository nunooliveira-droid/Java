/*
    Assignment Operators
        =	x = 5	x = 5	
        +=	x += 3	x = x + 3	
        -=	x -= 3	x = x - 3	
        *=	x *= 3	x = x * 3	
        /=	x /= 3	x = x / 3	
        %=	x %= 3	x = x % 3	

        ***Performs bitwise AND between x and 3 ***
        &=	x &= 3	x = x & 3	

        ***Performs bitwise OR between x and 3 ***
        |=	x |= 3	x = x | 3	

        ***Performs bitwise XOR between x and 3 ***
        ^=	x ^= 3	x = x ^ 3	

        ***Shifts the bits of x right by 3 positions.***
        >>=	x >>= 3	x = x >> 3	

        Shifts the bits of x left by 3 positions.
        <<=	x <<= 3	x = x << 3
*/


public class Assignment{
    public static void main(String[] args){
        int x = 5;

        System.out.println("X : " + x);
        System.out.println("X bitwise AND: " + ( x &= 3 ));
        x = 5;
        System.out.println("X bitwise OR: " + ( x |= 3 ));
        x = 5;
        System.out.println("X bitwise XOR: " + ( x ^= 3 ));
        x = 5;
        System.out.println("X shift bits to right: " + ( x >>= 3 ));
        x = 5;
        System.out.println("X shift bits to left: " + ( x <<= 3 ));
    }
}