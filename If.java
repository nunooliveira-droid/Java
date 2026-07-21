import java.util.Scanner;

public class If{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it rainning(true or false) ?");

        boolean rain = myObj.nextBoolean();

        if(rain){
            System.out.println("It is rainning");
        }else{
            System.out.println("It's not rainning");
        }
    }
}